import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //이용시간 입력
        System.out.print("이용시간(분): ");

        //대답
        int min = scanner.nextInt();

        //파킹존 주차여부
        System.out.print("파킹존 주차여부: ");

        //대답
        String answer1 = scanner.next();

        //요금
        int basicpay = 1000;
        int pay = (basicpay + 150 * min);
        if (answer1.equals("true")) {
            System.out.println("요금: " + pay * 0.9 + "원");
        }
        if (answer1.equals("false")) {
            System.out.println("요금: " + (pay + 3000) + "원");
        }

    }
}
