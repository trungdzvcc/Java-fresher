package DAY10.Excercise.ProductManager;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("S1" , "Sat" , "Dong a" , 224000 , "Tot"));
        productList.add(new Product("T1" , "Thep" , "Hoa phat" , 324000 , "Tot"));
        productList.add(new Product("T2" , "Ton" , "Dong aanh" , 124000 , "Tot"));

        FileOutputStream out = null;
        ObjectOutputStream oos = null;
        try {
            out = new FileOutputStream("C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\Excercise\\ProductManager\\ProductObj.txt");
            oos = new ObjectOutputStream(out);
            oos.writeObject(productList);
            System.out.println("Add succes");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if(out != null){
                out.close();
            }
            if(oos != null){
                oos.close();
            }
            System.out.println("out succes");
        }
        FileInputStream in = null;
        ObjectInputStream inputStream = null;
        try {

            in = new FileInputStream( "C:\\Users\\Mai Ngoc Trung\\IdeaProjects\\FresherJava\\src\\DAY10\\Test\\Excercise\\ProductManager\\ProductObj.txt");
            inputStream = new ObjectInputStream(in);
            productList = (List<Product>) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if(in != null){
                in.close();

            }
            if(inputStream!=null){
                inputStream.close();
            }

        }
        System.out.println("ket qua");
        for(int i = 0; i <productList.size(); i++) {
            productList.get(i).Show();
        }
            System.out.println("search");
            System.out.print("Enter id : ");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            for (int j = 0; j<productList.size(); j++){
                if(productList.get(j).getIdsp().equals(id)){
                    System.out.println(productList.get(j).toString());
                    break;
                }
            }
        }
    }

