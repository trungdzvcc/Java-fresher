package Day8.Excercise.Controller;

import Day8.Excercise.Interface.InterfaceProduct;
import Day8.Excercise.Model.Product;
import Day8.Excercise.Validate.ValidateData;
import Day8.Excercise.View.ViewProduct;

import java.util.*;

import static EXAM2.CONTROLLER.StudentController.scanner;

public class ControllerProduct  implements InterfaceProduct {
    ViewProduct view = new ViewProduct();
    List<Product> productlist = new ArrayList<Product>();
    ValidateData validate = new ValidateData();

    public void enterChoice() {
        while (true) {
            view.showMenu();
            boolean exit= false;
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    sortIncease();
                    Iterator<Product> iterator = productlist.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());

                    }
                    break;
                case 7:
                    sortDecease();
                    iterator = productlist.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case 8:
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit==true){
                break;
            }
        }
    }
    @Override
    public void add() {
        int n ;
            do{
                System.out.print("Enter the number product: ");
                n = scanner.nextInt();
                scanner.nextLine();
                if(validate.validateIntegerData(n)==false){
                    validate.showmessage();
                    continue;
                }
                int i=0;
                while (i <n){
                    System.out.println("Product information "+ (i+1));
                    System.out.print("Enter the id product :");
                    String id = scanner.nextLine();
                    System.out.print("Enter the name product :");
                    String name = scanner.nextLine();
                    System.out.print("Enter the description product: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter the price product : ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    if(validate.validateIntegerData(price)==false) {
                        validate.showmessage();
                        continue;
                    }
                    productlist.add(new Product(id, name, description, price));
                        System.out.println("Successfully");
                        i++;
                }
            }while (validate.validateIntegerData(n)==false);
    }

    @Override
    public void edit() {
        System.out.print("Enter the id product edit :");
        String id = scanner.nextLine();
        System.out.print("Enter the name product :");
        String name = scanner.nextLine();
        System.out.print("Enter the description product: ");
        String description = scanner.nextLine();
        System.out.print("Enter the price product : ");
        int price = scanner.nextInt();
        scanner.nextLine();
        if(validate.validateIntegerData(price)==false) {
            validate.showmessage();

        }else {
            for(int i = 0; i < productlist.size();i++){
                if(productlist.get(i).getId().equals(id)){
                    productlist.get(i).setName(name);
                    productlist.get(i).setDescription(description);
                    productlist.get(i).setPrice(price);
                    break;
                }else {
                    System.out.println("Cannot find id");
                }
                System.out.print("Successfully : ");
            }

        }

    }

    @Override
    public void remove() {
        System.out.print("Enter the id product remove :");
        String id = scanner.nextLine();
        for(int i = 0; i < productlist.size();i++){
            if(productlist.get(i).getId().equals(id)){
                productlist.remove(i);
            }else {
                System.out.println("Cannot find id");
            }
        }

    }

    @Override
    public void showProduct() {
        System.out.println("\n List of products");
        for (Product product : productlist) {
            System.out.println(product);
        }
    }

    @Override
    public void searchByName() {
        List<Product> productListSearch = new ArrayList<>();
        System.out.print("Enter the name product search :");
        String name = scanner.nextLine();
        System.out.print("Result :");
        for(int i = 0; i < productlist.size();i++){
            if(productlist.get(i).getName().equals(name)){
                productListSearch.add(productlist.get(i));

            }else {
                System.out.println("Cannot find id");
            }
        }
        System.out.println(productListSearch);
    }

    @Override
    public void sortIncease() {
        Collections.sort(productlist, new SortAscensePrice());

    }

    @Override
    public void sortDecease() {
        Collections.sort(productlist, new SortDescensePrice());

    }
}

