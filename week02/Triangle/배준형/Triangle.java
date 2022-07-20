import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력해 주세요(2 이상 20 미만)");

        int high = scanner.nextInt();

        while (high < 2 || high >= 20) {
            System.out.println("다시 입력해주세요");

            high = scanner.nextInt();
        }

        for (int i = 0; i < high; i += 1) {

            int blank = high - i + 1;
            int star = 2 * i + 1;

            System.out.print(" ".repeat(blank));
            System.out.print("*".repeat(star));
            System.out.println();
        }
    }
}
