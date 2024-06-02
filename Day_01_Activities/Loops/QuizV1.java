package Day1.Day_01_Activities.Loops;

import java.util.Scanner;

public class QuizV1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            System.out.printf("What's %d * %d", x, y);
            int answer = input.nextInt();

            if (answer == x * y) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }

        }
    }
}
