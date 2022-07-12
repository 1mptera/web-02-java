import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("과제를 진행하다가 발생한 에러를 어떤 과정으로 해결해야 할까?");
        System.out.println("에러 메시지를 정확하게 읽어 보았다.\n1. Yes\n2. No ");

        int option1 = scanner.nextInt();

        if (option1 != 1 && option1 != 2) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
            return;
        }
        if (option1 == 2) {
            System.out.println("이제 스스로 더 고민해보면서 문제를 해결해보세요!");
            return;
        }

        System.out.println("GitHub 저장소 Issue 에서 문제에 대한 해결법을 발견했다.\n1. Yes\n2. No ");

        int option2 = scanner.nextInt();

        if (option2 != 1 && option2 != 2) {
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
            return;
        }

        if (option2 == 2) {
            System.out.println("구글 검색을 통해 에러에 대한 해결방법을 찾았다.\n1. Yes\n2. No ");

            int option3 = scanner.nextInt();

            if (option3 != 1 && option3 != 2) {
                System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
                return;
            }

            if (option3 == 2) {
                System.out.println("함께 공부하는 동료들이 에러 해결방법을 알고 있다. \n1. Yes\n2. No ");

                int option4 = scanner.nextInt();

                if (option4 != 1 && option4 != 2) {
                    System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");
                    return;
                }

                if (option4 == 2) {
                    System.out.println("트레이너에게 DM을 보내 질문하세요.");
                    return;

                }
            }

        }

        System.out.println("이제 스스로 더 고민해보면서 문제를 해결해보세요!");


    }
}
