import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        System.out.println("마름모 출력 프로그램");
        System.out.println("-------------------");

        System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

        //입력
        int diamondLength = scanner.nextInt();
        int diamondHeight = 2 * diamondLength - 1;

        //처리
        while (diamondLength < 1 || diamondLength >= 10) {
            System.out.println("다시 입력해주세요");

            diamondLength = scanner.nextInt();
        }

        for (int i = 1; i <= diamondHeight; i += 1) {
            for (int j = 1; j <= diamondHeight; j += 1) {
                boolean upperHalf = Math.abs(i) > Math.abs(j - diamondLength);
                boolean lowerHalf = Math.abs(i - diamondHeight) >= Math.abs(j - diamondLength);

                if (upperHalf && lowerHalf) {
                    System.out.print("*");

                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
