import java.util.Scanner;

public class HelloToYou {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");

        String yourName = scanner.nextLine();

        System.out.println("Hello, " + yourName + "!");
    }
}
