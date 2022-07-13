import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numebers: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + " + " + y + "=?");
        int answer1 = scanner.nextInt();

        System.out.println(x + " * " + y + "=?");
        int answer2 = scanner.nextInt();

        boolean result1 = answer1 == x + y;
        boolean result2 = answer2 == x * y;

        if (result1 && result2){
            System.out.println("Genius!");
        }
        if (result1 && !result2 || !result1 && result2){
            System.out.println("Muggle!");
        }
        if (!result1 && !result2){
            System.out.println("Stupid!");
        }
    }
}
