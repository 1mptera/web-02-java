import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력해 주세요(2 이상 20 미만)");

        int high = scanner.nextInt();
        int base = high * 2 - 1;

        while ( high < 2 || high >= 20) {
            System.out.println("다시 입력해주세요");

            high = scanner.nextInt();
        }

        for (int i = 1; i <= high; i += 1) {
            for (int j = 1; j <= base; j += 1) {
                if (j >= high - i + 1  && j <= high + i - 1){
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
