import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");

        int oneSideLength = scanner.nextInt();

        while ((oneSideLength < 2) || (oneSideLength >= 20)) {

            System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");

            oneSideLength = scanner.nextInt();

            System.out.println("다시 입력해주세요.");
        }

        if (oneSideLength >= 2 && oneSideLength < 20) {
            for (int i = 0; i < oneSideLength; i += 1) {
                for (int j = 0; j < oneSideLength; j += 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.println();
            }
        }
    }
}
