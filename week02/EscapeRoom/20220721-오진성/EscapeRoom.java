import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;

        while (point < 3) {
            System.out.print("Input 2 numbers: ");

            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            System.out.println(number1 + " + " + number2 + " = ?");

            int answer = scanner.nextInt();
            boolean result = answer == number1 + number2;

            if (result) {
                point += 1;
                System.out.println("You're right! (" + point + ")");
            }

            if (!result) {
                System.out.println("What?");
            }
        }
        System.out.println("Escape!");
    }
}
