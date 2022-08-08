package KT3.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

    public static int ID = 0 ;
    private  String fullName ;
    private  String accountNumber ;
    private  int id;
    private  int amount;

    public Account(String fullName, String accountNumber, int amount) {
        ID++;
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.id = ID;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public  AccountHistory listAccountHistory ;

    public Account(String fullName, String accountNumber, int id, AccountHistory listAccountHistory) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.id = id;
        this.listAccountHistory = listAccountHistory;
    }

    public Account() {
        ID++;
        this.id = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountHistory getListAccountHistory() {
        return listAccountHistory;
    }

    public void setListAccountHistory(AccountHistory listAccountHistory) {
        this.listAccountHistory = listAccountHistory;
    }

    @Override
    public String toString() {
        return "Account{" +
                "fullName='" + fullName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", id=" + id +
                ", listAccountHistory=" + listAccountHistory +
                '}';
    }
    public void Show(){
        System.out.println(toString());
    }
}
