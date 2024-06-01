
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        System.out.printf("What's %d * %d", x,y);
        int answer = input.nextInt();

        // ask q then id F ask same q another time
        while(answer != x*y) {
            System.out.println("Try Again");
            System.out.printf("What's %d * %d ", x,y);

            answer = input.nextInt();
        }

        System.out.println("Correct");

    }
}
