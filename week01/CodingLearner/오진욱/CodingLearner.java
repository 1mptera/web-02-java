import java.util.Scanner;

public class CodingLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        System.out.println("코딩 학습 프로그램");

        System.out.println("1. 빈칸에 들어갈 문자열 타입을 작성해주세요.");
        System.out.println("_______ = \"megaptera\"");

        String answer1 = scanner.nextLine();
        boolean isCorrect1 = answer1.equals("String");

        if(isCorrect1) {
            correctCount = correctCount + 1;
        }

        System.out.println("2. 빈칸에 들어갈 정수열 타입을 작성해주세요.");
        System.out.println("___ = 123");

        String answer2 = scanner.nextLine();
        boolean isCorrect2 = answer2.equals("int");

        if(isCorrect2) {
            correctCount = correctCount + 1;
        }

        System.out.println("3. 빈칸에 들어갈 부동소수점 타입을 작성해주세요.");
        System.out.println("_____ = 3.14F");

        String answer3 = scanner.nextLine();
        boolean isCorrect3 = answer3.equals("float");

        if(isCorrect3) {
            correctCount = correctCount + 1;
        }

        System.out.println("4. 빈칸에 들어갈 부동소수점 타입을 작성해주세요.");
        System.out.println("______ 8.45D");

        String answer4 = scanner.nextLine();
        boolean isCorrect4 = answer4.equals("double");

        if(isCorrect4) {
            correctCount = correctCount + 1;
        }

        System.out.println("5. 빈칸에 들어갈 타입을 작성해주세요.");
        System.out.println("_______ = true");

        String answer5 = scanner.nextLine();
        boolean isCorrect5 = answer5.equals("boolean");

        if(isCorrect5) {
            correctCount = correctCount + 1;
        }

        System.out.println("짝짝짝 ! 총 " + correctCount +"점 입니다!");
    }
}
