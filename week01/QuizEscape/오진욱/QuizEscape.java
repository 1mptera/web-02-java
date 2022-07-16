import java.util.Scanner;

public class QuizEscape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int levelCounter = 0;

        String modelAnswer1 = "2413";
        String modelAnswer2 = "1234";
        String modelAnswer3 = "41235";
        String modelAnswer4 = "3214";
        String modelAnswer5 = "612453";

        System.out.println("자바감옥 탈출 퀴즈 게임!");

        levelCounter += 1;
        System.out.println("------1단계 문제-------");
        System.out.println("자바의 보일러플레이트 코드 순서대로 번호를 입력하시오.");
        System.out.println("1. void");
        System.out.println("2. public");
        System.out.println("3. main(String[] args){}");
        System.out.println("4. static");

        String yourAnswer1 = scanner.nextLine();

        boolean isCorrect1 = yourAnswer1.equals(modelAnswer1);

        if (!isCorrect1) {
            System.out.println(levelCounter + "단계 탈출에 실패하였습니다.");
            return;
        }

        System.out.println(levelCounter + "단계 문제를 통과하셨습니다!");

//      2단계
        levelCounter += 1;
        System.out.println("------2단계 문제-------");
        System.out.println("저장 공간이 큰 타입부터 번호를 입력하시오.");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");

        String yourAnswer2 = scanner.nextLine();
        boolean isCorrect2 = yourAnswer2.equals(modelAnswer2);

        if (!isCorrect2) {
            System.out.println(levelCounter + "단계 탈출에 실패하였습니다.");
            return;
        }

        System.out.println(levelCounter + "단계 문제를 통과하셨습니다!");

//      3단계
        levelCounter += 1;
        System.out.println("------2단계 문제-------");
        System.out.println("연산자 우선순위가 높은 순서대로 번호를 입력하시오.");
        System.out.println("1. *");
        System.out.println("2. +");
        System.out.println("3. ==");
        System.out.println("4. !");
        System.out.println("5. ||");

        String yourAnswer3 = scanner.nextLine();
        boolean isCorrect3 = yourAnswer3.equals(modelAnswer3);

        if (!isCorrect3) {
            System.out.println(levelCounter + "단계 탈출에 실패하였습니다.");
            return;
        }

        System.out.println(levelCounter + "단계 문제를 통과하셨습니다!");

//      4단계
        levelCounter += 1;
        System.out.println("------4단계 문제-------");
        System.out.println("저장 공간이 작은 타입부터 번호를 입력하세요");
        System.out.println("1. float");
        System.out.println("2. char");
        System.out.println("3. boolean");
        System.out.println("4. double");

        String yourAnswer4 = scanner.nextLine();
        boolean isCorrect4 = yourAnswer4.equals(modelAnswer4);

        if (!isCorrect4) {
            System.out.println(levelCounter + "단계 탈출에 실패하였습니다.");
            return;
        }

        System.out.println(levelCounter + "단계 문제를 통과하셨습니다!");

//      5단계
        levelCounter += 1;
        System.out.println("------5단계 문제-------");
        System.out.println("자바 프로그램 실행 순서대로 번호를 입력하시오");
        System.out.println("1. 자바 소스코드를 바이트코드로 변환");
        System.out.println("2. 바이트 코드를 클래스 파일에 저장");
        System.out.println("3. 바이크 코드 실행");
        System.out.println("4. JVM 구동");
        System.out.println("5. 클래스 파일 로드");
        System.out.println("6. 자바 소스코드 생성 및 작성");

        String yourAnswer5 = scanner.nextLine();
        boolean isCorrect5 = yourAnswer5.equals(modelAnswer5);

        if (!isCorrect5) {
            System.out.println(levelCounter + "단계 탈출에 실패하였습니다.");
            return;
        }

        System.out.println(levelCounter + "단계 문제를 통과하셨습니다!");
        System.out.println("자바감옥 탈출에 성공하셨습니다!");
    }
}
