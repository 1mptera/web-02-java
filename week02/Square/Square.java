import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String length = "";

        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");

        int answer = scanner.nextInt();

        while ((answer < 2) || (answer >= 20)) {

            System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");

            answer = scanner.nextInt();

            System.out.println("다시 입력해주세요.");
        }

        if (answer >= 2 && answer < 20) {
            for (int i = 0; i < answer; i += 1) {
                length += "\n";
                for (int j = 0; j < answer; j += 1) {
                    length += "*";
                }
            }
        }

        System.out.println(length);
    }
}
