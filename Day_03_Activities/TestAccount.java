package Day3;

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
        System.out.println("------------------");

        SavingAccount sa1 = new SavingAccount("Nora", 5000,500);

        System.out.println("balance before: " + sa1.getBalance());
        System.out.println("limit is: " + sa1.getLimit());

        sa1.withDraw(5000);

        sa1.withDraw(2000);
        System.out.println("balance: " + sa1.getBalance());

        System.out.println("------------------");

        CheckingAccount ca1 = new CheckingAccount("Asma", 2000);

        System.out.println("balance before: " + ca1.getBalance());
        ca1.withDraw(1000);

        System.out.println("balance after: " + ca1.getBalance());

        ca1.withDraw(2000);

    }
}
