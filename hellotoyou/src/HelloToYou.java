import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        System.out.print("What's your name? ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
