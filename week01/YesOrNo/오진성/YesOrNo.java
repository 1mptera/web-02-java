import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //질문 시작
        System.out.println("과제를 진행하다가 발생한 에러를 어떤 과정으로 해결해야 할까?");
        System.out.println("에러 메세지를 정확하게 읽어 보았다 \n1. Yes \n2. No");

        int answer1 = scanner.nextInt();

        boolean results1 = answer1 == 1;
        if (answer1 == 2) {
            System.out.println("이제 스스로 더 고민해보면서 문제를 해결해 보세요!");
            return;
        }
        if ((answer1 != 1 && answer1 != 2)) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
            return;
        }

        System.out.println("GitHub 저장소 Issue에서 문제에 대한 해결법을 발견했다.\n1. Yes \n2. No");

        int answer2 = scanner.nextInt();

        if (answer2 == 2) {
            System.out.println("구글 검색을 통해 에러에 대한 해결 방법을 찿았다.\n1. Yes \n2. No");
        }
        if (answer2 == 1) {
            System.out.println("이제 스스로 더 고민해보면서 문제를 해결해 보세요!\n1. Yes \n2. No");
            return;
        }
        if ((answer2 != 1 && answer2 != 2)) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.\n1. Yes \n2. No");
            return;
        }

        int answer3 = scanner.nextInt();

        if (answer3 == 2) {
            System.out.println("함께 공부하는 동료들이 에러 해결 방법을 알고 있다.\n1. Yes \n2. No");
        }
        if (answer3 == 1) {
            System.out.println("이제 스스로 더 고민해보면서 문제를 해결해 보세요!\n1. Yes \n2. No");
            return;
        }
        if (answer3 != 1 && answer3 != 2) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.\n1. Yes \n2. No");
            return;
        }

        int answer4 = scanner.nextInt();

        if (answer4 == 1) {
            System.out.println("이제 스스로 더 고민해보면서 문제를 해결해 보세요!\n1. Yes \n2. No");
            return;
        }
        if (answer4 == 2) {
            System.out.println("트레이너에게 DM을 보내 질문하세요.\n1. Yes \n2. No");
            return;
        }
        if (answer4 != 1 && answer4 != 2) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.\n1. Yes \n2. No");
            return;
        }
    }
}
