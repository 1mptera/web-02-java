import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력해 주세요(2 이상 20 미만)");

        int high = scanner.nextInt();

        while (2 > high || high >= 20) {
            System.out.println("다시 입력해주세요");

            high = scanner.nextInt();
        }

        for (int i = 0; i < high; i += 1) {
            for (int j = high - 1; j > i; j -= 1) {
                System.out.print(" ");
            }

            for (int j = -1; j < i * 2; j += 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
