import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (count < 3) {
            System.out.print("Input2 numbers:");

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x + " + " + y + " = ?");

            int answer = scanner.nextInt();

            boolean result = answer == x + y;

            if (result){
                count += 1;

                System.out.println("You're right! " + "(" + count + ")");
            }
            if (!result){
                System.out.println("what?");
            }
        }

        System.out.println("Escape!");
    }
}
