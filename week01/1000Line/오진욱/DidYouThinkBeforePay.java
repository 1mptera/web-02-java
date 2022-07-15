import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DidYouThinkBeforePay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,000원");

        //개인정보 입력
        System.out.println("******* 맞춤형 분석을 위해 개인정보를 조사합니다 *******");
        System.out.println("연령대를 입력하세요 (~대로 입력해주세요) ");
        System.out.println("1. 10대\n2. 20대\n3. 30대\n4. 40대");

        String inputAge = scanner.nextLine();

        if (!inputAge.equals("10대") && !inputAge.equals("20대") && !inputAge.equals("30대") && !inputAge.equals("40대")) {
            System.out.println("연령대를 정확히 입력해주세요!");
            return;
        }

        System.out.print("성별을 입력하세요: ");
        String inputGender = scanner.nextLine();

        boolean isMale = inputGender.equals("남성");
        boolean isFemale = inputGender.equals("여성");

        if (!isMale && !isFemale) {
            System.out.println("성별을 정확히 입력해주세요!");
            return;
        }

        System.out.println("키를 입력하세요. ");
        int inputHeight = scanner.nextInt();
        String heightRange = null;

        if (inputHeight >= 150 && inputHeight < 160) {
            heightRange = "150대";
        }
        if (inputHeight >= 160 && inputHeight < 170) {
            heightRange = "160대";
        }
        if (inputHeight >= 170 && inputHeight < 180) {
            heightRange = "170대";
        }
        if (inputHeight >= 180 && inputHeight < 190) {
            heightRange = "180대";
        }

        if (!inputAge.equals("10대") && !inputAge.equals("20대") && !inputAge.equals("30대") && !inputAge.equals("40대")) {
            System.out.println("연령대를 정확히 입력해주세요!");
            return;
        }
        System.out.println("");

        System.out.println("당신의 개인정보를 출력합니다. ");
        System.out.println("연령대 : " + inputAge);
        System.out.println("성별 : " + inputGender);
        System.out.println("키 : " + heightRange);
        System.out.println("");

        //한달 총 지출액 입력
        System.out.println("******* 한달 총 소득을 입력하세요 (원) *******");
        double inputIncome = scanner.nextDouble();

        System.out.println("******* 한달 총 지출을 입력하세요 (원) *******");
        double inputTotalExpenditure = scanner.nextDouble();

        int inputYesOrNo = 0;
        int inputSelection = 0;

        // 소비보다 지출이 큰 경우 처리
        if (inputIncome < inputTotalExpenditure) {
            System.out.println("소비가 지출보다 큽니다! 계속하시겠습니까?");
            System.out.println("1. 네\n2. 아니오");
            inputYesOrNo = scanner.nextInt();

            if (inputYesOrNo == 2) {
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
        System.out.println("");
        System.out.println("******* 카테고리 별로 지출비율을 입력해주세요 (10%단위) *******");
        System.out.println("식비에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentFoodExpenditure = scanner.nextInt();

        //에러 처리
        if (inputPercentFoodExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (inputPercentFoodExpenditure < 0 && inputTotalExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentFoodExpenditure;

        System.out.println("식비에 " + inputPercentFoodExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //옷값 비율 입력
        System.out.println("옷에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentFashionExpenditure = scanner.nextInt();

        //에러 처리
        if (inputPercentFashionExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (inputPercentFashionExpenditure < 0 && inputPercentFashionExpenditure > 100) {
            System.out.println(" 0 ~ 100의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentFashionExpenditure;

        System.out.println("옷에 " + inputPercentFashionExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //교통비 비율 입력
        System.out.println("교통비에 쓸 지출비용을 입력하세요. (10%단위)");
        int inputPercentTransportationExpenditure = scanner.nextInt();

        //에러 처리
        if (inputPercentTransportationExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (inputPercentTransportationExpenditure < 0 && inputPercentTransportationExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        if (percentLeft < 0) {
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentTransportationExpenditure;

        System.out.println("교통비에 " + inputPercentTransportationExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        // 주거비용 비율 입력
        System.out.println("주거비을 입력하세요. (10%단위)");
        int inputPercentHouseExpenditure = scanner.nextInt();

        //에러 처리
        if (inputPercentHouseExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (inputPercentHouseExpenditure < 0 && inputPercentHouseExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        if (percentLeft < 0) {
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        percentLeft = percentLeft - inputPercentHouseExpenditure;

        System.out.println("주거 비용에 " + inputPercentHouseExpenditure + "%를 할당하셨습니다. 추가로 "
                + percentLeft + "% 할당 할 수 있습니다.");

        //기타 지출비용 입력
        System.out.println("기타 지출비용을 입력하세요. (10%단위)");
        int inputPercentPhoneExpenditure = scanner.nextInt();

        //에러 처리
        if (inputPercentPhoneExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (inputPercentPhoneExpenditure < 0 && inputPercentPhoneExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        if (percentLeft < 0) {
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }
//
//        percentLeft = percentLeft - inputPercentPhoneExpenditure;

        System.out.println("기타지출에 " + inputPercentPhoneExpenditure + "%를 할당하셨습니다.");
        System.out.println("");

        //카테고리 별 지출금액 출력
        double foodExpenditure = inputPercentFoodExpenditure * inputTotalExpenditure / 100;
        double fashionExpenditure = inputPercentFashionExpenditure * inputTotalExpenditure / 100;
        double transportationExpenditure = inputPercentTransportationExpenditure * inputTotalExpenditure / 100;
        double houseExpenditure = inputPercentHouseExpenditure * inputTotalExpenditure / 100;
        double phoneExpenditure = inputPercentPhoneExpenditure * inputTotalExpenditure / 100;

        System.out.println("당신이 쓸수 있는 식비는 " + foodExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 옷값은 " + fashionExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 교통비는 " + transportationExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 주거비용은 " + houseExpenditure + "입니다.");
        System.out.println("당신이 쓸수 있는 기타지출은 " + phoneExpenditure + "입니다.");

        //세부 소비 내역 계산 및 제안
        System.out.println("");
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
        System.out.println("");

        System.out.println("******* 당신의 월별 식비 분석🐔 *******");
        System.out.println("평균 외식 비용: " + eatOutPrice);
        System.out.println("외식 횟수: " + eatOutTime);
        System.out.println("외식 외에 평소 평균 식사비용: " + usualMealTotalPrice);
        System.out.println("");

        //옷값( 옷 종류를 구분하는게 낫나?)
        System.out.println("******* 옷값 분석을 시작합니다.🧢 *******");
        System.out.println("한달에 옷(상하의, 바지, 신발...)을 몇벌 사시나요?");

        int fashionPurchaseTime = scanner.nextInt();

        System.out.println("");

        // 옷비용 계산 (외식 안하는 경우)
        double fashionPrice = fashionExpenditure / fashionPurchaseTime;

        System.out.println("******* 당신의 월별 옷값 분석🤸‍♂️ *******");
        System.out.println("평균 옷값: " + fashionPrice);
        System.out.println("이번 달 살 수 있는 옷 수 : " + fashionPurchaseTime);
        System.out.println("");

        System.out.println("패션 추천을 진행하시겠습니까?");
        System.out.println("1. 네\n2. 아니오");
        inputYesOrNo = scanner.nextInt();
        System.out.println("");

        if (inputYesOrNo != 1 && inputYesOrNo != 2) {
            System.out.println("1번 또는 2번을 입력해주세요!");
            return;
        }
        if (inputYesOrNo == 1) {
            System.out.println("******* 맞춤별 패션 추천을 시작합니다. *******");
            System.out.println("가장 필요한 옷이 무엇인가요? 숫자로 입력하세요");
            System.out.println("1. 상의\n2. 하의\n3. 신발\n4. 모자");
            inputSelection = scanner.nextInt();
            System.out.println("");

            //상의 추천
            if (isMale) {
                if (inputSelection == 1) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,20]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (inputSelection == 1) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            //하의 추천
            if (isMale) {
                if (inputSelection == 2) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22,%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.println("다음으로 넘어가려면 엔터를 누르세요!");
                        String nextSte1p = scanner.nextLine();
                    }
                }
            }

            if (isFemale) {
                if (inputSelection == 2) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요 https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            //신발 추천
            if (isMale) {
                if (inputSelection == 3) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (inputSelection == 1) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            //모자 추천
            if (isMale) {
                if (inputSelection == 4) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + inputGender + "모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (inputSelection == 4) {
                    if (inputAge.equals("10대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("20대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("30대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputAge.equals("40대")) {
                        System.out.println("최신 유행하는 " + inputAge + " " + inputGender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            //패션스타일 조사 -> 추천코디 제안.
            System.out.println("");
            System.out.println("******* 전체적인 코디를 추천해 드릴게요! *******");

            System.out.println("선호하는 패션 스타일을 입력하세요.");
            System.out.println("1. 미니멀\n2. 시티보이\n3. 캐주얼\n4. 스트릿");
            inputSelection = scanner.nextInt();
            System.out.println("");

            if (isMale) {
                if (heightRange.equals("150대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[150,159]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("160대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("170대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("180대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (heightRange.equals("150대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("160대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[5,4],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("170대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("180대")) {
                    if (inputSelection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + inputGender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (inputSelection == 4) {
                        System.out.println("키 " + heightRange + "에 맞는 " + inputGender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }
        }

        //교통비
        System.out.println("");
        System.out.println("******* 교통비 분석을 시작합니다.🚎 *******");
        System.out.println("평소 이동수단을 골라주세요");
        System.out.println("1. only 자가용\n2. only 대중교통 \n3. 둘다");
        inputSelection = scanner.nextInt();
        System.out.println("");

        int insuranceFee = 0;
        double oilFee = 0;

        int busFee = 1500;
        int busCount = 0;
        int averageTaxiFee = 0;
        double taxiCount = 0;

        if (inputSelection == 1) {
            System.out.println("only 자가용을 선택하셨습니다.");
            System.out.println("보험비를 입력해주세요 (원)");
            insuranceFee = scanner.nextInt();

            oilFee = transportationExpenditure - insuranceFee;

            System.out.println("보험비: " + insuranceFee);
            System.out.println("기름값: " + oilFee);
        }

        if (inputSelection == 2) {
            System.out.println("only 대중교통을 선택하셨습니다.");
            System.out.println("하루 대중교통 이용 횟수를 입력해주세요");
            busCount = scanner.nextInt();

            System.out.println("택시 한 번 탈때 평균 요금를 입력해주세요");
            averageTaxiFee = scanner.nextInt();
            taxiCount = (transportationExpenditure - (30 * busCount * busFee)) / averageTaxiFee;

            System.out.println("");
            System.out.println("하루 대중교통 이용 횟수: " + busCount);
            System.out.println("택시 평균 요금 : " + averageTaxiFee);
            System.out.println("한달에 탈 수 있는 택시 횟수: " + taxiCount);
        }

        if (inputSelection == 3) {
            System.out.println("둘 다를 선택하셨습니다.");
            System.out.println("보험비를 입력해주세요 (원)");
            insuranceFee = scanner.nextInt();

            System.out.println("하루 대중교통 이용 횟수를 입력해주세요");
            busCount = scanner.nextInt();

            System.out.println("택시 한 번 탈때 평균 요금를 입력해주세요");
            averageTaxiFee = scanner.nextInt();
            double oilFeeAndTaxiFee = transportationExpenditure - (30 * busCount * busFee) - insuranceFee;

            System.out.println("보험비: " + insuranceFee);
            System.out.println("하루 대중교통 이용 횟수: " + busCount);
            System.out.println("택시 평균 요금 : " + averageTaxiFee);
            System.out.println("가용 가능한 기름값과 택시값: " + oilFeeAndTaxiFee);
        }
        System.out.println("");

        //주거비
        System.out.println("******* 주거비 분석을 시작합니다.🚎 *******");

        System.out.println("주거의 형태가 어떻게 되시나요?");
        System.out.println("1. 매매\n2. 전세\n3. 월세");
        inputSelection = scanner.nextInt();
        System.out.println("");

        if (inputSelection == 1) {
            System.out.println("매매를 하셨군요!");
            System.out.println("대출이 있으신가요?");
            System.out.println("1. yes\n2. no");
            inputYesOrNo = scanner.nextInt();
            System.out.println("");

            double withdrawAmount = 0;
            double withdrawRate = 0;
            double monthlyWithdrawFee = 0;

            if (inputYesOrNo == 1) {
                System.out.println("대출의 금액을 입력해주세요");
                withdrawAmount = scanner.nextDouble();

                System.out.println("대출의 금리을 입력해주세요");
                withdrawRate = scanner.nextDouble();

                monthlyWithdrawFee = (withdrawAmount * (1 + withdrawRate / 100)) / 12;
            }
        }

        if (inputSelection == 2) {
            System.out.println("전세를 하셨군요!");
            System.out.println("보증금 대출이 있으신가요?");
            System.out.println("1. yes\n2. no");
            inputYesOrNo = scanner.nextInt();

            double withdrawAmount = 0;
            double withdrawRate = 0;
            double monthlyWithdrawFee = 0;

            if (inputYesOrNo == 1) {
                System.out.println("대출의 금액을 입력해주세요");
                withdrawAmount = scanner.nextDouble();

                System.out.println("대출의 금리을 입력해주세요");
                withdrawRate = scanner.nextDouble();

                monthlyWithdrawFee = (withdrawAmount * (withdrawRate / 100)) / 12;
            }

        }

        if (inputSelection == 3) {
            System.out.println("월세를 하셨군요!");
            System.out.println("보증금 대출이 있으신가요?");
            System.out.println("1. yes\n2. no");
            inputYesOrNo = scanner.nextInt();
            System.out.println("");

            System.out.println("월세가 얼마인가요?");
            double monthlyRent = scanner.nextDouble();

            double withdrawAmount = 0;
            double withdrawRate = 0;
            double monthlyWithdrawFee = 0;

            if (inputYesOrNo == 1) {
                System.out.println("대출의 금액을 입력해주세요");
                withdrawAmount = scanner.nextDouble();

                System.out.println("대출의 금리을 입력해주세요");
                withdrawRate = scanner.nextDouble();

                monthlyWithdrawFee = monthlyRent + (withdrawAmount * (withdrawRate / 100)) / 12;
            }
            System.out.println("");
            System.out.println("당신의 주거비는: " + monthlyWithdrawFee + "원 입니다.");

            if (monthlyWithdrawFee > houseExpenditure) {
                System.out.println(" 주거비용이 예산보다 큽니다. 다른 예산을 줄이세요.");
            }

            if (monthlyWithdrawFee <= houseExpenditure) {
                System.out.println(" 당신의 주거비용은 " + monthlyWithdrawFee + "원 입니다. ");
                System.out.println(" 예산에서 " + (houseExpenditure - monthlyWithdrawFee) + "원이나 아끼셨네요! ");
            }

            if (monthlyWithdrawFee < 0) {
                System.out.println("올바른 금액을 입력해주세요!");
                return;
            }
        }
        System.out.println("");


        //핸드폰 요금
        System.out.println("******* 핸드폰요금 분석을 시작합니다.🍔 *******");
        System.out.println("얼마짜리 요금제를 쓰시나요?");
        int phoneFee = scanner.nextInt();

        System.out.println("정기결제를 금액을 입력해주세요.");
        int phoneAdditionalFee = scanner.nextInt();
        System.out.println("");

        int totalPhoneFee = phoneFee + phoneAdditionalFee;

        if (totalPhoneFee > phoneExpenditure) {
            System.out.println(" 핸드폰비이 예산보다 큽니다. 다른 예산을 줄이세요.");
        }

        if (totalPhoneFee <= houseExpenditure) {
            System.out.println(" 당신의 핸드폰 비용은 " + totalPhoneFee + "원 입니다. ");
            System.out.println(" 예산에서 " + (phoneExpenditure - totalPhoneFee) + "원이나 아끼셨네요! ");
        }

        if (totalPhoneFee < 0) {
            System.out.println("올바른 금액을 입력해주세요!");
            return;
        }
        System.out.println("");

        System.out.println("이용해주셔서 감사합니다!");
    }

    public static void pause() {
        try {
            System.in.read();
        } catch (IOException e) {
        }
    }
}
