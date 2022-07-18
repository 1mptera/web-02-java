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

        int[] randomSlotNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] realSlotMachine = new int[3];

        int credit = 5000;
        int slotCharge = 1000;

        while (true) {
            //입력
            System.out.println("Want to Play? 1. Yes, 2. No");
            int yesOrNo = scanner.nextInt();

            int countSeven = 0;
            int count489 = 0;
            double basicPrice = 0;
            double got = 0;

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

                for (int i = 0; i < realSlotMachine.length; i += 1) {
                    int slotNumber = random.nextInt(9);
                    realSlotMachine[i] = randomSlotNumber[slotNumber];

                    if (realSlotMachine[i] == 7) {
                        countSeven += 1;
                    }
                    if (realSlotMachine[i] == 4 || realSlotMachine[i] == 8 || realSlotMachine[i] == 9) {
                        count489 += 1;
                    }

                    basicPrice += slotCharge * realSlotMachine[i] / 20;
                }

                got = basicPrice * Math.pow(4, countSeven) * Math.pow(0.5, count489);
                credit += got;

                //출력
                System.out.println("Line: " + realSlotMachine[0] + " . " + realSlotMachine[1] + " . " + realSlotMachine[2]);
                System.out.println("You won " + got + " !!!!!");
                System.out.println("Credit: " + credit);

                if (credit < 1000) {
                    System.out.println("Need credit? Go home!");
                    System.out.println("bye bye ~");
                    return;
                }

                if (credit > 10000) {
                    System.out.println("Winner!!");
                    System.out.println("bye bye ~");
                    return;
                }
            }
        }
    }
}
