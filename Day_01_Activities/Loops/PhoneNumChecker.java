package Day1.Day_01_Activities.Loops;

import java.util.Scanner;

public class PhoneNumChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new phone number");
        String phoneNum = sc.nextLine();
        int DigitCount = 0;

        if (phoneNum.length() != 10) {
            System.out.println("phoneNum must be 10 digits");
        }
        else if (!phoneNum.startsWith("05")) {
            System.out.println("phoneNum must be start with 05");
        }
        else {
            boolean flag = false;

            for (int i = 0; i < phoneNum.length(); i++) {
                char n = phoneNum.charAt(i);
                if (!Character.isDigit(n)) {
                    flag = true;
                }
            }

            if(flag) {
                System.out.println("must enter numbers only");
            }
            else {
                System.out.println("phoneNum is correct");
            }
        }
    }
}


