package Day2.OOP;

public class Account {
    String name;
    private double balance;
    static double annualRate;

    public  Account ( String name,double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getMonthlyRate() {
        return annualRate / 12;
    }

    public double getMonthlyInt() {
        return balance * getMonthlyRate() ;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}
