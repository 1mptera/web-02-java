import java.util.Scanner;

public class DidYouThinkBeforePay {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //개인정보 입력
        System.out.println("******* 맞춤형 분석을 위해 개인정보를 조사합니다 *******");
        System.out.println("연령대를 입력하세요 (~대로 입력해주세요) ");
        System.out.println("1. 10대\n2. 20대\n3. 30대\n4. 40대");
        String inputAge = scanner.nextLine();

        if (!inputAge.equals("10대")&&!inputAge.equals("20대")&&!inputAge.equals("30대")&&!inputAge.equals("40대") ){
            System.out.println("연령대를 정확히 입력해주세요!");
            return;
        }

        System.out.print("성별을 입력하세요: ");
        String inputGender = scanner.nextLine();

        boolean isMale = inputGender.equals("남성");
        boolean isFemale = inputGender.equals("여성");

        if (!isMale && !isFemale){
            System.out.println("성별을 정확히 입력해주세요!");
            return;
        }

        //한달 총 지출액 입력
        System.out.println("******* 한달 총 소득을 입력하세요 (원) *******");
        double inputIncome = scanner.nextDouble();

        System.out.println("******* 한달 총 지출을 입력하세요 (원) *******");
        double inputTotalExpenditure = scanner.nextDouble();

        int inputYesOrNo;
        int inputFourSelection;

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
        int inputPercentFashionExpenditure = scanner.nextInt();

        //에러 처리
        if( inputPercentFashionExpenditure % 10 != 0){
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }
        if( inputPercentFashionExpenditure < 0 && inputPercentFashionExpenditure > 100){
            System.out.println(" 0 ~ 100의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentFashionExpenditure;

        System.out.println("옷에 " + inputPercentFashionExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

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
        double fashionExpenditure = inputPercentFashionExpenditure * inputTotalExpenditure / 100;
        double transportationExpenditure = inputPercentTransportationExpenditure * inputTotalExpenditure / 100;
        double pleasureExpenditure = inputPercentPleasureExpenditure * inputTotalExpenditure / 100;
        double etcExpenditure = inputPercentEtcExpenditure * inputTotalExpenditure / 100;

        System.out.println("당신이 쓸수 있는 식비는 " + foodExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 옷값은 " + fashionExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 교통비는 " + transportationExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 오락비용은 " + pleasureExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 기타지출은 " + etcExpenditure + "입니다.");

        //세부 소비 내역 계산 및 제안
        System.out.println("세부 소비내역 분석을 위해 몇가지 내용을 입력해주세요.\n");

        //식비
        System.out.println("******* 식비 분석을 시작합니다.🍔 *******");
        System.out.println("하루에 몇 끼니를 드시나요?");
        int mealTime = scanner.nextInt();

        System.out.println("한달에 몇번 외식하시나요?");
        int eatOutTime = scanner.nextInt();

        System.out.println("외식의 평균비용은 어느정도 인가요?");
        double eatOutPrice = scanner.nextDouble();

        // 평소 식사비용 계산 (외식 안하는 경우)
        double usualMealTimeMonthly = 30 * mealTime - eatOutTime;
        double usualMealTotalPrice = (foodExpenditure - eatOutPrice * eatOutTime) / usualMealTimeMonthly;

        System.out.println("******* 당신의 월별 식비 분석🐔 *******");
        System.out.println("평균 외식 비용: " + eatOutPrice);
        System.out.println("외식 횟수: " + eatOutTime);
        System.out.println("외식 외에 평소 평균 식사비용: " + usualMealTotalPrice);

        //옷값( 옷 종류를 구분하는게 낫나?)
        System.out.println("******* 옷값 분석을 시작합니다.🧢 *******");

        System.out.println("한달에 옷(상하의, 바지, 신발...)을 몇벌 사시나요?");
        int fashionPurchaseTime = scanner.nextInt();

        System.out.println("구매하는 옷의 평균비용은 어느정도 인가요?");

        // 옷비용 계산 (외식 안하는 경우)
        double fashionPrice = fashionExpenditure / fashionPurchaseTime;

        System.out.println("******* 당신의 월별 옷값 분석🤸‍♂️ *******");
        System.out.println("평균 옷값: " + fashionPrice);
        System.out.println("이번 달 살 수 있는 옷 수 : " + fashionPurchaseTime);

        System.out.println("패션 추천을 진행하시겠습니까?");
        System.out.println("1. 네\n2. 아니오");
        inputYesOrNo = scanner.nextInt();

        if (inputYesOrNo != 1 && inputYesOrNo != 2) {
            System.out.println("1번 또는 2번을 입력해주세요!");
            return;
        }
        if (inputYesOrNo == 1){
            System.out.println("******* 맞춤별 패션 추천을 시작합니다. *******");
            System.out.println("가장 필요한 옷이 무엇인가요? 숫자로 입력하세요");
            System.out.println("1. 상의\n2. 하의\n3. 신발\n4. 모자");
            inputFourSelection = scanner.nextInt();

            System.out.println("참고할 만한 사이트를 연결해드릴게요!");

            //상의 추천
            if(isMale){
                if (inputFourSelection == 1){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,20]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                }
            }

            if(isFemale){
                if (inputFourSelection == 1){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "상의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE" );
                    }
                }
            }

            //하의 추천
            if(isMale){
                if (inputFourSelection == 2){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22,%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE" );
                    }
                }
            }

            if(isFemale){
                if (inputFourSelection == 2){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요 https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                }
            }

            //신발 추천
            if(isMale){
                if (inputFourSelection == 3){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                }
            }

            if(isFemale){
                if (inputFourSelection == 1){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "신발을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE" );
                    }
                }
            }

            //모자 추천
            if(isMale){
                if (inputFourSelection == 4){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE" );
                    }
                }
            }

            if(isFemale){
                if (inputFourSelection == 4){
                    if (inputAge.equals("10대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("20대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("30대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                    if (inputAge.equals("40대")){
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false" );
                    }
                }
            }

//            System.out.println("선호하는 패션 스타일을 입력하세요.");
//            System.out.println("1. 미니멀\n2. 시티보이\n3. 비즈니스 캐주얼\n4. ");
//            inputFourSelection = scanner.nextInt();



        }



//        //교통비
//        System.out.println("******* 교통비 분석을 시작합니다.🍔 *******");
//        System.out.println("하루에 몇 끼니를 드시나요?");
//        int mealTime = scanner.nextInt();
//
//        System.out.println("한달에 몇번 외식하시나요?");
//        int eatOutTime = scanner.nextInt();
//
//        System.out.println("외식의 평균비용은 어느정도 인가요?");
//        double eatOutPrice = scanner.nextDouble();
//
//        // 평소 식사비용 계산 (외식 안하는 경우)
//        double usualMealTimeMonthly = 30 * mealTime - eatOutTime;
//        double usualMealTotalPrice = (foodExpenditure - eatOutPrice * eatOutTime) / usualMealTimeMonthly;
//
//        System.out.println("******* 당신의 월별 식비 분석🐔 *******");
//        System.out.println("평균 외식 비용: " + eatOutPrice);
//        System.out.println("외식 횟수: " + eatOutTime);
//        System.out.println("외식 외에 평소 평균 식사비용: " + usualMealTotalPrice);
//
//        //오락
//        System.out.println("******* 오락비용 분석을 시작합니다.🍔 *******");
//        System.out.println("하루에 몇 끼니를 드시나요?");
//        int mealTime = scanner.nextInt();
//
//        System.out.println("한달에 몇번 외식하시나요?");
//        int eatOutTime = scanner.nextInt();
//
//        System.out.println("외식의 평균비용은 어느정도 인가요?");
//        double eatOutPrice = scanner.nextDouble();
//
//        // 평소 식사비용 계산 (외식 안하는 경우)
//        double usualMealTimeMonthly = 30 * mealTime - eatOutTime;
//        double usualMealTotalPrice = (foodExpenditure - eatOutPrice * eatOutTime) / usualMealTimeMonthly;
//
//        System.out.println("******* 당신의 월별 식비 분석🐔 *******");
//        System.out.println("평균 외식 비용: " + eatOutPrice);
//        System.out.println("외식 횟수: " + eatOutTime);
//        System.out.println("외식 외에 평소 평균 식사비용: " + usualMealTotalPrice);
//
//        //기타
//        System.out.println("******* 기타 지출 분석을 시작합니다.🍔 *******");
//        System.out.println("하루에 몇 끼니를 드시나요?");
//        int mealTime = scanner.nextInt();
//
//        System.out.println("한달에 몇번 외식하시나요?");
//        int eatOutTime = scanner.nextInt();
//
//        System.out.println("외식의 평균비용은 어느정도 인가요?");
//        double eatOutPrice = scanner.nextDouble();
//
//        // 평소 식사비용 계산 (외식 안하는 경우)
//        double usualMealTimeMonthly = 30 * mealTime - eatOutTime;
//        double usualMealTotalPrice = (foodExpenditure - eatOutPrice * eatOutTime) / usualMealTimeMonthly;
//
//        System.out.println("******* 당신의 월별 식비 분석🐔 *******");
//        System.out.println("평균 외식 비용: " + eatOutPrice);
//        System.out.println("외식 횟수: " + eatOutTime);
//        System.out.println("외식 외에 평소 평균 식사비용: " + usualMealTotalPrice);

    }
}
