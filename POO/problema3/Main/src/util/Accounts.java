package util;

public class Accounts {
    private int accountNumber;
    private String accountHolder;
    private double deposit;

    public Accounts(int number, String name, double deposit){
        this.accountNumber = number;
        this.accountHolder = name;
        this.deposit = deposit;
    }
    public Accounts(int number, String name){
        this.accountNumber = number;
        this.accountHolder = name;
    }
    public void addDeposit(double deposit){
        this.deposit += deposit;
    }

    public void withDraw(double deposit){
        this.deposit -= deposit;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + ", Holder: "+ accountHolder + ", Balance: R$" + deposit;
    }
}
