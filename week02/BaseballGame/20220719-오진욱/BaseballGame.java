import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        Integer[] shuffleNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> shuffleList = Arrays.asList(shuffleNumbers);
        Collections.shuffle(shuffleList);
        shuffleList.toArray(shuffleNumbers);

        int[] answer = new int[3];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = shuffleNumbers[i];
            System.out.println(answer[i]);
        }

        int[] guess = new int[3];

        int strike = 0;
        int ball = 0;

        while (strike < 3) {
            strike = 0;
            ball = 0;

            boolean isOutRanged = false;
            boolean isOverlapped = false;

            //입력
            System.out.print("Guess numbers: ");
            for (int i = 0; i < guess.length; i += 1) {
                guess[i] = 0;
                guess[i] = scanner.nextInt();

                if (guess[i] > 9 || guess[i] < 0) {
                    isOutRanged = true;
                }

                if (i != 0 && guess[i] == guess[i - 1]) {
                    isOverlapped = true;
                }
            }

            //처리
            if (isOutRanged) {
                System.out.println("0 ~ 9 사이의 숫자를 입력해주세요!");
                continue;
            }

            if (isOverlapped) {
                System.out.println("중복된 숫자는 입력 불가합니다. 다시 입력하세요!");
                continue;
            }

            for (int i = 0; i < guess.length; i += 1) {
                for (int j = 0; j < guess.length; j += 1) {
                    if (guess[i] == answer[i]) {
                        strike += 1;
                        break;
                    }

                    if (guess[i] == answer[j]) {
                        ball += 1;
                    }
                }
            }

            //출력
            System.out.println(strike + " Strike");
            System.out.println(ball + " Ball");

            if (strike == 3 ){
                System.out.println("You win!");
            }
            System.out.println("");
        }
    }
}
