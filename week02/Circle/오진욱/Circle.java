// 요구사항
// 지름 : 2n + 1
// 원의 정의 : 같은 위치에 있는 점들의 집합 -> 테두리 *이 반지름 크기보다 작아야 함.
// 중심부터 테두리 *까지의 길이 : root(|r - i|^2 + |r - j|^2) < r
// r^2

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        String star = "";

        boolean exit = false;

        System.out.println("원 출력 프로그램");
        System.out.println("---------------------");

        while (!exit){
            System.out.println("반지름을 입력하세요 : ");
            //입력
            int radius = scanner.nextInt();
            int diameter = 2 * radius + 1;

            System.out.println("");

            //처리
            boolean radiusSize = radius > 2 && radius < 20;

            if (!radiusSize){
                System.out.println("다시 입력해주세요!");
                continue;
            }

            for (int i = 0; i < diameter; i += 1) {
                for (int j = 0; j < diameter; j += 1) {
                    boolean circleDefinition = Math.pow((radius - i), 2) + Math.pow((radius - j), 2) <= Math.pow(radius, 2);
                    if (circleDefinition) {
                        star += "*";
                    }

                    if (!circleDefinition) {
                        star += " ";
                    }
                }
                star += "\n";
            }

            exit = true;
        }
        //출력
        System.out.println(star);
    }
}
