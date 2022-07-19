import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원 출력 프로그램");
        System.out.println("----------------");
        System.out.println("반지름의 크기를 입력해 주세요(2 이상 20 미만)");

        int radius = scanner.nextInt();

        while (radius < 2 || radius >= 20) {
            System.out.println("다시 입력해주세요");

            radius = scanner.nextInt();
        }

        int diameter = radius * 2 + 1;

        for(int i = 0; i < diameter; i += 1){
            for (int j = 0; j < diameter; j += 1){
                boolean range = Math.pow((radius - i), 2) + Math.pow((radius - j), 2) <= Math.pow(radius, 2);

                if (range){
                    System.out.print("*");
                }

                if (!range){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
