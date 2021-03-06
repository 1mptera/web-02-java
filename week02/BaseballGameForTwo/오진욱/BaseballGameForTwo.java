//mvp : 각각의 정답을 가지는 숫자야구 만들기 (strike, ball, 턴 넘기기)
//단 1번의 S, B 처리가 끝나고 출력 후에 2번의 출력이 이루어져야 한다.

import java.util.Random;
import java.util.Scanner;

public class BaseballGameForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] strike = new int[2];
        int[] ball = new int[2];

        int[] number1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] number2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 20; i +=1 ){
            int x1 = random.nextInt(10);
            int y1 = random.nextInt(10);
            int temp1 = number1[x1];

            number1[x1] = number1[y1];
            number1[y1] = temp1;

            int x2 = random.nextInt(10);
            int y2 = random.nextInt(10);
            int temp2 = x2;

            number1[x2] = number1[y2];
            number1[y2] = temp2;
        }

        int[] answer = new int[3];

        int player = 1;
        int winner = 0;

        String longDash = "=================================";

        System.out.println(longDash);
        System.out.println("2인용 숫자야구 게임");
        System.out.println(longDash);

        while (strike[0] < 3 && strike[1] < 3) {
            int index = player - 1;

            for (int i = 0; i < strike.length; i += 1) {
                strike[i] = 0;
                ball[i] = 0;
            }

            int[] number = new int[3];

            for (int i = 0; i < number.length; i += 1) {
                if (player == 1) {
                    number[i] = number1[i];
                }
                if (player == 2) {
                    number[i] = number2[i];
                }
            }

            System.out.print("Player" + player + " - Guess numbers: ");

            answer[0] = scanner.nextInt();
            answer[1] = scanner.nextInt();
            answer[2] = scanner.nextInt();

            for (int i = 0; i < answer.length; i += 1) {
                for (int j = 0; j < answer.length; j += 1) {
                    if (answer[i] != number[j]) {

                        continue;
                    }

                    if (i == j) {
                        strike[index] += 1;

                        continue;
                    }

                    ball[index] += 1;
                }
            }

            System.out.println("-----Player" + player + "님의 score -----");

            if (strike[index] != 0) {
                System.out.println(strike[index] + " strike");
            }

            if (ball[index] != 0) {
                System.out.println(ball[index] + " ball");
            }

            if (strike[index] == 0 && ball[index] == 0) {
                System.out.println("No count");
            }

            System.out.println();

            winner = player;

            if (player == 1) {
                player += 1;
                continue;
            }

            player -= 1;
            continue;
        }

        System.out.println(longDash);
        System.out.println("Winner is Player" + winner);
        System.out.println(longDash);
    }
}
