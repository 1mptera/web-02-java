import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int trypay = 1000;
        int bonusgot = 0;
        int credit = 5000;

        int[] slotmachinenumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //입력
        while (true) {
            System.out.println("Want to play? 1 .Yes, 2. No");
            int answer = scanner.nextInt();

            credit -= trypay;

            for (int i = 0; i < 20; i += 1) {
                int x = random.nextInt(9);
                int y = random.nextInt(9);
                int z = random.nextInt(9);
                ;
                slotmachinenumber[0] = slotmachinenumber[x];
                slotmachinenumber[1] = slotmachinenumber[y];
                slotmachinenumber[2] = slotmachinenumber[z];
            }

            System.out.print("Line: ");

            for (int i = 0; i < 3; i += 1) {
                System.out.print(slotmachinenumber[i]);
                System.out.print(" . ");
            }
            System.out.println("");

            int basicgot = (slotmachinenumber[0] * 1000 + slotmachinenumber[1] * 1000 + slotmachinenumber[2] * 1000) / 20;

            for (int i = 0; i < 3; i += 1) {
                if (slotmachinenumber[i] == 7) {
                    bonusgot = basicgot * 4;
                }
                if ((slotmachinenumber[i] == 4) || (slotmachinenumber[i] == 4) || (slotmachinenumber[i] == 4)) {
                    bonusgot = basicgot / 2;
                }
            }

            //처리
            int got = basicgot + bonusgot;
            credit += got;

            System.out.println("You won " + got + " !!!!!");
            System.out.println("Credit: " + credit);

            //출력
            if (credit >10000){
                System.out.println("Winer!!");
                System.out.println("bye bye ~");
            break;
            }

            if (credit < 0){
                System.out.println("Need credit? Go home!");
                System.out.println("bye bye ~");
            break;
            }

            if (answer == 1) {
                continue;
            }

            if (answer == 2) {
                System.out.println("bye bye ~");
                break;
            }
        }
    }
}
