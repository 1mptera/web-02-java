import java.util.Scanner;

public class CodingLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("코딩 학습 프로그램");
        System.out.println("1. 빈 칸에 들어갈 문자열 타입을 맞춰주세요.");
        System.out.println("______ = megaptera");

        String answer1 = "String";
        String input1 = scanner.nextLine();

        if (input1.equals(answer1)) {
            count += 1;
        }

        System.out.println("2. 빈 칸에 들어갈 정수형 타입을 맞춰주세요");
        System.out.println("___ = 123");

        String answer2 = "int";
        String input2 = scanner.nextLine();

        if (input2.equals(answer2)) {
            count += 1;
        }

        System.out.println("3. 빈 칸에 들어갈 부동소수점 타입을 맞춰주세요.");
        System.out.println("_____ = 3.14F");

        String answer3 = "float";
        String input3 = scanner.nextLine();

        if (input3.equals(answer3)) {
            count += 1;
        }

        System.out.println("4. 빈 칸에 들어갈 부동소수점 타입을 맞춰주세요.");
        System.out.println("______ = 8.45D");

        String answer4 = "double";
        String input4 = scanner.nextLine();

        if (input4.equals(answer4)) {
            count += 1;
        }

        System.out.println("5. 빈 칸에 들어갈 타입을 맞춰주세요.");
        System.out.println("_______ = true");

        String answer5 = "boolean";
        String input5 = scanner.nextLine();

        if (input5.equals(answer5)) {
            count += 1;
        }

        System.out.println("짝짝짝! 총 " + count + "점입니다.");
    }
}
