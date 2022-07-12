import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("과제를 진행하다가 발생 에러를 어떤 과정으로 해결해야 할까");

        System.out.println("에러 메시지를 정확하게 읽어 보았다");
        System.out.println("1. Yes \n2. No");

        int numYesOrNo1 = scanner.nextInt();

        if (numYesOrNo1 != 1 && numYesOrNo1 != 2) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
            return;
        }

        if (numYesOrNo1 == 2) {
            System.out.println("이제 스스로 더 고민해보면서 문제를 해결해 보세요!");
            return;
        }

        System.out.println("GitHub 저장소 Issue에서 문제에 대한 해결법을 발견했다.");
        System.out.println("1. Yes \n2. No");


        int numYesOrNo2 = scanner.nextInt();


        if (numYesOrNo2 != 1 && numYesOrNo2 != 2) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
            return;
        }


        if (numYesOrNo2 == 2) {
            System.out.println("구글 검색을 통해 에러에 대한 해결 방법을 찾았다.");
            System.out.println("1. Yes \n2. No");


            int numYesOrNo3 = scanner.nextInt();
            if (numYesOrNo3 != 1 && numYesOrNo3 != 2) {
                System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
                return;
            }

            if (numYesOrNo3 == 2) {
                System.out.println("함께 공부하는 동료들이 에러 해결 방법을 알고 있다.");
                System.out.println("1. Yes \n2. No");

                int numYesOrNo4 = scanner.nextInt();
                if (numYesOrNo4 != 1 && numYesOrNo4 != 2) {
                    System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
                    return;
                }

                if (numYesOrNo4 == 2) {
                    System.out.println("트레이너에게 DM을 보내 질문하세요.");
                    return;
                }
            }
        }

        System.out.println("이제 스스로 더 고민해보면서 문제를 해결해 보세요!");

    }
}
