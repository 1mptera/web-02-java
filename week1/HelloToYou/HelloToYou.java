import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args){
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);

        String Name = scanner.nextLine();

        System.out.println("Hello " + Name + "!");

    }
}
