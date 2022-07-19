import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int strike = 0;
        int ball = 0;

        //입력
        while (strike != 3) {

            System.out.println("Guess number: ");

            int[] number = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] Guess = new int[3];

            for (int i = 0; i < 20; i += 1) {
                int x = random.nextInt(10);
                int y = random.nextInt(10);
                int temp = number[x];
                number[x] = number[y];
                number[y] = temp;
            }

            Guess[0] = scanner.nextInt();
            Guess[1] = scanner.nextInt();
            Guess[2] = scanner.nextInt();

            //처리
            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {
                    if (number[i] != Guess[j]) {
                        continue;
                    }
                    if (i == j) {
                        strike += 1;
                    continue;
                    }
                    ball += 1;
                }
            }

            //출력
            if (strike != 0) {
                System.out.println(strike + " strike");
            }

            if (ball != 0) {
                System.out.println(ball + " ball");
            }

            if (strike == 0 && ball == 0) {
                System.out.println("no count");
            }
        }
        System.out.println("You win!");
    }
}
