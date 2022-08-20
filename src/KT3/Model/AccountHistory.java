package KT3.Model;

import java.io.Serializable;

public class AccountHistory implements Serializable {
    public static final String Raise = "Raise";
    public static final String Deduction = "Deduction";
    private  int ID;
    public static int idHistory = 0;
    private  int accountId;
    private  String type ;
    private  int amount ;
    private  String description ;

    public AccountHistory() {
    }

    public AccountHistory( int accountId, String type, int amount, String description) {
        idHistory++;
        this.ID = idHistory;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AccountHistory{" +
                "ID=" + ID +
                ", accountId=" + accountId +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
