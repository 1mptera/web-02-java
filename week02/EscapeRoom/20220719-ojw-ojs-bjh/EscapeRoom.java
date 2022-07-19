import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        //준비 : 변수, 인스턴스 선언
        Scanner scanner = new Scanner(System.in);

        int point = 0;

        while (point < 3) {
            System.out.print("Input 2 number: ");

            //입력 : 스캐너로 입력 받음
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            System.out.println(number1 + " + " + number2 + " = ?");

            int answer = scanner.nextInt();

            boolean result = answer == number1 + number2;

            //처리 : 조건문으로 처리
            if (result) {
                point += 1;

                System.out.println("You're right! (" + point + ")");
                continue;
            }

            if (!result) {
                System.out.println("What?");
            }
        }
        //출력 : 최종 결과값 출력
        System.out.println("Escape!");
    }
}
