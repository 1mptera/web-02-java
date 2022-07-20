import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int trypay = 1000;
        int bonusReward = 0;
        int credit = 5000;

        int[] slotMachineNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] lotteryNumber = new int[3];

        //입력
        while (credit < 10000) {
            System.out.println("Want to play? 1 .Yes, 2. No");
            int answer = scanner.nextInt();

            if (answer == 2) {
                System.out.println("bye bye ~");
                break;
            }

            credit -= trypay;

            for (int i = 0; i < 20; i += 1) {
                int x = random.nextInt(9);
                int y = random.nextInt(9);
                int z = random.nextInt(9);
                lotteryNumber[0] = slotMachineNumber[x];
                lotteryNumber[1] = slotMachineNumber[y];
                lotteryNumber[2] = slotMachineNumber[z];
            }

            System.out.print("Line: ");

            for (int i = 0; i < 3; i += 1) {
                System.out.print(lotteryNumber[i]);
                System.out.print(" . ");
            }
            System.out.println();

            int basicReward = (lotteryNumber[0] * 1000 + lotteryNumber[1] * 1000 + lotteryNumber[2] * 1000) / 20;

            for (int i = 0; i < 3; i += 1) {
                if (lotteryNumber[i] == 7) {
                    bonusReward = basicReward * 4;
                }
                if ((lotteryNumber[i] == 4) || (lotteryNumber[i] == 4) || (lotteryNumber[i] == 4)) {
                    bonusReward = basicReward / 2;
                }
            }

            //처리
            int reward = basicReward + bonusReward;
            credit += reward;

            System.out.println("You won " + reward + " !!!!!");
            System.out.println("Credit: " + credit);

            //출력
            if (credit < 0) {
                System.out.println("Need credit? Go home!");
                System.out.println("bye bye ~");
                break;
            }
        }

        System.out.println("Winer!!");
        System.out.println("bye bye ~");
    }
}
