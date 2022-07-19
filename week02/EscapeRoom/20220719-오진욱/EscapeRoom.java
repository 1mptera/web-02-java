import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[]args){
        //준비
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        while(correctCount < 3){
            //입력
            System.out.print("Input 2 numbers: ");

            int addNumber1 = scanner.nextInt();
            int addNumber2 = scanner.nextInt();

            System.out.println(addNumber1 + " + " + addNumber2 + " = ? ");

            int addResult = scanner.nextInt();

            //처리
            boolean isCorrect = addResult == addNumber1 + addNumber2;
            boolean isIncorrect = addResult != addNumber1 + addNumber2;

            if (!isCorrect && ! isIncorrect) {
                System.out.println("1 또는 2를 입력해주세요!");
                continue;
            }

            //출력
            if (isCorrect) {
                correctCount += 1;
                System.out.println("You're right! (" + correctCount +  ")");
            }

            if (isIncorrect){
                System.out.println("What?");
            }

            if (correctCount == 3){
                System.out.println("Escape");
            }
        }
    }
}
