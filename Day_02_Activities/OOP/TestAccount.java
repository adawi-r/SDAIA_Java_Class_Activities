package Day2.Day_02_Activities.OOP;

public class TestAccount {

    public static void main(String[] args) {

        Account a1 = new Account("Raghad", 2000);

        Account.annualRate = 0.04;
        System.out.println(a1.name);

        System.out.println(a1.getBalance());
        a1.withDraw(500);
        a1.deposit(1000);

        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthlyRate());
        a1.deposit(500);
        a1.withDraw(500);

    }
}
