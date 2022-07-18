import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");

        int length = scanner.nextInt();

        while (2 > length || length >= 20) {
            System.out.println("다시 입력해주세요");

            length = scanner.nextInt();
        }

        for (int i = 0; i < length; i += 1) {
            for (int j = 0; j < length; j += 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
