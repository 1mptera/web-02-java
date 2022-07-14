import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //질문
        System.out.print("What's your name? ");

        //대답
        String answer = scanner.nextLine();

        //출력
        System.out.println("Hello, " + answer + "!");
    }
}
