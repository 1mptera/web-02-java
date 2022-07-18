import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        String countstar = "";

        //입력

        while (true) {
            int size = scanner.nextInt();
            int base = 2 * size - 1;

            System.out.println("마름모 출력 프로그램");
            System.out.println("------------------");
            System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

            if (size > 10) {
                System.out.println("다시 입력해 주세요.");
            }
            for (int i = 0; i < size; i += 1) {
                for (int j = 0; j < base; j += 1) {
                    if (j > size - j + 1 && j < size + j - 1) {
                        countstar += "*";
                    }
                    countstar += "\n";
                }
            }
            for (int i = 0; i < size - 1; i += 1) {
                for (int j = 0; j < base; j += 1) {
                    if (j > i + 1 && j < base - i - 1) {
                        countstar += "*";
                    }
                    countstar += "\n";
                }

            }
            break;
        }
        System.out.println(countstar);

    }
}
