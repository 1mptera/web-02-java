import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] shuffleAnswer = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] guess = new int[3];

        for (int i = 0; i < 20; i += 1) {
            int shuffle1 = random.nextInt(10);
            int shuffle2 = random.nextInt(10);
            int temp = shuffleAnswer[shuffle1];

            shuffleAnswer[shuffle1] = shuffleAnswer[shuffle2];
            shuffleAnswer[shuffle2] = temp;
        }

        int[] answer = new int[]{shuffleAnswer[0], shuffleAnswer[1], shuffleAnswer[2]};

        System.out.print("Answer: ");
        for (int i = 0; i < answer.length; i += 1) {
            System.out.print(answer[i] + "\t");
        }
        System.out.println("");

        while (true) {
            int strike = 0;
            int ball = 0;
            boolean isOverlap = false;

            //입력
            System.out.print("Guess numbers: ");
            int guessNumber1 = scanner.nextInt();
            int guessNumber2 = scanner.nextInt();
            int guessNumber3 = scanner.nextInt();

            guess[0] = guessNumber1;
            guess[1] = guessNumber2;
            guess[2] = guessNumber3;

            //처리
            for (int i = 0; i < guess.length; i += 1) {
                for (int j = 0; j < guess.length; j += 1) {
                    if (i != j && guess[i] == guess[j]){
                        isOverlap = true;
                    }

                    if (answer[i] == guess[i]) {
                        strike += 1;
                        break;
                    }

                    if (answer[i] == guess[j]) {
                        ball += 1;
                    }
                }
            }

            //출력
            if (isOverlap == true){
                System.out.println("서로 다른 숫자를 넣어주세요!");

            }
            if (strike == 0 && ball == 0) {
                System.out.println("No count");
                continue;
            }

            if (strike == 3) {
                System.out.println("You win");
                return;
            }

            System.out.println(strike + " strike");
            System.out.println(ball + " ball");
            System.out.println("");
        }
    }
}
