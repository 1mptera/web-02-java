//1개 라인 = 3슬롯
//7번 n개 -> 기본상금합 * 4 ^ n 배 보너스 = 굳
//4, 8, 9 번 n개 -> 기본상금합 * 0.5^n배 보너 = 좆
//기본상금 = 1000 * 번호 / 20

import javax.sound.sampled.Line;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("##00.0");

        int[] slotNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] selectedNumbers = new int[3];

        int credit = 5000;
        int slotCharge = 1000;

        boolean exit = false;

        while (!exit) {
            //입력
            System.out.println("Want to Play? 1. Yes, 2. No");
            int yesOrNo = scanner.nextInt();

            int advantageCount = 0;
            int disadvantageCount = 0;
            double basicPrice = 0;
            double totalPrice = 0;
            double reward = 0;

            //처리
            if (yesOrNo != 1 && yesOrNo != 2) {
                System.out.println("다시 골라주세요.");
                continue;
            }

            if (yesOrNo == 2) {
                System.out.println("bye bye ~");
                return;
            }

            if (yesOrNo == 1) {
                credit -= slotCharge;

                for (int i = 0; i < selectedNumbers.length; i += 1) {
                    int slotNumber = random.nextInt(9);
                    selectedNumbers[i] = slotNumbers[slotNumber];

                    if (selectedNumbers[i] == 7) {
                        advantageCount += 1;
                    }
                    if (selectedNumbers[i] == 4 || selectedNumbers[i] == 8 || selectedNumbers[i] == 9) {
                        disadvantageCount += 1;
                    }

                    basicPrice = slotCharge * selectedNumbers[i] / 20;
                    totalPrice += basicPrice;
                }

                reward = totalPrice * Math.pow(4, advantageCount) * Math.pow(0.5, disadvantageCount);
                credit += reward;

                //출력
                System.out.println("Line: " + selectedNumbers[0] + " . " + selectedNumbers[1] + " . " + selectedNumbers[2]);
                System.out.println("You won " + reward + " !!!!!");
                System.out.println("Credit: " + credit);

                if (credit < 1000) {
                    System.out.println("Need credit? Go home!");
                    System.out.println("bye bye ~");
                    exit = true;
                }

                if (credit > 10000) {
                    System.out.println("Winner!!");
                    System.out.println("bye bye ~");
                    exit = true;
                }
            }
        }
    }
}
