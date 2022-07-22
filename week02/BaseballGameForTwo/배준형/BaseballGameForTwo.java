import java.util.Random;
import java.util.Scanner;

public class BaseballGameForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======================================");
        System.out.println("           2인용 숫자야구 게임");
        System.out.println("======================================");


        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
        }

        int[] answer = new int[3];

        boolean playing = false;

        int player = 0;


        while (!playing) {

            player += 1;

            if (player == 3) {
                player -= 2;
            }

            int strike = 0;
            int ball = 0;

            System.out.println();
            System.out.print("Player" + player + " - Guess numbers: ");

            for (int i = 0; i < 3; i += 1) {
                answer[i] = scanner.nextInt();
            }

            System.out.println("-----Player" + player + "님의 score -----");

            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {
                    if (answer[i] != numbers[j]) {
                        continue;
                    }

                    if (i == j) {
                        strike += 1;
                        continue;
                    }

                    ball += 1;
                }
            }

            if (strike > 0) {
                System.out.println(strike + " strike");
            }

            if (ball > 0) {
                System.out.println(ball + " ball");
            }

            if (strike == 0 && ball == 0) {
                System.out.println("No count");
            }

            if (strike == 3) {
                playing = true;
            }

        }

        System.out.println("======================================");
        System.out.println("Winner is Player" + player + "!!!");
        System.out.println("======================================");
    }
}
