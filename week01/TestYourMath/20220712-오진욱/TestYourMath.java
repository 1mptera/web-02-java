import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();

        int addResult = inputNum1 + inputNum2;
        int multipleResult = inputNum1 * inputNum2;

        System.out.println(inputNum1 + " + " + inputNum2 + " = ?");

        int inputAddAnswer = scanner.nextInt();

        System.out.println(inputNum1 + " * " + inputNum2 + " = ?");

        int inputMultipleAnswer = scanner.nextInt();

        boolean addCorrect = addResult == inputAddAnswer;
        boolean multipleCorrect = multipleResult == inputMultipleAnswer;

        if (addCorrect && multipleCorrect) {
            System.out.println("Genius!");
        }
        if (addCorrect != multipleCorrect) {
            System.out.println("Muggle!");
        }
        if (!addCorrect && !multipleCorrect) {
            System.out.println("Stupid!");
        }
    }
}
