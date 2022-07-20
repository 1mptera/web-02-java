//요구 조건 : 게임 시작 -> 임의 세 숫자 설정 -> 추측 숫자 세 개 입력하면 Strike와 ball ㅈ추는 게임(mvp)

import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[]{4, 7, 3};
        int[] answers = new int[3];

        int strike = 0;
        int ball = 0;

        while (strike < 3) {
            strike = 0;
            ball = 0;

            boolean overlapped = false;
            boolean outRanged = false;

            System.out.print("Guess numbers: ");

            for (int i = 0; i < answers.length; i += 1) {
                int element = scanner.nextInt();

                answers[i] = element;

                if (element < 0 || element > 9) {
                    System.out.println("0~9 사이의 숫자를 입력해주세요.");
                    outRanged = true;
                    break;
                }
            }

            if (outRanged == true) {
                continue;
            }

            //처리
            for (int i = 0; i < answers.length; i += 1) {
                for (int j = 0; j < answers.length; j += 1) {
                    if (i != j && answers[i] == answers[j]) {
                        System.out.println("다시 입력해주세요!");
                        overlapped = true;
                        break;
                    }

                    if (answers[i] == numbers[i]) {
                        strike += 1;
                        break;
                    }

                    if (answers[i] == numbers[j]) {
                        ball += 1;
                    }
                }

                if (overlapped == true) {
                    break;
                }
            }

            if (overlapped == true) {
                continue;
            }
            //출력

            if (strike != 0) {
                System.out.println(strike + " strike");
            }

            if (ball != 0) {
                System.out.println(ball + " ball");
            }

            if (strike == 0 && ball == 0) {
                System.out.println("No count");
            }
        }
        System.out.println("You win!");
    }
}
