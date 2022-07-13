import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이용시간(분): ");

        int time = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");

        boolean parking = scanner.nextBoolean();

        int fee = 1000;

        if (parking == true) {
            fee = (fee + 150 * time) * 90 / 100;
        }
        if (parking == false){
            fee = fee + 150 * time + 3000;
        }


        System.out.println("요금: " + fee);
    }
}
