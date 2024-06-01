package Day3;

public class SavingAccount extends Account{

    private double limit;

    public SavingAccount(String name, double balance, double limit) {
        super(name, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withDraw(double amount) {
        if(getBalance() - amount >= limit){
            super.withDraw(amount);
            System.out.println("withDraw is Done");
        }
        else {
            System.out.println("the result of op !>= limit");
        }
    }
}
