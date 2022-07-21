import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("마름모 출력 프로그램");
        System.out.println("------------------");
        System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

        int size = scanner.nextInt();
        int height = 2 * size -1;

        while (size <= 0 || size >= 10) {
            System.out.println("다시 입력해주세요");

            size = scanner.nextInt();
        }

        for (int i = 0; i <= height; i += 1) {
            for (int j = 1; j <= height + 1; j += 1) {
                if (Math.abs(i) > Math.abs(j - size) && Math.abs(i - 2 * size) > Math.abs(- j + size)){
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
