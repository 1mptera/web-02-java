import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");

        int inputNumber1 = scanner.nextInt();
        int inputNumber2 = scanner.nextInt();

        int addResult = inputNumber1 + inputNumber2;
        int multipleResult = inputNumber1 * inputNumber2;

        System.out.println(inputNumber1 + " + " + inputNumber2 + " = ?");

        int inputAddAnswer = scanner.nextInt();

        System.out.println(inputNumber1 + " * " + inputNumber2 + " = ?");

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