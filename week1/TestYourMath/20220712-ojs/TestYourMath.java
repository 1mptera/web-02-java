import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //숫자 두개를 기입하여라!
        System.out.print("Input 2 numbers: ");

        //기입
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        //덧셈 문제
        System.out.println(input1 + " + " + input2 + " = ?");

        //덧셈 답
        int answer1 = scanner.nextInt();

        //곱셈 문제
        System.out.println(input1 + " * " + input2 + " = ?");

        //곱셈 답
        int answer2 = scanner.nextInt();

        boolean results1 = answer1 == (input1 + input2);
        boolean results2 = answer2 == (input1 * input2);

        //지능 판다
        if (results1 && results2) {
            System.out.println("Genius!");
        }
        if (!results1 && !results2) {
            System.out.println("Stupid!");
        }
        if ((!results1 && results2) || (results1 && !results2)) {
            System.out.println("Muggle!");

        }
    }
}
