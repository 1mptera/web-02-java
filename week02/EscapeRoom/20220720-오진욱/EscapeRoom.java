//요구사항 : 덧셈 3문제 맞추면(mvp) + 탈출 프로그램 + 틀리면 What, 다시입력

import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (count < 3) {
            //입력
            System.out.print("Input 2 numbers: ");

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x + " + " + y + " = ?");

            int answer = scanner.nextInt();

            //처리'
            boolean result = answer == x + y;

            if (result) {
                count += 1;
            }

            //출력
            if (result) {
                System.out.println("You're right! (" + count + ")");
            }

            if (!result) {
                System.out.println("What?");
            }
        }
        System.out.println("Escape!");
    }
}
