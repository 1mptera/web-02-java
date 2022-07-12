import java.util.Random;
import java.util.Scanner;

public class RandomDice {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int diceNum = random.nextInt(6) + 1;

        System.out.println("주사위를 맞춰라!");
        System.out.print("예측 수 : ");

        int predictNum = scanner.nextInt();

        System.out.println("주사위 수 : " + diceNum);

        if(diceNum == predictNum){
            System.out.println("예측에 성공했습니다!");
            return;
        }
        System.out.println("예측에 실패했습니다!");

    }
}
