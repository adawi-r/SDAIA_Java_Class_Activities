package Day2.Day_02_Activities.OOP;

public class TestEmployee {

    public static void main(String[] args) {

        Employee x = new Employee("Raghad",2000,2020);
        Employee y = new Employee("Nora",500,2023);

        System.out.println(x.name);
        System.out.println(x.calculatYear());
        System.out.println(x.calculatSalary());
        System.out.println("--------------------");
        System.out.println(y.name);
        System.out.println(y.calculatYear());
        System.out.println(y.calculatSalary());

    }
}
