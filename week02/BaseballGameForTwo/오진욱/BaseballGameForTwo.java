//mvp : 각각의 정답을 가지는 숫자야구 만들기 (strike, ball, 턴 넘기기)
//단 1번의 S, B 처리가 끝나고 출력 후에 2번의 출력이 이루어져야 한다.

import java.util.Scanner;

public class BaseballGameForTwo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int strike1 = 0;
        int strike2 = 0;

        int ball1 = 0;
        int ball2 = 0;

        int [] number1 = new int[]{4, 6, 1};
        int [] number2 = new int[]{8, 3, 6};

        int[] answer1 = new int[3];
        int[] answer2 = new int[3];

        while(strike1 < 3 && strike2 < 3){
            strike1 = 0;
            ball1 = 0;




            System.out.print("Player(n) - Guess numbers: ");

            answer1[0] = scanner.nextInt();
            answer1[1] = scanner.nextInt();
            answer1[2] = scanner.nextInt();

            for (int i = 0 ; i < answer1.length; i +=1){
                for (int j = 0; j < answer1.length; j += 1){
                    if (answer1[i] == number1[j]){
                        if (i == j){
                            strike1 +=1;

                            continue;
                        }
                        ball1 +=1;
                    }
                }
            }

            System.out.println("-----Player(n)님의 score -----");

            if (strike1 != 0) {
                System.out.println(strike1 + " strike");
            }

            if (ball1 != 0) {
                System.out.println(ball1 + " ball");
            }

            if (strike1 == 0 && ball1 == 0){
                System.out.println("No count");
            }
        }
    }
}
