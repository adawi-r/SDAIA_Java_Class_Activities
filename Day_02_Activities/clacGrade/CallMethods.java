package Day2.Day_02_Activities.clacGrade;

import java.util.Scanner;

public class CallMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark and full mark");

        double mark = sc.nextDouble();
        double fullMark = sc.nextDouble();

        double Percentage = MyMethods.ClaculatePercentage(mark,fullMark);
        String Result =MyMethods.marksResult(Percentage);

        System.out.println("Percentage is: " + Percentage + "Result is: " + Result);
    }
}
