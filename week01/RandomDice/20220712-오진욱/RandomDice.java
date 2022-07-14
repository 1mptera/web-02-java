import java.util.Random;
import java.util.Scanner;

public class RandomDice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int diceNumber = random.nextInt(6) + 1;

        System.out.println("주사위를 맞춰라!");
        System.out.print("예측 수 : ");

        int predictNumber = scanner.nextInt();

        System.out.println("주사위 수 : " + diceNumber);

        if(diceNumber == predictNumber){
            System.out.println("예측에 성공했습니다!");
            return;
        }
        System.out.println("예측에 실패했습니다!");
    }
}