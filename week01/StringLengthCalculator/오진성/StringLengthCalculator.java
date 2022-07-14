import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("글자수 계산기");
        String answer = scanner.nextLine();

        int length = answer.length();

        //출력
        System.out.println("글자 수는 "+ length + "자 입니다");
    }
}
