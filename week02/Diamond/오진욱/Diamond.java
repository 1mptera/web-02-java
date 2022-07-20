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
            int rhombusLength = scanner.nextInt();
            int rhombusHeight = 2 * rhombusLength - 1;

            //처리
            if (rhombusLength < 1 || rhombusLength > 10) {
                System.out.println("다시 입력해주세요");
                continue;
            }

            for (int i = 1; i <= rhombusHeight; i += 1) {
                for (int j = 1; j <= rhombusHeight; j += 1) {
                    if (i <= rhombusLength) {
                        if (j - rhombusLength <= i - 1 && j - rhombusLength >= 1 - i) {
                                System.out.print("*");
                            continue;
                        }
                        System.out.print("O");
                    }

                    if (i > rhombusLength) {
                        if (j <= i - rhombusLength || j >= rhombusHeight - (i - rhombusLength) + 1) {

                            System.out.print("O");
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
