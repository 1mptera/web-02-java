import java.util.Scanner;

public class QuizEscape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        //1단계
        System.out.println("자바 감옥 탈출 퀴즈 게임!");
        System.out.println("------1단계 문제------");
        System.out.println("자바의 보일러플레이트 코드 순서대로 번호를 입력하시오.");
        System.out.println("1. void \n2. public \n3. main (String[] args){}");
        System.out.println("4. static");

        int answer1 = scanner.nextInt();
        boolean results = answer1 == 2413;
        if (!results) {
            count = (count + 1);
            System.out.println(count + "단계 탈출에 실패하셨습니다.");
            return;
        }
        count = (count + 1);
        System.out.println(count + "단계 문제를 통과하셨습니다!");

        //2단계
        System.out.println("------2단계 문제------");
        System.out.println("저장 공간이 큰 타입부터 번호를 입력하시오.");
        System.out.println("1. byte \n2. short \n3. int \n4. long");

        int answer2 = scanner.nextInt();
        boolean results2 = answer2 == 1234;
        if (!results2) {
            count = (count + 1);
            System.out.println(count + "단계 탈출에 실패하셨습니다.");
            return;
        }
        count = (count + 1);
        System.out.println(count + "단계 문제를 통과하셨습니다!");

        //3단계
        System.out.println("------3단계 문제------");
        System.out.println("연산자 우선순위가 높은 순서대로 입력하시오.");
        System.out.println("1. * \n2. + \n3. == \n4. ! \n5. ||");

        int answer3 = scanner.nextInt();
        boolean results3 = answer3 == 41235;
        if (!results3) {
            count = (count + 1);
            System.out.println(count + "단계 탈출에 실패하셨습니다.");
            return;
        }
        count = (count + 1);
        System.out.println(count + "단계 문제를 통과하셨습니다!");

        //4단계
        System.out.println("------4단계 문제------");
        System.out.println("저장 공간이 작은 타입부터 번호를 입력하시오.");
        System.out.println("1. float \n2. char \n3. boolean \n4. double");

        int answer4 = scanner.nextInt();
        boolean results4 = answer4 == 3214;
        if (!results4) {
            count = (count + 1);
            System.out.println(count + "단계 탈출에 실패하셨습니다.");
            return;
        }
        count = (count + 1);
        System.out.println(count + "단계 문제를 통과하셨습니다!");

        //5단계
        System.out.println("------5단계 문제------");
        System.out.println("자바 프로그램 실행 순서대로 번호를 입력하시오.");
        System.out.println("1. 자바 소스코드를 바이트코드로 실행");
        System.out.println("2. 바이트 코드를 클래스 파일에 저장");
        System.out.println("3. 바이크 코드 실행");
        System.out.println("4. JVM 구동\n5. 클래스 파일 로드");
        System.out.println("6. 자바 소스코드 생성 및 작성");

        int answer5 = scanner.nextInt();
        boolean results5 = answer5 == 612453;
        if (!results5) {
            count = (count + 1);
            System.out.println(count + "단계 탈출에 실패하셨습니다.");
            return;
        }
        count = (count + 1);
        System.out.println(count + "단계 문제를 통과하셨습니다!");


    }
}
