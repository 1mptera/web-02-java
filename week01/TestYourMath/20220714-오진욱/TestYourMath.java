import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");
        int inputNumber1 = scanner.nextInt();
        int inputNumber2 = scanner.nextInt();

        System.out.println(inputNumber1 + " + " + inputNumber2 + " = ?");
        int inputAddResult = scanner.nextInt();

        System.out.println(inputNumber1 + " * " + inputNumber2 + " = ?");
        int inputMultipleResult = scanner.nextInt();

        boolean isAddCorrect = inputAddResult == inputNumber1 + inputNumber2;
        boolean isMultipleCorrect = inputMultipleResult == inputNumber1 * inputNumber2;

        if (isAddCorrect && isMultipleCorrect) {
            System.out.println("Genius!");
        }
        if (isAddCorrect != isMultipleCorrect) {
            System.out.println("Muggle!");
        }
        if (!isAddCorrect && !isMultipleCorrect) {
            System.out.println("Stupid!");
        }
    }
}
