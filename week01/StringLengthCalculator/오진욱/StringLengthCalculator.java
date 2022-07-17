import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("글자수 계산기");

        String wordName = scanner.nextLine();

        int wordLen = wordName.length();

        System.out.println("글자 수는 " + wordLen + "자 입니다");
    }
}
