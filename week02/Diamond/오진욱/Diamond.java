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
            int rhombuslength = scanner.nextInt();
            int rhombusHeight = 2 * rhombuslength - 1;

            //처리
            if (rhombuslength < 1 || rhombuslength > 10) {
                System.out.println("다시 입력해주세요");
                continue;
            }

            for (int i = 1; i <= rhombusHeight; i += 1) {
                for (int j = 1; j <= rhombusHeight; j += 1) {
                    if (i <= rhombuslength) {
                        if (j >= rhombuslength - i + 1 && j <= rhombuslength + i - 1) {
                            star += "*";
                            continue;
                        }
                        star += " ";
                    }

                    if (i > rhombuslength) {
                        if (j <= i - rhombuslength || j >= rhombusHeight - (i - rhombuslength) + 1) {
                            star += " ";
                            continue;
                        }
                        star += "*";
                    }
                }
                star += "\n";
            }

            //출력
            System.out.println(star);
            return;
        }
    }
}
