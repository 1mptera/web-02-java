import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //숫자 두개를 넣으시오
        System.out.print("Input 2 numbers: ");

        //숫자 2개
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        //덧셈 문제
        System.out.println(x + " + " + y + " = ?");

        //대답
        int answer1 = scanner.nextInt();

        //곱셈 문제
        System.out.println(x + " * " + y + " = ?");

        //곱셈 대답
        int answer2 = scanner.nextInt();

        //지능 출력
        boolean results1 = answer1 == (x + y);
        boolean results2 = answer2 == (x * y);

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
