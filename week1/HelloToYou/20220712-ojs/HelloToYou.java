import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //이름이 뭐니?
        System.out.print("What's your name? ");

        //이름
        String answer = scanner.nextLine();

        // 안녕, 이름!
        System.out.print("Hello, " + answer + "!");
    }
}
