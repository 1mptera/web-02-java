import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while (true) {
            //입력
            System.out.println("Input 2 numbers: ");
            int addNumber1 = scanner.nextInt();
            int addNumber2 = scanner.nextInt();

            System.out.println(addNumber1 + " + " + addNumber2 + " = ? ");

            int addResult = scanner.nextInt();

            boolean isCorrect = addResult == addNumber1 + addNumber2;
            boolean isIncorrect = addResult != addNumber1 + addNumber2;

            //처리
            if (isCorrect) {
                correctCount += 1;
                System.out.println("You're right! (" + correctCount + ")");
            }
            if (isIncorrect) {
                System.out.println("What?");
            }
            System.out.println("");

            //출력
            if (correctCount >= 3) {
                System.out.println("Escape!");
                return;
            }
        }
    }
}
