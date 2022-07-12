import java.util.Scanner;

public class TestYourMath {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2 numbers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " = ? " );

        int addAnswer = scanner.nextInt();

        System.out.println(num1 + " * " + num2 + " = ? " );

        int multipleAnswer = scanner.nextInt();

        boolean addTrue = addAnswer == (num1+num2);
        boolean multipleTrue = multipleAnswer == (num1*num2);

        if(addTrue && multipleTrue) {
            System.out.println("Genius!");
        }

        if(addTrue != multipleTrue) {
            System.out.println("Muggle!");
        }

        if(!addTrue && !multipleTrue) {
            System.out.println("Stupid!");
        }
    }
}
