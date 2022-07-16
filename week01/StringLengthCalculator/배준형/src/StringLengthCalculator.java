import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args) {
        //0. 준비
        Scanner scanner = new Scanner(System.in);

        //1.입력
        System.out.println("글자수 게산기");

        String letter = scanner.nextLine();

        int stlLength = letter.length();

        //2. 결과
        System.out.println("글자 수는 " + stlLength + "자 입니다");
    }
}
