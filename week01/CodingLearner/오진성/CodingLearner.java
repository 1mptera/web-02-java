import java.util.Scanner;

public class CodingLearner {
    public static void main(String[] args) {

        int count = 0;

        //첫문제
        System.out.println("코딩 학습 프로그램");
        System.out.println("1. 빈 칸에 들어갈 문자열 타입을 작성해주세요.");
        System.out.println("______ = \" Megatera \" ");

        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        boolean result = answer.equals("String");

        if (result) {
            count += 1;
        }

        System.out.println("2. 빈 칸에 들어갈 정수형 타입을 맞춰주세요.");
        System.out.println("___ = 123 ");

        String answer2 = scanner.nextLine();
        boolean result2 = answer2.equals("int");

        if (result2) {
            count += 1;
        }

        System.out.println("3. 빈 칸에 들어갈 부동소수점 타입을 맞춰주세요.");
        System.out.println("_____ = 3.14F ");

        String answer3 = scanner.nextLine();
        boolean result3 = answer3.equals("float");

        if (result3) {
            count += 1;
        }

        System.out.println("4. 빈 칸에 들어갈 부동소수점 타입을 맞춰주세요.");
        System.out.println("______ = 8.45D ");

        String answer4 = scanner.nextLine();
        boolean result4 = answer4.equals("double");

        if (result4) {
            count += 1;
        }

        System.out.println("5. 빈 칸에 들어갈 타입을 맞춰주세요.");
        System.out.println("_______ = true ");

        String answer5 = scanner.nextLine();
        boolean result5 = answer5.equals("boolean");

        if (result5) {
            count += 1;
        }

        //점수
        System.out.println("짝짝짝! 총 " + count + "점 입니다!");
    }
}
