import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double credit = 5000;
        double got = 0;

        int[] numbers = new int[3];

        while (credit < 10000) {

            for (int i = 0; i < 3; i += 1) {
                numbers[i] = random.nextInt(10) + 1;
            }
            
            System.out.println("Want to play? 1. Yes, 2. No");

            int option = scanner.nextInt();

            if (option == 2) {
                System.out.println("bye bye ~");

                return;
            }

            got = 1000 * (numbers[0] + numbers[1] + numbers[2]) / 20;

            for (int i = 0; i < 3; i += 1){
                if (numbers[i] == 7){
                    got *= 4;
                }

                if (numbers[i] == 4 || numbers[i] == 8 || numbers[i] == 9){
                    got *= 0.5;
                }
            }

            System.out.println("Line: " + numbers[0] + " . " + numbers[1] + " . " + numbers[2]);

            credit += got - 1000;

            System.out.println("You won " + got +" !!!!!");
            System.out.println("Credit: " + credit);
            System.out.println();


            if (credit < 1000){
                System.out.println("Need credit? Go home!");
                System.out.println("bye bye ~");

                return;
            }
        }

        System.out.println("Winner!!");
        System.out.println("bye bye ~");
    }
}
