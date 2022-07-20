import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        String star = "";

        System.out.println("마름모 출력 프로그램");
        System.out.println("-------------------");
        System.out.println("도형의 크기를 입력해 주세요(10 미만의 자연수)");

        while (true) {
            //입력
            int diamondLength = scanner.nextInt();
            int diamondHeight = 2 * diamondLength - 1;

            //처리
            if (diamondLength < 1 || diamondLength > 10) {
                System.out.println("다시 입력해주세요");
                continue;
            }

            for (int i = 1; i <= diamondHeight; i += 1) {
                for (int j = 1; j <= diamondHeight; j += 1) {
                    if (i <= diamondLength) {
                        if (Math.abs(j - diamondLength) <= Math.abs(i - 1)) {
                            System.out.print("*");

                            continue;
                        }
                        System.out.print(" ");
                    }

                    if (i > diamondLength) {
                        if (j <= i - diamondLength || j >= diamondHeight - (i - diamondLength) + 1) {
                            System.out.print(" ");

                            continue;
                        }
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }

            //출력
            System.out.println(star);
            return;
        }
    }
}
