import java.util.Scanner;

public class DidYouThinkBeforePay {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //한달 총 지출액 입력
        double inputIncome = scanner.nextDouble();

        double inputExpenditure = scanner.nextDouble();

        int inputContinue;

        // 소비보다 지출이 큰 경우 처리
        if (inputIncome < inputExpenditure) {
            System.out.println("소비가 지출보다 큽니다! 계속하시겠습니까?");
            System.out.println("1. 네\n2. 아니오");
            inputContinue = scanner.nextInt();

            if (inputContinue == 2){
                System.out.println("소비를 줄이는 것을 권장드립니다!");
                return;
            }
            if (inputContinue != 1 && inputContinue != 2) {
                System.out.println("1번 또는 2번을 입력해주세요!");
                return;
            }
        }

        //카테고리 별로 지출하고 싶은 비율 입력
        System.out.println("******* 카테고리 별로 지출비율을 입력해주세요 (10%단위) *******");
        // 나중에 돌아와서 수정할 것!

        //카테고리 별 지출금액 출력

        //세부 소비 내역 계산 및 제안

        //식비

        //옷값

        //교통비

        //오락

        //기타

    }
}
