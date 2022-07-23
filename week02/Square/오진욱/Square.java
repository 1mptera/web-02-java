import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");
        int squareLength = scanner.nextInt();

        while (squareLength < 2 || squareLength >= 20) {
            System.out.println("다시 입력해주세요");

            squareLength = scanner.nextInt();
        }

        //처리
        for (int i = 0; i < squareLength; i += 1) {
            for (int j = 0; j < squareLength; j += 1) {
                System.out.print("*");
            }
            //출력
            System.out.println();
        }
    }
}
