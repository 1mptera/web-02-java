import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("주사위를 맞춰라!");
        System.out.print("예측 수: ");

        int number = scanner.nextInt();

        int dice = random.nextInt(6) + 1;

        System.out.println("주사위 수: " + dice);

        if (number == dice) {
            System.out.println("예측에 성공했습니다!");
        }
        if (number != dice) {
            System.out.println("예측에 실패했습니다!");
        }
    }
}

