import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("이용시간: ");
        int usedMin = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");
        boolean isParkingzone = scanner.nextBoolean();


        double totalFee = 1000 + 150 * usedMin;

        if (isParkingzone) {
            totalFee = totalFee * 0.9;
        }

        if (!isParkingzone) {
            totalFee = totalFee + 3000;
        }

        System.out.println("요금: " + totalFee + "원");

    }
}
