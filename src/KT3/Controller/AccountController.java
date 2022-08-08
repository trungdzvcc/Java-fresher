package KT3.Controller;


import Day8.Excercise.Validate.ValidateData;
import KT3.Model.Account;
import KT3.Model.AccountHistory;
import KT3.Validate.Validate;
import KT3.View.ViewAccount;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static EXAM2.CONTROLLER.StudentController.scanner;

public class AccountController {
    public ViewAccount view = new ViewAccount();
    List<AccountHistory> listAccount = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();
    ValidateData validate = new ValidateData();
    public static Scanner scanner = new Scanner(System.in);

    public void enterAcount() {
        Scanner scanner = new Scanner(System.in);
        String choose = null;
        boolean exit = false;

        while (true) {
            view.showMenu();
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    enterAccountInfo();
                    break;
                case "2":
                    getAccountInfo();
                    break;
                case "3":
                    editAccountInfo();
                    writeFile();
                    break;
                case "4":
                    deleteAccountInfo();
                    writeFile();
                    break;
                case "5":
                    System.out.print("\n" + searchAccountByName());
                    System.out.println();
                    break;
                case "6":
                    sortByNameAccount();
                    for (Account account : accounts) {
                        System.out.println(account);
                    }
                    writeFile();
                    break;
                case "7":
                    Deduction();
                    break;
                case "8":
                    Raise();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
        }
    }
    public void Raise() {
        {
            System.out.println("into Raise");
            System.out.print("Enter the id of element:");
            int id = scanner.nextInt();
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getId() == id) {

                    boolean check = false;
                    while(check==false){
                        System.out.print("Enter the raise:");
                        int raise = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter the description:");
                        String description = scanner.nextLine();

                        int newAmount = accounts.get(i).getAmount() + raise;
                        accounts.get(i).setAmount(newAmount);
                        System.out.println("Deduction Successfully");
                        //add history
                        listAccount.add(new AccountHistory(accounts.get(i).getId(), AccountHistory.Raise, raise, description));
                        accounts.get(i).setListAccountHistory(listAccount);
                        check=true;

                    }
                }
            }

            writeFile();

        }
    }

    public void Deduction() {

                System.out.println("into Deduction");
                System.out.print("Enter the id of element :");
                int id = scanner.nextInt();

                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getId() == id) {

                            boolean check = false;
                        while (check==false){
                                System.out.print("Enter the deduction:");
                                int deduction = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter the description:");
                                String description = scanner.nextLine();
                                if(accounts.get(i).getAmount()< deduction){
                                    System.out.println("Please enter the amount deduction < amount current:");
                                }else{
                                    int newAmount = accounts.get(i).getAmount()-deduction;
                                    accounts.get(i).setAmount(newAmount);
                                    System.out.println("Deduction Successfully");
                                    //add history
                                    listAccount.add(new AccountHistory(accounts.get(i).getId(),AccountHistory.Deduction,deduction,description));
                                    accounts.get(i).setListAccountHistory(listAccount);
                                    check=true;
                                }
                            }

                    }


                }
        writeFile();
            }




    public List<Account> searchAccountByName() {
        List<Account> searchNameList = new ArrayList<>();
        System.out.print("\nFull Name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getFullName().toLowerCase().equals(name.toLowerCase())) {
                searchNameList.add(accounts.get(i));
            }
        }
        if (searchNameList == null) {
            System.out.println("Cannot find name");
        }
        return searchNameList;
    }

    public void sortByNameAccount() {
        Collections.sort(accounts, new SortByName());
    }

    public void deleteAccountInfo() {
        System.out.print("Enter the id of element delete :");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.remove(i);
                System.out.print("Successfully");
            } else {
                System.out.print("Cannot find id");
            }
        }

    }

    public void editAccountInfo() {

        System.out.print("Enter the id of element edit :");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                boolean checkEnter = true;
                do {
                    System.out.print("\nFull Name: ");
                    String name = scanner.nextLine();
                    if (Validate.isNumeric(name)) {
                        System.out.print(" Full name Cannot enter by number: ");
                        checkEnter = false;
                        continue;
                    }

                    System.out.print("Enter the account Number : ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Enter the amount account : ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    if (validate.validateIntegerData(amount) == false) {
                        validate.showmessage();
                        continue;
                    }
                        accounts.get(i).setFullName(name);
                        accounts.get(i).setAccountNumber(accountNumber);
                        accounts.get(i).setAmount(amount);
                        checkEnter = true;
                        System.out.println("Successfully");
                    } while (checkEnter == false);

            }
        }
    }

    public void getAccountInfo() {
        FileInputStream in = null;
        ObjectInputStream inputStream = null;
        try {

            in = new FileInputStream("C:\\Users\\My PC\\Desktop\\Java-fresher\\src\\KT3\\File\\AccountFile.txt");
            inputStream = new ObjectInputStream(in);
            accounts = (List<Account>) inputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        System.out.println("List account read by file");
        for(int i = 0; i <accounts.size(); i++){
            System.out.println(accounts.get(i));
        }
    }
    public void enterAccountInfo() {

        String accountName = "";
        String accountNumber = "";
        int amount = 0;
        int n = 0;
        do {
            System.out.print("Enter the number of account: ");
            n = scanner.nextInt();
            if (validate.validateIntegerData(n) == false) {
                validate.showmessage();
                continue;
            }
            scanner.nextLine();
            int i = 0;
            while (i < n) {
                Account account = new Account();
                System.out.println("Account information " + (i + 1));
                System.out.print("Enter the name account :");
                accountName = scanner.nextLine();
                if (Validate.isNumeric(accountName)) {
                    System.out.println("Cannot enter by number");
                    continue;
                }
                System.out.print("Enter the account Number : ");
                accountNumber = scanner.nextLine();
                System.out.print("Enter the amount account : ");
                amount = scanner.nextInt();
                scanner.nextLine();
                if (validate.validateIntegerData(amount) == false) {
                    validate.showmessage();
                    continue;
                }
                account.setFullName(accountName);
                account.setAccountNumber(accountNumber);
                account.setAmount(amount);
                accounts.add(account);
                i++;
            }
            System.out.println(accounts);
        } while (n <= 0);
        writeFile();
    }
    public void writeFile(){
        FileOutputStream out = null;
        ObjectOutputStream oos = null;
        try {
            out = new FileOutputStream("C:\\Users\\My PC\\Desktop\\Java-fresher\\src\\KT3\\File\\AccountFile.txt");
            oos = new ObjectOutputStream(out);
            oos.writeObject(accounts);
            System.out.println("Successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

