import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        String starDiamond = "";

        System.out.println("마름모 출력 프로그램");
        System.out.println("------------------");
        System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

        int size = scanner.nextInt();
        int height = 2 * size - 1;

        //입력
        while (size >= 10) {
            System.out.println("마름모 출력 프로그램");
            System.out.println("------------------");
            System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

            size = scanner.nextInt();

            System.out.println("다시 입력해 주세요.");
        }

        for (int i = 0; i <= height; i += 1) {
            for (int j = 1; j <= height + 1; j += 1) {
                if (Math.pow(i, 2) > Math.pow(j - size, 2) && Math.pow(i - 2 * size, 2) > Math.pow(-j + size, 2)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
