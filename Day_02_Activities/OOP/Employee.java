package Day2.Day_02_Activities.OOP;

public class Employee {
    String name;
    double Salary;
    int hireYear;
//    int currentYear = 2024;

    public  Employee ( String name,double Salary,int hireYear) {
        this.name = name;
        this.Salary = Salary;
        this.hireYear = hireYear;
//        currentYear = c;
    }

    public int calculatYear(){
        return  2024 - hireYear;
    }

    public double calculatSalary(){
        return Salary * 12;
    }
}
