import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("글자수 계산기");

        String inputWord = scanner.nextLine();

        int wordLen = inputWord.length();

        System.out.println("글자 수는 " + wordLen + "자 입니다");

    }
}