import java.util.Scanner;

public class Comzalral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        //테스트 시작!!
        System.out.println("컴잘알 테스트!! \n");
        System.out.println("---------- 문제 1 -----------");
        System.out.println("CPU 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //첫번째 정답!
        String answer1 = scanner.nextLine().toUpperCase();
        boolean results1 = answer1.replace(" ", "").equals("CENTRALPROCESSINGUNIT");

        //첫번째 정답 확인!
        if (results1) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results1) {
            System.out.println("틀렸습니다. 정답: central processing unit");
        }

        //두번째 문제
        System.out.println("---------- 문제 2 -----------");
        System.out.println("RAM 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //두번째 정답!
        String answer2 = scanner.nextLine().toUpperCase();
        boolean results2 = answer2.replace(" ", "").equals("RANDOMACCESSMEMORY");

        //두번째 정답 확인!
        if (results2) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results2) {
            System.out.println("틀렸습니다. 정답: random access memory");
        }

        //세번째 문제
        System.out.println("---------- 문제 3 -----------");
        System.out.println("SSD 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //세번째 정답!
        String answer3 = scanner.nextLine().toUpperCase();
        boolean results3 = answer3.replace(" ", "").equals("SOLIDSTATEDISK");

        //세번째 정답 확인!
        if (results3) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results3) {
            System.out.println("틀렸습니다. 정답: solid state disk");
        }

        //네번째 문제
        System.out.println("---------- 문제 4 -----------");
        System.out.println("HDD 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //네번째 정답!
        String answer4 = scanner.nextLine().toUpperCase();
        boolean results4 = answer4.replace(" ", "").equals("HARDDISKDRIVE");

        //네번째 정답 확인!
        if (results4) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results4) {
            System.out.println("틀렸습니다. 정답: hard disk drive");
        }

        //다섯번째 문제
        System.out.println("---------- 문제 5 -----------");
        System.out.println("API 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //다섯번째 정답!
        String answer5 = scanner.nextLine().toUpperCase();
        boolean results5 = answer5.replace(" ", "").equals("APPLICATIONPROGRAMMINGINTERFACE");

        //다섯번째 정답 확인!
        if (results5) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results5) {
            System.out.println("틀렸습니다. 정답: application programming interface");
        }

        //여섯번째 문제
        System.out.println("---------- 문제 6 -----------");
        System.out.println("Github 에서 사용하는 PR 은 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //여섯번째 정답!
        String answer6 = scanner.nextLine().toUpperCase();
        boolean results6 = answer6.replace(" ", "").equals("PULLREQUEST");

        //여섯번째 정답 확인!
        if (results6) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results6) {
            System.out.println("틀렸습니다. 정답: pull request");
        }

        //일곱번째 문제
        System.out.println("---------- 문제 7 -----------");
        System.out.println("java -cp 명령어에서 cp 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //일곱번째 정답!
        String answer7 = scanner.nextLine().toUpperCase();
        boolean results7 = answer7.replace(" ", "").equals("CLASSPATH");

        //일곱번째 정답 확인!
        if (results7) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results7) {
            System.out.println("틀렸습니다. 정답: classpath");
        }

        //여덟번째 문제
        System.out.println("---------- 문제 8 -----------");
        System.out.println("javac -d 명령어에서 d 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //여덟번째 정답!
        String answer8 = scanner.nextLine().toUpperCase();
        boolean results8 = answer8.replace(" ", "").equals("DIRECTORY");

        //여덟번째 정답 확인!
        if (results8) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results8) {
            System.out.println("틀렸습니다. 정답: directory");
        }

        //아홉번째 문제
        System.out.println("---------- 문제 9 -----------");
        System.out.println("저장장체 단위인 MB 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //아홉번째 정답!
        String answer9 = scanner.nextLine().toUpperCase();
        boolean results9 = answer9.replace(" ", "").equals("MEHABYTE");

        //아홉번째 정답 확인!
        if (results9) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results9) {
            System.out.println("틀렸습니다. 정답: megabyte");
        }

        //열번째 문제
        System.out.println("---------- 문제 10 -----------");
        System.out.println("JVM 는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력: ");

        //열번째 정답!
        String answer10 = scanner.nextLine().toUpperCase();
        boolean results10 = answer10.replace(" ", "").equals("JAVAVIRTUALMACHINE");

        //열번째 정답 확인!
        if (results10) {
            count = (count + 1);
            System.out.println("정답입니다. 점수 " + count + "점");
        }
        if (!results10) {
            System.out.println("틀렸습니다. 정답: java virtual machine");
        }

        //메세지
        if (count <= 2) {
            System.out.println("컴알못이네요. 분발해주세요!");
        return;
        }
        if (count <= 5) {
            System.out.println("조금만 더 노력해주세요!");
        return;
        }
        if (count <= 8) {
            System.out.println("잘하고 있어요!");
        return;
        }
        if (count <= 10) {
            System.out.println("컴잘알 이시군요. 완벽해요!");
        return;
        }

    }
}
