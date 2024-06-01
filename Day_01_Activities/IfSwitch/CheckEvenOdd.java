package IfSwitch;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number");

        int num = input.nextInt();

        // TRUE = Even , F = Odd
        System.out.println(num % 2 == 0 ? "Even" : "Odd");

    }
}
