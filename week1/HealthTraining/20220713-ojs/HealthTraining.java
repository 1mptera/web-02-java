import java.util.Random;
import java.util.Scanner;

public class HealthTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //프로그램 시작
        System.out.println("헬스 8주차 벌크업+3대 증량 프로그램입니다");
        System.out.println("시작하시려면 Yes 나약한자들은 No를 적어주세요!");

        String answer1 = scanner.nextLine().toUpperCase();

        if (!answer1.equals("YES")) {
            System.out.println("Goodbye");
            return;
        }

        //1rm 기입!
        System.out.println("삼대 운동 1rm을 입력하시오.");
        System.out.print("벤치프레스(kg): ");


        double num1 = scanner.nextDouble();
        System.out.print("데드리프트(kg): ");
        double num2 = scanner.nextDouble();
        System.out.print("스쿼트(kg): ");
        double num3 = scanner.nextDouble();

        //나이와 키,몸무게,성별 기입!
        System.out.println("나이와 키,몸무게,성별를 입력하시오.");
        System.out.print("나이(세): ");

        double num4 = scanner.nextDouble();
        System.out.print("키(cm): ");
        double num5 = scanner.nextDouble();
        System.out.print("몸무게(kg): ");
        double num6 = scanner.nextDouble();
        System.out.print("성별(남성,여성): ");
        String answer2 = scanner.next();

        //생활습관 체크!
        System.out.println("평소의 생활습관을 고르시오!");
        System.out.println("1. 좌식 업무");
        System.out.println("2. 돌아다니는 업무");
        System.out.println("3. 활동적인 업무");

        double num7 = scanner.nextDouble();

        //(좌식 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (num7 == 1) {
            double calorie1 = ((66 + 13.8 * num6 + 5 * num5 - 6.8 * num4)) * 1.5;
            double calorie4 = (655 + 9.6 * num6 + 1.8 * num5 - 4.7 * num4) * 1.5;
            double calorie2 = calorie1 * 0.2;
            double calorie3 = num6 * 8;

            if (answer2.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie1);
                System.out.println("탄수화물량: " + (calorie1 - calorie2 - calorie3) / 4);
                System.out.println("단백질량: " + calorie3 / 4);
                System.out.println("지방량: " + calorie2 / 9);
            }


            //여성일때:
            if (answer2.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie4);
                System.out.println("탄수화물량: " + (calorie4 - calorie2 - calorie3));
                System.out.println("단백질량: " + calorie3 / 4);
                System.out.println("지방량: " + calorie2 / 9);
            }
        }

        //(돌아다니는 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (num7 == 2) {
            double calorie1 = ((66 + 13.8 * num6 + 5 * num5 - 6.8 * num4)) * 1.75;
            double calorie4 = (655 + 9.6 * num6 + 1.8 * num5 - 4.7 * num4) * 1.75;
            double calorie2 = calorie1 * 0.2;
            double calorie3 = num6 * 8;

            if (answer2.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie1);
                System.out.println("탄수화물량: " + (calorie1 - calorie2 - calorie3) / 4);
                System.out.println("단백질량: " + calorie3 / 4);
                System.out.println("지방량: " + calorie2 / 9);
            }


            //여성일때:
            if (answer2.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie4);
                System.out.println("탄수화물량: " + (calorie4 - calorie2 - calorie3));
                System.out.println("단백질량: " + calorie3 / 4);
                System.out.println("지방량: " + calorie2 / 9);
            }
        }

        //(활동적인 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (num7 == 3) {
            double calorie1 = ((66 + 13.8 * num6 + 5 * num5 - 6.8 * num4)) * 2;
            double calorie4 = (655 + 9.6 * num6 + 1.8 * num5 - 4.7 * num4) * 2;
            double calorie2 = calorie1 * 0.2;
            double calorie3 = num6 * 8;

            if (answer2.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie1);
                System.out.println("탄수화물량: " + (calorie1 - calorie2 - calorie3) / 4);
                System.out.println("단백질량: " + calorie3 / 4);
                System.out.println("지방량: " + calorie2 / 9);
            }


            //여성일때:
            if (answer2.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie4);
                System.out.println("탄수화물량: " + (calorie4 - calorie2 - calorie3));
                System.out.println("단백질량: " + calorie3 / 4);
                System.out.println("지방량: " + calorie2 / 9);
            }
        }

        System.out.println("확인하셨으면 Yes를 기입해주세요");

        String answer3 = scanner.next().toUpperCase();

        // 프로그램 start
        System.out.println("프로그램은 월요일 수요일 금요일로 진행됩니다");
        System.out.println("프로그램을 시작하려면 start를 입력하시오!");

        String answer4 = scanner.next().toUpperCase();

        if (!answer4.equals("START")) {
            return;
        }

        System.out.println("-----------1주차------------");
        System.out.println("월요일 벤치프레스");
        System.out.println("1.Set 벤치프레스 " + num1 * 0.75 + "kg(권장 Reps 5회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1 = scanner.nextDouble();

        System.out.println("2.Set 벤치프레스 " + num1 * 0.85 + "kg(권장 Reps 3회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2 = scanner.nextDouble();

        System.out.println("3.Set 벤치프레스 " + num1 * 0.95 + "kg(권장 Reps 1개이상)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps3 = scanner.nextDouble();

        System.out.println("4.Set 벤치프레스 " + num1 * 0.90 + "kg(권장 Reps 3회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps4 = scanner.nextDouble();

        System.out.println("5.Set 벤치프레스 " + num1 * 0.85 + "kg(권장 Reps 5회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps5 = scanner.nextDouble();
        System.out.println("6.Set 벤치프레스 " + num1 * 0.80 + "kg(권장 Reps 3회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps6 = scanner.nextDouble();

        System.out.println("7.Set 벤치프레스 " + num1 * 0.75 + "kg(권장 Reps 5회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        double reps7 = scanner.nextDouble();

        System.out.println("8.Set 벤치프레스 " + num1 * 0.70 + "kg(권장 Reps 3회)");
        System.out.print("몇 Reps 수행하셨습니까?");

        int asist = random.nextInt(4);

        double reps8 = scanner.nextDouble();

        System.out.println("9.Set 벤치프레스 " + num1 * 0.65 + "kg(권장 Reps 1개 이상)");
        System.out.println("몇 Reps 수행하셨습니까?");

        if (reps3 >= 11) {
            reps3 = (reps3 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps3 >= 8 && reps3 < 11) {
            reps3 = (reps3 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps3 >= 5 && reps3 < 8) {
            reps3 = (reps3 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps3 >= 2 && reps3 < 5) {
            reps3 = (reps3 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps3 < 2) {
            reps3 = (reps3 + 10);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }
        if (reps3 >= 2 && reps3 < 5) {
            reps3 = (reps3 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }

        //보조운동
        System.out.println("고생하셨습니다!! 마무리 보조운동 추천!!!!");

        if (asist == 0) {
            System.out.println("인클라인 덤벨프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 1) {
            System.out.println("딥스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 2) {
            System.out.println("클로즈그립 벤치프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 3) {
            System.out.println("덤벨 플라이 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }


    }
}
