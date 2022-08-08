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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<AccountHistory> listAccountHistory ;

    public Account(String fullName, String accountNumber, int amount, List<AccountHistory> listAccountHistory) {

        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.id = id;
        this.amount = amount;
        this.listAccountHistory = listAccountHistory;
    }

    public void setListAccountHistory(List<AccountHistory> listAccountHistory) {
        this.listAccountHistory = listAccountHistory;
    }

    public List<AccountHistory> getListAccountHistory() {
        return listAccountHistory;
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


    @Override
    public String toString() {
        return "Account{" +
                "fullName='" + fullName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", id=" + id +
                ", amount=" + amount +
                ", listAccountHistory=" + listAccountHistory +
                '}';
    }

}
