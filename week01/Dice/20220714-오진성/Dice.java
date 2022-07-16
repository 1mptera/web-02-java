import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //주사위를 맞춰라!
        System.out.print("주사위를 맞춰라!\n예측 수: ");

        //기적의 찍기
        int answer = scanner.nextInt();

        //데굴데굴!
        int result = random.nextInt(6)+1;
        System.out.println("주사위 수: " + result);

        //과연? 예측여부
        if (answer == result){
            System.out.println("예측에 성공했습니다!");
            return;
        }
        System.out.println("예측에 실패했습니다!");
    }
}
