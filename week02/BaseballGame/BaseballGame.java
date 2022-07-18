import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] arg) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] answers = new int[3];

        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i += 1) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int temp = numbers[x];
            numbers[x] = numbers[y];
            numbers[y] = temp;
        }

        //처리
        while (true) {
            System.out.print("Guess numbers: ");
            int answers1 = scanner.nextInt();
            int answers2 = scanner.nextInt();
            int answers3 = scanner.nextInt();
            int strike = 0;
            int ball = 0;
            answers[0] = answers1;
            answers[1] = answers2;
            answers[2] = answers3;
            for (int i = 0; i < 3; i += 1) {
                for (int j = 0; j < 3; j += 1) {
                    if (numbers[i] == answers[j] && i == j) {
                        strike += 1;
                    }
                    if (numbers[i] == answers[j] && i != j) {
                        ball += 1;
                    }
                }
            }
            //출력
            if (strike == 3) {
                System.out.println("You win!");
                break;
            }
            if (strike == 0 && ball == 0) {
                System.out.println("No count");
                continue;
            }
            System.out.println(strike + " strike");
            System.out.println(ball + " ball");
        }
    }
}
