import java.util.Scanner;

public class CodingLearner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        System.out.println("코딩 학습 프로그램");

        System.out.println("1. 빈칸에 들어갈 문자열 타입을 작성해주세요.");
        System.out.println("------ = \"megaptera\"");

        String inputAnswer1 = scanner.nextLine();
        boolean stringCheck = inputAnswer1.equals("String");

        if(stringCheck) {
            correctCount = correctCount + 1;
        }

        System.out.println("2. 빈칸에 들어갈 정수열 타입을 작성해주세요.");
        System.out.println("--- = 123");

        String inputAnswer2 = scanner.nextLine();
        boolean stringCheck2 = inputAnswer2.equals("int");


        if(stringCheck2) {
            correctCount = correctCount + 1;
        }

        System.out.println("3. 빈칸에 들어갈 부동소수점 타입을 작성해주세요.");
        System.out.println("----- = 3.14F");

        String inputAnswer3 = scanner.nextLine();
        boolean stringCheck3 = inputAnswer3.equals("float");

        if(stringCheck3) {
            correctCount = correctCount + 1;
        }

        System.out.println("4. 빈칸에 들어갈 부동소수점 타입을 작성해주세요.");
        System.out.println("------ 8.45D");

        String inputAnswer4 = scanner.nextLine();
        boolean stringCheck4 = inputAnswer4.equals("double");

        if(stringCheck4) {
            correctCount = correctCount + 1;
        }

        System.out.println("5. 빈칸에 들어갈 타입을 작성해주세요.");
        System.out.println("_______ = true");

        String inputAnswer5 = scanner.nextLine();
        boolean stringCheck5 = inputAnswer5.equals("boolean");

        if(stringCheck5) {
            correctCount = correctCount + 1;
        }

        System.out.println("짝짝짝 ! 총 " + correctCount +"점 입니다!");

    }
}
