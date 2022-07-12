import java.util.Scanner;

public class StringLengthCalculatou {
    public static void main(String[] args){



        System.out.println("글자수 계산기");

        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();

        int answer2 = answer.length();




    //출력
    System.out.println("글자 수는 "+ answer2 + "자 입니다");
    }
}
