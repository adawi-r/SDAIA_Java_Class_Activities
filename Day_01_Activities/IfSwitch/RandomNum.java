package IfSwitch;

import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

//        System.out.println("What's" + x + "*" + y + "?"); or
        System.out.printf("What's %d * %d", x,y);

        int answer = input.nextInt();

        if(answer == x*y) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
        }

    }
}
