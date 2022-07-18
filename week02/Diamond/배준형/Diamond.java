import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("마름모 출력 프로그램");
        System.out.println("------------------");
        System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

        int size = scanner.nextInt();

        while (0 >= size || size >= 10) {
            System.out.println("다시 입력해주세요");

            size = scanner.nextInt();
        }
        
        for (int i = 0; i < size; i += 1) {
            for (int j = size - 1; j > i; j -= 1) {
                System.out.print(" ");
            }

            for (int j = -1; j < i * 2; j += 1) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < size; i += 1) {
            for (int j = 0; j < i; j += 1) {
                System.out.print(" ");
            }

            for (int j = size * 2 - 1; j > i * 2; j -= 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
