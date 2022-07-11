import java.util.Scanner;

public class CodingLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("코딩 학습 프로그램");
        System.out.println("1. 빈 칸에 들어갈 문자열 타입을 맞춰주세요.");
        System.out.println("______ = megaptera");

        String a1 = "String";
        String answer1 = scanner.nextLine();

        if (a1.equals(answer1) ){
            count = count + 1;
        }

        System.out.println("2. 빈 칸에 들어갈 정수형 타입을 맞춰주세요");
        System.out.println("___ = 123");

        String a2 = "int";
        String answer2 = scanner.nextLine();

        if (a2.equals(answer2) ){
            count = count + 1;
        }

        System.out.println("3. 빈 칸에 들어갈 부동소수점 타입을 맞춰주세요.");
        System.out.println("_____ = 3.14F");

        String a3 = "float";
        String answer3 = scanner.nextLine();

        if (a3.equals(answer3) ){
            count = count + 1;
        }

        System.out.println("4. 빈 칸에 들어갈 부동소수점 타입을 맞춰주세요.");
        System.out.println("______ = 8.45D");

        String a4 = "double";
        String answer4 = scanner.nextLine();

        if (a4.equals(answer4) ){
            count = count + 1;
        }

        System.out.println("5. 빈 칸에 들어갈 타입을 맞춰주세요.");
        System.out.println("_______ = true");

        String a5 ="boolean";
        String answer5 = scanner.nextLine();

        if (a5.equals(answer5) ){
            count = count + 1;
        }

        System.out.println("짝짝짝! 총 " + count + "점입니다.");
    }
}
