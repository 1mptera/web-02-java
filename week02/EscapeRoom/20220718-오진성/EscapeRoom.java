import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        int point = 0;

        //입력
        System.out.print("Input 2 numbers: ");

        //처리
        for (; ; ) {
            int numbers1 = scanner.nextInt();
            int numbers2 = scanner.nextInt();

            System.out.println(numbers1 + " + " + numbers2 + " =?");

            int answer = scanner.nextInt();

            if (answer == (numbers1 + numbers2)) {
                point += 1;
                System.out.println("You're right! (" + point + ")");
                if (point == 3) {
                    break;
                }
                continue;
            }
            System.out.println("What?");
        }

        //출력
        System.out.println("Escape!");
    }
}
