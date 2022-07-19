import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
        }

        int[] answers = new int[3];

        while (true) {
            System.out.print("Guess numbers: ");

            for (int i = 0; i < 3; i += 1) {
                answers[i] = scanner.nextInt();
            }

            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {

                    if (answers[i] != numbers[j]) {
                        continue;
                    }

                    if (i == j) {
                        strike += 1;

                        continue;
                    }

                    if (answers[i] == numbers[j]) {
                        ball += 1;
                    }
                }
            }

            if (strike > 0) {
                System.out.println(strike + " Strike");
            }

            if (ball > 0) {
                System.out.println(ball + " Ball");
            }

            if (strike == 0 && ball == 0) {
                System.out.println("No count");
            }

            if (strike == 3) {
                break;
            }
        }

        System.out.println("You win!");
    }
}

