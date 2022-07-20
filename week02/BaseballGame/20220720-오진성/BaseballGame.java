import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] guess = new int[3];

        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
        }

        for (int i = 0; i < 3; i += 1) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println(" ");

        while (true) {
            int strike = 0;
            int ball = 0;

            System.out.print("Guess numbers: ");

            guess[0] = scanner.nextInt();
            guess[1] = scanner.nextInt();
            guess[2] = scanner.nextInt();

            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {
                    if (numbers[i] != guess[j]) {
                        continue;
                    }
                    if (i == j) {
                        strike += 1;
                        continue;
                    }
                    ball += 1;
                }
            }

            if (strike != 0) {
                System.out.println(strike + " strike");
            }
            if (ball != 0) {
                System.out.println(ball + " ball");
            }
            if (strike == 0 && ball == 0) {
                System.out.println("No count");
            }
            if (strike==3){
                break;
            }
        }

        System.out.println("You win!");
    }
}
