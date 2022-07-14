import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //계산 프로그램 시작
        System.out.print("Input 2 numbers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        //덧셈
        System.out.println(num1 + " + " + num2 + " = ?");

        int answer1 = scanner.nextInt();

        //곱셈
        System.out.println(num1 + " * " + num2 + " = ?");

        int answer2 = scanner.nextInt();

        boolean results1 = answer1 == (num1 + num2);
        boolean results2 = answer2 == (num1 * num2);

        //지능 판단!
        if (results1 && results2) {
            System.out.println("Genius!");
        }
        if (!results1 && !results2) {
            System.out.println("Stupid!!");
        }
        if ((!results1 && results2) || (results1 && !results2)) {
            System.out.println("Muggle!");
        }
    }
}
