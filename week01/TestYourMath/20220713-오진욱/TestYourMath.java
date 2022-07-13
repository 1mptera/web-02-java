import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");
        int inputNum1 = scanner.nextInt();
        int inputNum2 = scanner.nextInt();

        System.out.println(inputNum1 + "+" + inputNum2 + " = ?");
        int inputAdd = scanner.nextInt();

        System.out.println(inputNum1 + "*" + inputNum2 + " = ?");
        int inputMultiple = scanner.nextInt();

        boolean addTrue = inputAdd == inputNum1 + inputNum2;
        boolean multipleTrue = inputMultiple == inputNum1 * inputNum2;

        if (addTrue && multipleTrue) {
            System.out.println("Genius!");
        }
        if (addTrue != multipleTrue) {
            System.out.println("Muggle!");
        }
        if (!addTrue && !multipleTrue) {
            System.out.println("Stupid!");
        }
    }
}
