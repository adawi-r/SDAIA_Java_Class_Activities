package Day1.Day_01_Activities.IfSwitch;

import java.util.Scanner;

public class CheckDay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number");

        int day = input.nextInt();

        if(day == 7 || day >= 1 && day <= 4) {
            System.out.println("Work Day");
        }
        else if(day == 5 || day == 6) {
            System.out.println("Off Day");
        }
        else{
            System.out.println("Invalid input");
        }
    }
 }
