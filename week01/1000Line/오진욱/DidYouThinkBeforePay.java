import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DidYouThinkBeforePay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,000원");
        DecimalFormat decimalFormat1 = new DecimalFormat("##회");

        //개인정보 입력
        System.out.println("******* 맞춤형 분석을 위해 개인정보를 조사합니다 *******");
        System.out.println("연령대를 입력하세요 (~대로 입력해주세요) ");
        System.out.println("1. 10대\n2. 20대\n3. 30대\n4. 40대");

        String Age = scanner.nextLine();

        if (!Age.equals("10대") && !Age.equals("20대") && !Age.equals("30대") && !Age.equals("40대")) {
            System.out.println("연령대를 정확히 입력해주세요!");
            return;
        }

        System.out.print("성별을 입력하세요 (남성 / 여성) ");
        String Gender = scanner.nextLine();

        boolean isMale = Gender.equals("남성");
        boolean isFemale = Gender.equals("여성");

        if (!isMale && !isFemale) {
            System.out.println("성별을 정확히 입력해주세요!");
            return;
        }

        System.out.println("키를 입력하세요. ");
        int Height = scanner.nextInt();
        String heightRange = null;

        if (Height >= 150 && Height < 160) {
            heightRange = "150대";
        }
        if (Height >= 160 && Height < 170) {
            heightRange = "160대";
        }
        if (Height >= 170 && Height < 180) {
            heightRange = "170대";
        }
        if (Height >= 180 && Height < 190) {
            heightRange = "180대";
        }

        if (!Age.equals("10대") && !Age.equals("20대") && !Age.equals("30대") && !Age.equals("40대")) {
            System.out.println("연령대를 정확히 입력해주세요!");
            return;
        }
        System.out.println("");

        System.out.println("당신의 개인정보를 출력합니다. ");
        System.out.println("연령대 : " + Age);
        System.out.println("성별 : " + Gender);
        System.out.println("키 : " + heightRange);
        System.out.println("");

        //한달 총 지출액 입력
        System.out.println("******* 한달 총 소득을 입력하세요 (원) *******");
        double unformattedIncome = scanner.nextDouble();

        System.out.println("******* 한달 총 지출을 입력하세요 (원) *******");
        double totalExpenditure = scanner.nextDouble();

        int YesOrNo = 0;
        int Selection = 0;

        // 소비보다 지출이 큰 경우 처리
        if (unformattedIncome < totalExpenditure) {
            System.out.println("소비가 지출보다 큽니다! 계속하시겠습니까?");
            System.out.println("1. 네\n2. 아니오");
            YesOrNo = scanner.nextInt();

            if (YesOrNo == 2) {
                System.out.println("소비를 줄이는 것을 권장드립니다!");
                return;
            }

            if (YesOrNo != 1 && YesOrNo != 2) {
                System.out.println("1번 또는 2번을 입력해주세요!");
                return;
            }
        }

        //카테고리 별로 지출하고 싶은 비율 입력
        int percentLeft = 100;

        //식비 입력
        System.out.println("");
        System.out.println("******* 카테고리 별로 지출비율을 입력해주세요 (10%단위) *******");
        System.out.println("식비에 쓸 지출비용을 입력하세요. (10%단위)");
        int PercentFoodExpenditure = scanner.nextInt();

        //에러 처리
        if (PercentFoodExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (PercentFoodExpenditure < 0 && totalExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - PercentFoodExpenditure;

        System.out.println("식비에 " + PercentFoodExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //옷값 비율 입력
        System.out.println("옷에 쓸 지출비용을 입력하세요. (10%단위)");
        int PercentFashionExpenditure = scanner.nextInt();

        //에러 처리
        if (PercentFashionExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (PercentFashionExpenditure < 0 && PercentFashionExpenditure > 100) {
            System.out.println(" 0 ~ 100의 범위로 입력해주세요. ");
            return;
        }

        percentLeft = percentLeft - PercentFashionExpenditure;

        System.out.println("옷에 " + PercentFashionExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        //교통비 비율 입력
        System.out.println("교통비에 쓸 지출비용을 입력하세요. (10%단위)");
        int PercentTransportationExpenditure = scanner.nextInt();

        //에러 처리
        if (PercentTransportationExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (PercentTransportationExpenditure < 0 && PercentTransportationExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        if (percentLeft < 0) {
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        percentLeft = percentLeft - PercentTransportationExpenditure;

        System.out.println("교통비에 " + PercentTransportationExpenditure + "%를 할당하셨습니다. 추가로 " + percentLeft + "% 할당 할 수 있습니다.");

        // 주거비용 비율 입력
        System.out.println("주거비을 입력하세요. (10%단위)");
        int PercentHouseExpenditure = scanner.nextInt();

        //에러 처리
        if (PercentHouseExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (PercentHouseExpenditure < 0 && PercentHouseExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        if (percentLeft < 0) {
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        percentLeft = percentLeft - PercentHouseExpenditure;

        System.out.println("주거 비용에 " + PercentHouseExpenditure + "%를 할당하셨습니다. 추가로 "
                + percentLeft + "% 할당 할 수 있습니다.");

        //핸드폰비 입력
        System.out.println("핸드폰비를 입력하세요. (10%단위)");
        int PercentPhoneExpenditure = scanner.nextInt();

        //에러 처리
        if (PercentPhoneExpenditure % 10 != 0) {
            System.out.println("10% 단위로 입력해주세요.");
            return;
        }

        if (PercentPhoneExpenditure < 0 && PercentPhoneExpenditure > percentLeft) {
            System.out.println(" 0 ~ " + percentLeft + "%의 범위로 입력해주세요. ");
            return;
        }

        if (percentLeft < 0) {
            System.out.println(" 비율의 합산이 100%가 넘습니다. 다시 진행하세요. ");
            return;
        }

        System.out.println("기타지출에 " + PercentPhoneExpenditure + "%를 할당하셨습니다.");
        System.out.println("");

        //카테고리 별 지출금액 출력
        double unformattedFoodExpenditure = PercentFoodExpenditure * totalExpenditure / 100;
        double unformattedFashionExpenditure = PercentFashionExpenditure * totalExpenditure / 100;
        double unformattedTransportationExpenditure = PercentTransportationExpenditure * totalExpenditure / 100;
        double unformattedHouseExpenditure = PercentHouseExpenditure * totalExpenditure / 100;
        double unformattedPhoneExpenditure = PercentPhoneExpenditure * totalExpenditure / 100;

        String foodExpenditure = decimalFormat.format(unformattedFoodExpenditure);
        String fashionExpenditure = decimalFormat.format(unformattedFashionExpenditure);
        String transportationExpenditure = decimalFormat.format(unformattedTransportationExpenditure);
        String houseExpenditure = decimalFormat.format(unformattedHouseExpenditure);
        String phoneExpenditure = decimalFormat.format(unformattedPhoneExpenditure);

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
        double unformattedEatOutPrice = scanner.nextDouble();
        String eatOutPrice = decimalFormat.format(unformattedEatOutPrice);

        // 평소 식사비용 계산 (외식 안하는 경우)
        double usualMealTimeMonthly = 30 * mealTime - eatOutTime;
        double unformattedUsualMealTotalPrice = (unformattedFoodExpenditure - unformattedEatOutPrice * eatOutTime) / usualMealTimeMonthly;
        String usualMealTotalPrice = decimalFormat.format(unformattedUsualMealTotalPrice);

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
        double unformattedFashionPrice = unformattedFashionExpenditure / fashionPurchaseTime;
        String fashionPrice = decimalFormat.format(unformattedFashionPrice);

        System.out.println("******* 당신의 월별 옷값 분석🤸‍♂️ *******");
        System.out.println("평균 옷값: " + fashionPrice);
        System.out.println("이번 달 살 수 있는 옷 수 : " + fashionPurchaseTime);
        System.out.println("");

        System.out.println("패션 추천을 진행하시겠습니까?");
        System.out.println("1. 네\n2. 아니오");
        YesOrNo = scanner.nextInt();
        System.out.println("");

        if (YesOrNo != 1 && YesOrNo != 2) {
            System.out.println("1번 또는 2번을 입력해주세요!");
            return;
        }
        if (YesOrNo == 1) {
            System.out.println("******* 맞춤별 패션 추천을 시작합니다. *******");
            System.out.println("가장 필요한 옷이 무엇인가요? 숫자로 입력하세요");
            System.out.println("1. 상의\n2. 하의\n3. 신발\n4. 모자");
            Selection = scanner.nextInt();
            System.out.println("");

            //상의 추천
            if (isMale) {
                if (Selection == 1) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,20]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (Selection == 1) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%83%81%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 상의을 보여드릴게요");
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
                if (Selection == 2) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + Gender + "하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22,%22WOMEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.println("다음으로 넘어가려면 엔터를 누르세요!");
                        String nextSte1p = scanner.nextLine();
                    }
                }
            }

            if (isFemale) {
                if (Selection == 2) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요 https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%ED%95%98%EC%9D%98&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 하의을 보여드릴게요");
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
                if (Selection == 3) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (Selection == 1) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EC%8B%A0%EB%B0%9C&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 신발을 보여드릴게요");
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
                if (Selection == 4) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + Gender + "모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22MEN%22],%22age%22:[35,35]}&vt=2&st=POPULAR_STYLE");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }
            }

            if (isFemale) {
                if (Selection == 4) {
                    if (Age.equals("10대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[18,19]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("20대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[20,29]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("30대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/searchV3/result?q=%EB%AA%A8%EC%9E%90&t=post&f={%22price%22:[1000,200000],%22selectedCategory%22:%22%22,%22selectedSubCategory%22:%22%22,%22item%22:[],%22bodyShape%22:{%22bodyShapeCode%22:%22%22,%22bodyShapeDetailCode%22:%22%22},%22tpo%22:[],%22season%22:[],%22mood%22:[],%22color%22:[],%22gender%22:[%22WOMEN%22],%22age%22:[30,35]}&vt=2&st=POPULAR_STYLE&android-ptr=false");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Age.equals("40대")) {
                        System.out.println("최신 유행하는 " + Age + " " + Gender + " 모자을 보여드릴게요");
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
            Selection = scanner.nextInt();
            System.out.println("");

            if (isMale) {
                if (heightRange.equals("150대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[150,159]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("160대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("170대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("180대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22MEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
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
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[150,159],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("160대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[5,4],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[160,169],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("170대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 스트릿 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[12],%22weight%22:[],%22height%22:[170,179],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }
                }

                if (heightRange.equals("180대")) {
                    if (Selection == 1) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 미니멀 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[1],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 2) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 시티보이 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[27],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 3) {
                        System.out.println("키 " + heightRange + "에 맞 " + Gender + " 캐주얼 스타일을 보여드릴게요.");
                        System.out.println("");
                        System.out.println("링크를 참고하세요: https://onthelook.co.kr/?initFilter={%22orderType%22:%22NEW%22,%22season%22:[%22SPRING%22,%22SUMMER%22,%22FALL%22,%22WINTER%22],%22gender%22:[%22WOMEN%22],%22styleTagIds%22:[4,5],%22weight%22:[],%22height%22:[180,189],%22bodyType%22:[]}");
                        System.out.println("");
                        System.out.print("다음으로 넘어가려면 엔터를 누르세요!");
                        pause();
                    }

                    if (Selection == 4) {
                        System.out.println("키 " + heightRange + "에 맞는 " + Gender + " 스트릿 스타일을 보여드릴게요.");
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
        Selection = scanner.nextInt();
        System.out.println("");

        int unformattedInsuranceFee = 0;
        double unformattedOilFee = 0;

        int busFee = 1500;
        int busCount = 0;
        int unformattedAverageTaxiFee = 0;
        double unformattedTaxiCount = 0;

        if (Selection == 1) {
            System.out.println("only 자가용을 선택하셨습니다.");
            System.out.println("보험비를 입력해주세요 (원)");
            unformattedInsuranceFee = scanner.nextInt();
            String insuranceFee = decimalFormat.format(unformattedInsuranceFee);

            unformattedOilFee = unformattedTransportationExpenditure - unformattedInsuranceFee;
            String oilFee = decimalFormat.format(unformattedOilFee);

            System.out.println("보험비: " + insuranceFee);
            System.out.println("기름값: " + oilFee);
        }

        if (Selection == 2) {
            System.out.println("only 대중교통을 선택하셨습니다.");
            System.out.println("하루 대중교통 이용 횟수를 입력해주세요");
            busCount = scanner.nextInt();

            System.out.println("택시 한 번 탈때 평균 요금를 입력해주세요");
            unformattedAverageTaxiFee = scanner.nextInt();
            String averageTaxiFee = decimalFormat.format(unformattedAverageTaxiFee);
            unformattedTaxiCount = (unformattedTransportationExpenditure - (30 * busCount * busFee)) / unformattedAverageTaxiFee;
            String taxiCount = decimalFormat1.format(unformattedTaxiCount);

            System.out.println("");
            System.out.println("하루 대중교통 이용 횟수: " + busCount);
            System.out.println("택시 평균 요금 : " + averageTaxiFee);
            System.out.println("한달에 탈 수 있는 택시 횟수: " + taxiCount);
        }

        if (Selection == 3) {
            System.out.println("둘 다를 선택하셨습니다.");
            System.out.println("보험비를 입력해주세요 (원)");
            unformattedInsuranceFee = scanner.nextInt();
            String insuranceFee = decimalFormat.format(unformattedInsuranceFee);

            System.out.println("하루 대중교통 이용 횟수를 입력해주세요");
            busCount = scanner.nextInt();

            System.out.println("택시 한 번 탈때 평균 요금를 입력해주세요");
            unformattedAverageTaxiFee = scanner.nextInt();
            String averageTaxiFee = decimalFormat.format(unformattedAverageTaxiFee);

            double unformattedOilFeeAndTaxiFee = unformattedTransportationExpenditure - (30 * busCount * busFee) - unformattedInsuranceFee;
            String oilFeeAndTaxiFee = decimalFormat.format(unformattedOilFeeAndTaxiFee);

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
        Selection = scanner.nextInt();
        System.out.println("");

        if (Selection == 1) {
            System.out.println("매매를 하셨군요!");
            System.out.println("대출이 있으신가요?");
            System.out.println("1. yes\n2. no");
            YesOrNo = scanner.nextInt();
            System.out.println("");

            double withdrawAmount = 0;
            double withdrawRate = 0;
            double unformattedMonthlyWithdrawFee = 0;
            String monthlyWithdrawFee = null;

            if (YesOrNo == 1) {
                System.out.println("대출의 금액을 입력해주세요");
                withdrawAmount = scanner.nextDouble();

                System.out.println("대출의 금리을 입력해주세요");
                withdrawRate = scanner.nextDouble();

                unformattedMonthlyWithdrawFee = (withdrawAmount * (1 + withdrawRate / 100)) / 12;
                monthlyWithdrawFee = decimalFormat.format(unformattedMonthlyWithdrawFee);
            }
            System.out.println("");
            System.out.println("당신의 주거비는: " + monthlyWithdrawFee + " 입니다.");

            if (unformattedMonthlyWithdrawFee > unformattedHouseExpenditure) {
                System.out.println(" 주거비용이 예산보다 큽니다. 다른 예산을 줄이세요.");
            }

            if (unformattedMonthlyWithdrawFee <= unformattedHouseExpenditure) {
                System.out.println(" 당신의 주거비용은 " + monthlyWithdrawFee + " 입니다. ");
                System.out.println(" 예산에서 " + (unformattedHouseExpenditure - unformattedMonthlyWithdrawFee) + "원이나 아끼셨네요! ");
            }

            if (unformattedMonthlyWithdrawFee < 0) {
                System.out.println("올바른 금액을 입력해주세요!");
                return;
            }
        }

        if (Selection == 2) {
            System.out.println("전세를 하셨군요!");
            System.out.println("보증금 대출이 있으신가요?");
            System.out.println("1. yes\n2. no");
            YesOrNo = scanner.nextInt();

            double withdrawAmount = 0;
            double withdrawRate = 0;
            double unformattedMonthlyWithdrawFee = 0;
            String monthlyWithdrawFee = null;

            if (YesOrNo == 1) {
                System.out.println("대출의 금액을 입력해주세요");
                withdrawAmount = scanner.nextDouble();

                System.out.println("대출의 금리을 입력해주세요");
                withdrawRate = scanner.nextDouble();

                unformattedMonthlyWithdrawFee = (withdrawAmount * (withdrawRate / 100)) / 12;
                monthlyWithdrawFee = decimalFormat.format(unformattedMonthlyWithdrawFee);
            }
            System.out.println("");
            System.out.println("당신의 주거비는: " + monthlyWithdrawFee + " 입니다.");

            if (unformattedMonthlyWithdrawFee > unformattedHouseExpenditure) {
                System.out.println(" 주거비용이 예산보다 큽니다. 다른 예산을 줄이세요.");
            }

            if (unformattedMonthlyWithdrawFee <= unformattedHouseExpenditure) {
                System.out.println(" 당신의 주거비용은 " + monthlyWithdrawFee + " 입니다. ");
                System.out.println(" 예산에서 " + (unformattedHouseExpenditure - unformattedMonthlyWithdrawFee) + "원이나 아끼셨네요! ");
            }

            if (unformattedMonthlyWithdrawFee < 0) {
                System.out.println("올바른 금액을 입력해주세요!");
                return;
            }

        }

        if (Selection == 3) {
            System.out.println("월세를 하셨군요!");
            System.out.println("보증금 대출이 있으신가요?");
            System.out.println("1. yes\n2. no");
            YesOrNo = scanner.nextInt();
            System.out.println("");

            System.out.println("월세가 얼마인가요?");
            double monthlyRent = scanner.nextDouble();

            double withdrawAmount = 0;
            double withdrawRate = 0;
            double unformattedMonthlyWithdrawFee = 0;
            String monthlyWithdrawFee = null;

            if (YesOrNo == 1) {
                System.out.println("대출의 금액을 입력해주세요");
                withdrawAmount = scanner.nextDouble();

                System.out.println("대출의 금리을 입력해주세요");
                withdrawRate = scanner.nextDouble();

                unformattedMonthlyWithdrawFee = monthlyRent + (withdrawAmount * (withdrawRate / 100)) / 12;
                monthlyWithdrawFee = decimalFormat.format(unformattedMonthlyWithdrawFee);
            }
            System.out.println("");
            System.out.println("당신의 주거비는: " + monthlyWithdrawFee + " 입니다.");

            if (unformattedMonthlyWithdrawFee > unformattedHouseExpenditure) {
                System.out.println(" 주거비용이 예산보다 큽니다. 다른 예산을 줄이세요.");
            }

            if (unformattedMonthlyWithdrawFee <= unformattedHouseExpenditure) {
                System.out.println(" 당신의 주거비용은 " + monthlyWithdrawFee + " 입니다. ");
                System.out.println(" 예산에서 " + (unformattedHouseExpenditure - unformattedMonthlyWithdrawFee) + "원이나 아끼셨네요! ");
            }

            if (unformattedMonthlyWithdrawFee < 0) {
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

        int unformattedTotalPhoneFee = phoneFee + phoneAdditionalFee;
        String totalPhoneFee = decimalFormat.format(unformattedTotalPhoneFee);

        String savePhoneFee = decimalFormat.format(unformattedPhoneExpenditure - unformattedTotalPhoneFee);

        if (unformattedTotalPhoneFee > unformattedPhoneExpenditure) {
            System.out.println(" 핸드폰비가 예산보다 큽니다. 다른 예산을 줄이세요.");
        }

        if (unformattedTotalPhoneFee <= unformattedHouseExpenditure) {
            System.out.println(" 당신의 핸드폰 비용은 " + totalPhoneFee + " 입니다. ");
            System.out.println(" 예산에서 " + savePhoneFee + " 이나 아끼셨네요! ");
        }

        if (unformattedTotalPhoneFee < 0) {
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
