package Day3;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() - amount >= 0) {
            super.withDraw(amount);
        }
        System.out.println("you can't do this op");
    }
}
