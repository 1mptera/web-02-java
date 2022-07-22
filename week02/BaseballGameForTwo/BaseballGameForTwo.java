import java.util.Random;
import java.util.Scanner;

public class BaseballGameForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int strike = 0;
        int ball = 0;

        int playerNumber = 0;
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] playerGuess = new int[3];

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
        }

        System.out.println("==================================");
        System.out.println("         2인용 숫자 야구 게임");
        System.out.println("==================================");
        System.out.println();

        while (strike < 3) {
            strike = 0;
            ball = 0;
            playerNumber += 1;

            System.out.print("Player" + playerNumber + " - Guess number: ");

            for (int i = 0; i < 3; i += 1) {
                playerGuess[i] = scanner.nextInt();
            }

            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {
                    if (numbers[i] != playerGuess[j]) {
                        continue;
                    }

                    if (i == j) {
                        strike += 1;
                        continue;
                    }
                    ball += 1;
                }
            }

            System.out.println("-----Player" + playerNumber + "님의 score -----");
            if (strike != 0) {
                System.out.println(strike + " strike");
            }

            if (ball != 0) {
                System.out.println(ball + " ball");
            }

            if (strike == 0 && ball == 0) {
                System.out.println("No count");
            }
            System.out.println();

            if (playerNumber > 2) {
                playerNumber = 1;
            }
        }

        System.out.println("==================================");
        System.out.println("   Winner is player" + playerNumber);
        System.out.println("==================================");
    }
}
