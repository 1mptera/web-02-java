import java.util.Scanner;

public class DidYouThinkBeforePay {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //한달 총 지출액 입력
        System.out.println("******* 한달 총 소득을 입력하세요 (원) *******");
        double inputIncome = scanner.nextDouble();

        System.out.println("******* 한달 총 지출을 입력하세요 (원) *******");
        double inputTotalExpenditure = scanner.nextDouble();

        int inputYesOrNo;

        // 소비보다 지출이 큰 경우 처리
        if (inputIncome < inputTotalExpenditure) {
            System.out.println("소비가 지출보다 큽니다! 계속하시겠습니까?");
            System.out.println("1. 네\n2. 아니오");
            inputYesOrNo = scanner.nextInt();

            if (inputYesOrNo == 2){
                System.out.println("소비를 줄이는 것을 권장드립니다!");
                return;
            }
            if (inputYesOrNo != 1 && inputYesOrNo != 2) {
                System.out.println("1번 또는 2번을 입력해주세요!");
                return;
            }
        }

        //카테고리 별로 지출하고 싶은 비율 입력
        // 나중에 돌아와서 수정할 것!

        int percentLeft = 100;

        //식비 입력
        System.out.println("******* 카테고리 별로 지출비율을 입력해주세요 (10%단위) *******");
        System.out.println("식비에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentFoodExpenditure = scanner.nextInt();

        //에러 처리
        if( inputPercentFoodExpenditure % 10 != 0){
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }
        if( inputPercentFoodExpenditure < 0 && inputTotalExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentFoodExpenditure;

        System.out.println("식비에 " + inputPercentFoodExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //옷값 비율 입력
        System.out.println("옷에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentClothExpenditure = scanner.nextInt();

        //에러 처리
        if( inputPercentClothExpenditure % 10 != 0){
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }
        if( inputPercentClothExpenditure < 0 && inputPercentClothExpenditure > 100){
            System.out.println(" 0 ~ 100의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentClothExpenditure;

        System.out.println("옷에 " + inputPercentClothExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //교통비 비율 입력
        System.out.println("교통비에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentTransportationExpenditure = scanner.nextInt();

        //에러 처리
        if( inputPercentTransportationExpenditure % 10 != 0){
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }
        if( inputPercentTransportationExpenditure < 0 && inputPercentTransportationExpenditure > percentLeft){
            System.out.println(" 0 ~ " + percentLeft +  "%의 범위로 입력해주세요. ");
            return;
        }
        if( percentLeft < 0){
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentTransportationExpenditure;

        System.out.println("교통비에 " + inputPercentTransportationExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //오락비용 비율 입력
        System.out.println("오락에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentPleasureExpenditure = scanner.nextInt();

        //에러 처리
        if( inputPercentPleasureExpenditure % 10 != 0){
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }
        if( inputPercentPleasureExpenditure < 0 && inputPercentPleasureExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }
        if( percentLeft < 0){
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentPleasureExpenditure;

        System.out.println("오락 비용에 " + inputPercentPleasureExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //기타 지출비용 입력
        System.out.println("기타 지출비용을 입력하세요. (10%단위)");
        int inputPercentEtcExpenditure = scanner.nextInt();

        //에러 처리
        if( inputPercentEtcExpenditure % 10 != 0){
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }
        if( inputPercentEtcExpenditure < 0 && inputPercentEtcExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }
        if( percentLeft < 0){
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }
//
//        percentLeft = percentLeft - inputPercentEtcExpenditure;

        System.out.println("기타지출에 " + inputPercentEtcExpenditure + "%를 할당하셨습니다." );

        //카테고리 별 지출금액 출력
        double foodExpenditure = inputPercentFoodExpenditure * inputTotalExpenditure / 100;
        double clothExpenditure = inputPercentClothExpenditure * inputTotalExpenditure / 100;
        double transportationExpenditure = inputPercentTransportationExpenditure * inputTotalExpenditure / 100;
        double pleasureExpenditure = inputPercentPleasureExpenditure * inputTotalExpenditure / 100;
        double etcExpenditure = inputPercentEtcExpenditure * inputTotalExpenditure / 100;

        System.out.println("당신이 쓸수 있는 식비는 " + foodExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 옷값은 " + clothExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 교통비는 " + transportationExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 오락비용은 " + pleasureExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 기타지출은 " + etcExpenditure + "입니다.");



        //세부 소비 내역 계산 및 제안

        //식비

        //옷값

        //교통비

        //오락

        //기타

    }
}
