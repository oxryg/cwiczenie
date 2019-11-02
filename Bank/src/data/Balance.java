package data;

public class Balance {
    private double balance;

    public Balance(double balance) {
        this.balance = balance;
    }

    public void info() {
        String info = balance + " PLN";
        System.out.println(info);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
