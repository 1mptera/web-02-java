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
            double calorie1 = ((66 + 13.8 * num6 + 5 * num5 - 6.8 * num4) * 1.5 + 500);
            double calorie4 = ((655 + 9.6 * num6 + 1.8 * num5 - 4.7 * num4) * 1.5 + 300);
            double calorie2 = calorie1 * 0.2;
            double calorie3 = num6 * 8;

            if (answer2.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie1 + "칼로리");
                System.out.println("탄수화물량: " + (calorie1 - calorie2 - calorie3) / 4 + "g");
                System.out.println("단백질량: " + calorie3 / 4 + "g");
                System.out.println("지방량: " + calorie2 / 9 + "g");
            }


            //여성일때:
            if (answer2.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie4 + "칼로리");
                System.out.println("탄수화물량: " + (calorie4 - calorie2 - calorie3) + "g");
                System.out.println("단백질량: " + calorie3 / 4 + "g");
                System.out.println("지방량: " + calorie2 / 9 + "g");
            }
        }

        //(돌아다니는 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (num7 == 2) {
            double calorie1 = ((66 + 13.8 * num6 + 5 * num5 - 6.8 * num4) * 1.75 + 500);
            double calorie4 = ((655 + 9.6 * num6 + 1.8 * num5 - 4.7 * num4) * 1.75 + 300);
            double calorie2 = calorie1 * 0.2;
            double calorie3 = num6 * 8;

            if (answer2.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie1 + "칼로리");
                System.out.println("탄수화물량: " + (calorie1 - calorie2 - calorie3) / 4 + "g");
                System.out.println("단백질량: " + calorie3 / 4 + "g");
                System.out.println("지방량: " + calorie2 / 9 + "g");
            }


            //여성일때:
            if (answer2.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie4 + "칼로리");
                System.out.println("탄수화물량: " + (calorie4 - calorie2 - calorie3) + "g");
                System.out.println("단백질량: " + calorie3 / 4 + "g");
                System.out.println("지방량: " + calorie2 / 9 + "g");
            }
        }

        //(활동적인 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (num7 == 3) {
            double calorie1 = ((66 + 13.8 * num6 + 5 * num5 - 6.8 * num4) * 2 + 500);
            double calorie4 = ((655 + 9.6 * num6 + 1.8 * num5 - 4.7 * num4) * 2 + 300);
            double calorie2 = calorie1 * 0.2;
            double calorie3 = num6 * 8;

            if (answer2.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie1 + "칼로리");
                System.out.println("탄수화물량: " + (calorie1 - calorie2 - calorie3) / 4 + "g");
                System.out.println("단백질량: " + calorie3 / 4 + "g");
                System.out.println("지방량: " + calorie2 / 9 + "g");
            }


            //여성일때:
            if (answer2.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie4 + "칼로리");
                System.out.println("탄수화물량: " + (calorie4 - calorie2 - calorie3) + "g");
                System.out.println("단백질량: " + calorie3 / 4 + "g");
                System.out.println("지방량: " + calorie2 / 9 + "g");
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

        ///////
        System.out.println("-----------1주차------------");
        System.out.println("월요일 벤치프레스");

        double weight1 = num1 * 0.75;
        double a1 = Math.round(weight1 / 10) * 10;

        if (weight1 < a1 && a1 <= (weight1 + 5)) {
            if ((a1 - 1.25) <= weight1) {
                System.out.println("1.Set 벤치프레스 " + a1 + "kg(권장 Reps 5회)");
            }
            if ((a1 - 3.75) <= weight1 && weight1 < (a1 - 1.25)) {
                System.out.println("1.Set 벤치프레스 " + (a1 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a1 - 5) <= weight1 && weight1 < -3.75) {
                System.out.println("1.Set 벤치프레스 " + (a1 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1 < (a1 + 1.25)) {
                System.out.println("1.Set 벤치프레스 " + a1 + "kg(권장 Reps 5회)");
            }
            if ((a1 + 1.25) <= weight1 && weight1 < (a1 + 3.75)) {
                System.out.println("1.Set 벤치프레스 " + (a1 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a1 + 3.75) <= weight1 && weight1 < (a1 + 5)) {
                System.out.println("1.Set 벤치프레스 " + (a1 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1 = scanner.nextDouble();

        double weight2 = num1 * 0.85;
        double a2 = Math.round(weight2 / 10) * 10;

        if (weight2 < a2 && a2 <= (weight2 + 5)) {
            if ((a2 - 1.25) <= weight2) {
                System.out.println("2.Set 벤치프레스 " + a2 + "kg(권장 Reps 3회)");
            }
            if ((a2 - 3.75) <= weight2 && weight2 < (a2 - 1.25)) {
                System.out.println("2.Set 벤치프레스 " + (a2 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a2 - 5) <= weight2 && weight2 < -3.75) {
                System.out.println("2.Set 벤치프레스 " + (a2 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight2 < (a2 + 1.25)) {
                System.out.println("2.Set 벤치프레스 " + a2 + "kg(권장 Reps 3회)");
            }
            if ((a2 + 1.25) <= weight2 && weight2 < (a2 + 3.75)) {
                System.out.println("2.Set 벤치프레스 " + (a2 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a2 + 3.75) <= weight2 && weight2 < (a2 + 5)) {
                System.out.println("2.Set 벤치프레스 " + (a2 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2 = scanner.nextDouble();

        double weight3 = num1 * 0.95;
        double a3 = Math.round(weight3 / 10) * 10;

        if (weight3 < a3 && a3 <= (weight3 + 5)) {
            if ((a3 - 1.25) <= weight3) {
                System.out.println("3.Set 벤치프레스 " + a3 + "kg(권장 Reps 1회)");
            }
            if ((a3 - 3.75) <= weight3 && weight3 < (a3 - 1.25)) {
                System.out.println("3.Set 벤치프레스 " + (a3 - 2.5) + "kg(권장 Reps 1회)");
            }
            if ((a3 - 5) <= weight3 && weight3 < -3.75) {
                System.out.println("3.Set 벤치프레스 " + (a3 - 5) + "kg(권장 Reps 1회)");
            }
        } else {
            if (weight3 < (a3 + 1.25)) {
                System.out.println("3.Set 벤치프레스 " + a3 + "kg(권장 Reps 1회)");
            }
            if ((a3 + 1.25) <= weight3 && weight3 < (a3 + 3.75)) {
                System.out.println("3.Set 벤치프레스 " + (a3 + 2.5) + "kg(권장 Reps 1회)");
            }
            if ((a3 + 3.75) <= weight3 && weight3 < (a3 + 5)) {
                System.out.println("3.Set 벤치프레스 " + (a3 + 5) + "kg(권장 Reps 1회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps3 = scanner.nextDouble();

        double weight4 = num1 * 0.90;
        double a4 = Math.round(weight4 / 10) * 10;

        if (weight4 < a4 && a4 <= (weight4 + 5)) {
            if ((a4 - 1.25) <= weight4) {
                System.out.println("4.Set 벤치프레스 " + a4 + "kg(권장 Reps 3회)");
            }
            if ((a4 - 3.75) <= weight4 && weight4 < (a4 - 1.25)) {
                System.out.println("4.Set 벤치프레스 " + (a4 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a4 - 5) <= weight4 && weight4 < -3.75) {
                System.out.println("4.Set 벤치프레스 " + (a4 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight4 < (a4 + 1.25)) {
                System.out.println("4.Set 벤치프레스 " + a4 + "kg(권장 Reps 3회)");
            }
            if ((a4 + 1.25) <= weight4 && weight4 < (a4 + 3.75)) {
                System.out.println("4.Set 벤치프레스 " + (a4 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a4 + 3.75) <= weight4 && weight4 < (a4 + 5)) {
                System.out.println("4.Set 벤치프레스 " + (a4 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps4 = scanner.nextDouble();

        double weight5 = num1 * 0.85;
        double a5 = Math.round(weight5 / 10) * 10;

        if (weight5 < a5 && a5 <= (weight5 + 5)) {
            if ((a5 - 1.25) <= weight5) {
                System.out.println("5.Set 벤치프레스 " + a5 + "kg(권장 Reps 5회)");
            }
            if ((a5 - 3.75) <= weight5 && weight5 < (a5 - 1.25)) {
                System.out.println("5.Set 벤치프레스 " + (a5 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a5 - 5) <= weight5 && weight5 < -3.75) {
                System.out.println("5.Set 벤치프레스 " + (a5 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight5 < (a5 + 1.25)) {
                System.out.println("5.Set 벤치프레스 " + a5 + "kg(권장 Reps 5회)");
            }
            if ((a5 + 1.25) <= weight5 && weight5 < (a5 + 3.75)) {
                System.out.println("5.Set 벤치프레스 " + (a5 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a5 + 3.75) <= weight5 && weight5 < (a5 + 5)) {
                System.out.println("5.Set 벤치프레스 " + (a5 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps5 = scanner.nextDouble();

        double weight6 = num1 * 0.80;
        double a6 = Math.round(weight6 / 10) * 10;

        if (weight6 < a6 && a6 <= (weight6 + 5)) {
            if ((a6 - 1.25) <= weight6) {
                System.out.println("6.Set 벤치프레스 " + a6 + "kg(권장 Reps 3회)");
            }
            if ((a6 - 3.75) <= weight6 && weight6 < (a6 - 1.25)) {
                System.out.println("6.Set 벤치프레스 " + (a6 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a6 - 5) <= weight6 && weight6 < -3.75) {
                System.out.println("6.Set 벤치프레스 " + (a6 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight6 < (a6 + 1.25)) {
                System.out.println("6.Set 벤치프레스 " + a6 + "kg(권장 Reps 3회)");
            }
            if ((a6 + 1.25) <= weight6 && weight6 < (a6 + 3.75)) {
                System.out.println("6.Set 벤치프레스 " + (a6 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a6 + 3.75) <= weight6 && weight6 < (a6 + 5)) {
                System.out.println("6.Set 벤치프레스 " + (a6 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps6 = scanner.nextDouble();

        double weight7 = num1 * 0.75;
        double a7 = Math.round(weight7 / 10) * 10;

        if (weight7 < a7 && a7 <= (weight7 + 5)) {
            if ((a7 - 1.25) <= weight7) {
                System.out.println("7.Set 벤치프레스 " + a7 + "kg(권장 Reps 5회)");
            }
            if ((a7 - 3.75) <= weight7 && weight7 < (a7 - 1.25)) {
                System.out.println("7.Set 벤치프레스 " + (a7 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a7 - 5) <= weight7 && weight7 < -3.75) {
                System.out.println("7.Set 벤치프레스 " + (a7 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight7 < (a7 + 1.25)) {
                System.out.println("7.Set 벤치프레스 " + a7 + "kg(권장 Reps 5회)");
            }
            if ((a7 + 1.25) <= weight7 && weight7 < (a7 + 3.75)) {
                System.out.println("7.Set 벤치프레스 " + (a7 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a7 + 3.75) <= weight7 && weight7 < (a7 + 5)) {
                System.out.println("7.Set 벤치프레스 " + (a7 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps7 = scanner.nextDouble();

        double weight8 = num1 * 0.70;
        double a8 = Math.round(weight8 / 10) * 10;

        if (weight8 < a8 && a8 <= (weight8 + 5)) {
            if ((a8 - 1.25) <= weight8) {
                System.out.println("8.Set 벤치프레스 " + a8 + "kg(권장 Reps 3회)");
            }
            if ((a8 - 3.75) <= weight8 && weight8 < (a8 - 1.25)) {
                System.out.println("8.Set 벤치프레스 " + (a8 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a8 - 5) <= weight8 && weight8 < -3.75) {
                System.out.println("8.Set 벤치프레스 " + (a8 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight8 < (a8 + 1.25)) {
                System.out.println("8.Set 벤치프레스 " + a8 + "kg(권장 Reps 3회)");
            }
            if ((a8 + 1.25) <= weight8 && weight8 < (a8 + 3.75)) {
                System.out.println("8.Set 벤치프레스 " + (a8 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a8 + 3.75) <= weight8 && weight8 < (a8 + 5)) {
                System.out.println("8.Set 벤치프레스 " + (a8 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps8 = scanner.nextDouble();

        double weight9 = num1 * 0.65;
        double a9 = Math.round(weight9 / 10) * 10;

        if (weight9 < a9 && a9 <= (weight9 + 5)) {
            if ((a9 - 1.25) <= weight9) {
                System.out.println("9.Set 벤치프레스 " + a9 + "kg(권장 Reps 1회 이상)");
            }
            if ((a9 - 3.75) <= weight9 && weight9 < (a9 - 1.25)) {
                System.out.println("9.Set 벤치프레스 " + (a9 - 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((a9 - 5) <= weight9 && weight9 < -3.75) {
                System.out.println("9.Set 벤치프레스 " + (a9 - 5) + "kg(권장 Reps 1회 이상)");
            }
        } else {
            if (weight9 < (a9 + 1.25)) {
                System.out.println("9.Set 벤치프레스 " + a9 + "kg(권장 Reps 1회 이상)");
            }
            if ((a9 + 1.25) <= weight9 && weight9 < (a9 + 3.75)) {
                System.out.println("9.Set 벤치프레스 " + (a9 + 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((a9 + 3.75) <= weight9 && weight9 < (a9 + 5)) {
                System.out.println("9.Set 벤치프레스 " + (a9 + 5) + "kg(권장 Reps 1회 이상)");
            }
        }

        System.out.println("몇 Reps 수행하셨습니까?");

        int asist = random.nextInt(4);

        double reps9 = scanner.nextDouble();

        if (reps3 >= 11) {
            num1 = (num1 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps3 >= 8 && reps3 < 11) {
            num1 = (num1 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps3 >= 5 && reps3 < 8) {
            num1 = (num1 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps3 >= 2 && reps3 < 5) {
            num1 = (num1 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps3 < 2) {
            num1 = (num1);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asist == 0) {
            System.out.println("마무리 보조운동 추천!!!! 인클라인 덤벨프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 1) {
            System.out.println("마무리 보조운동 추천!!!! 딥스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 2) {
            System.out.println("마무리 보조운동 추천!!!! 클로즈그립 데드리프트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 3) {
            System.out.println("마무리 보조운동 추천!!!! 덤벨 플라이 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

        //다음 프로그램 시작!!
        System.out.println("다음 프로그램을 수행하시려면 start를 입력하시오!");

        String answer5 = scanner.next().toUpperCase();

        if (!answer5.equals("START")) {
            return;
        }

        //데드리프트 시작!
        System.out.println("-----------1주차------------");
        System.out.println("수요일 데드리프트");

        double weighta1 = num2 * 0.75;
        double b1 = Math.round(weighta1 / 10) * 10;

        if (weighta1 < b1 && b1 <= (weighta1 + 5)) {
            if ((b1 - 1.25) <= weighta1) {
                System.out.println("1.Set 데드리프트 " + b1 + "kg(권장 Reps 5회)");
            }
            if ((b1 - 3.75) <= weighta1 && weighta1 < (b1 - 1.25)) {
                System.out.println("1.Set 데드리프트 " + (b1 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b1 - 5) <= weighta1 && weighta1 < -3.75) {
                System.out.println("1.Set 데드리프트 " + (b1 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weighta1 < (b1 + 1.25)) {
                System.out.println("1.Set 데드리프트 " + b1 + "kg(권장 Reps 5회)");
            }
            if ((b1 + 1.25) <= weighta1 && weighta1 < (b1 + 3.75)) {
                System.out.println("1.Set 데드리프트 " + (b1 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b1 + 3.75) <= weighta1 && weighta1 < (b1 + 5)) {
                System.out.println("1.Set 데드리프트 " + (b1 + 5) + "kg(권장 Reps 5회)");
            }
        }


        System.out.print("몇 Reps 수행하셨습니까?");

        double reps11 = scanner.nextDouble();

        double weighta2 = num2 * 0.85;
        double b2 = Math.round(weighta2 / 10) * 10;

        if (weighta2 < b2 && b2 <= (weighta2 + 5)) {
            if ((b2 - 1.25) <= weighta2) {
                System.out.println("2.Set 데드리프트 " + b2 + "kg(권장 Reps 3회)");
            }
            if ((b2 - 3.75) <= weighta2 && weighta2 < (b2 - 1.25)) {
                System.out.println("2.Set 데드리프트 " + (b2 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b2 - 5) <= weighta2 && weighta2 < -3.75) {
                System.out.println("2.Set 데드리프트 " + (b2 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weighta2 < (b2 + 1.25)) {
                System.out.println("2.Set 데드리프트 " + b2 + "kg(권장 Reps 3회)");
            }
            if ((b2 + 1.25) <= weighta2 && weighta2 < (b2 + 3.75)) {
                System.out.println("2.Set 데드리프트 " + (b2 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b2 + 3.75) <= weighta2 && weighta2 < (b2 + 5)) {
                System.out.println("2.Set 데드리프트 " + (b2 + 5) + "kg(권장 Reps 3회)");
            }
        }


        System.out.print("몇 Reps 수행하셨습니까?");

        double reps12 = scanner.nextDouble();

        double weighta3 = num2 * 0.95;
        double b3 = Math.round(weighta3 / 10) * 10;

        if (weighta3 < b3 && b3 <= (weighta3 + 5)) {
            if ((b3 - 1.25) <= weighta3) {
                System.out.println("3.Set 데드리프트 " + b3 + "kg(권장 Reps 1회)");
            }
            if ((b3 - 3.75) <= weighta3 && weighta3 < (b3 - 1.25)) {
                System.out.println("3.Set 데드리프트 " + (b3 - 2.5) + "kg(권장 Reps 1회)");
            }
            if ((b3 - 5) <= weighta3 && weighta3 < -3.75) {
                System.out.println("3.Set 데드리프트 " + (b3 - 5) + "kg(권장 Reps 1회)");
            }
        } else {
            if (weighta3 < (b3 + 1.25)) {
                System.out.println("3.Set 데드리프트 " + b3 + "kg(권장 Reps 1회)");
            }
            if ((b3 + 1.25) <= weighta3 && weighta3 < (b3 + 3.75)) {
                System.out.println("3.Set 데드리프트 " + (b3 + 2.5) + "kg(권장 Reps 1회)");
            }
            if ((b3 + 3.75) <= weighta3 && weighta3 < (b3 + 5)) {
                System.out.println("3.Set 데드리프트 " + (b3 + 5) + "kg(권장 Reps 1회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps13 = scanner.nextDouble();

        double weighta4 = num2 * 0.90;
        double b4 = Math.round(weighta4 / 10) * 10;

        if (weighta4 < b4 && b4 <= (weighta4 + 5)) {
            if ((b4 - 1.25) <= weighta4) {
                System.out.println("4.Set 데드리프트 " + b4 + "kg(권장 Reps 3회)");
            }
            if ((b4 - 3.75) <= weighta4 && weighta4 < (b4 - 1.25)) {
                System.out.println("4.Set 데드리프트 " + (b4 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b4 - 5) <= weighta4 && weighta4 < -3.75) {
                System.out.println("4.Set 데드리프트 " + (b4 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weighta4 < (b4 + 1.25)) {
                System.out.println("4.Set 데드리프트 " + b4 + "kg(권장 Reps 3회)");
            }
            if ((b4 + 1.25) <= weighta4 && weighta4 < (b4 + 3.75)) {
                System.out.println("4.Set 데드리프트 " + (b4 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b4 + 3.75) <= weighta4 && weighta4 < (b4 + 5)) {
                System.out.println("4.Set 데드리프트 " + (b4 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps14 = scanner.nextDouble();

        double weighta5 = num2 * 0.85;
        double b5 = Math.round(weighta5 / 10) * 10;

        if (weighta5 < b5 && b5 <= (weighta5 + 5)) {
            if ((b5 - 1.25) <= weighta5) {
                System.out.println("5.Set 데드리프트 " + b5 + "kg(권장 Reps 5회)");
            }
            if ((b5 - 3.75) <= weighta5 && weighta5 < (b5 - 1.25)) {
                System.out.println("5.Set 데드리프트 " + (b5 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b5 - 5) <= weighta5 && weighta5 < -3.75) {
                System.out.println("5.Set 데드리프트 " + (b5 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weighta5 < (b5 + 1.25)) {
                System.out.println("5.Set 데드리프트 " + b5 + "kg(권장 Reps 5회)");
            }
            if ((b5 + 1.25) <= weighta5 && weighta5 < (b5 + 3.75)) {
                System.out.println("5.Set 데드리프트 " + (b5 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b5 + 3.75) <= weighta5 && weighta5 < (b5 + 5)) {
                System.out.println("5.Set 데드리프트 " + (b5 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps15 = scanner.nextDouble();

        double weighta6 = num2 * 0.80;
        double b6 = Math.round(weighta6 / 10) * 10;

        if (weighta6 < b6 && b6 <= (weighta6 + 5)) {
            if ((b6 - 1.25) <= weighta6) {
                System.out.println("6.Set 데드리프트 " + b6 + "kg(권장 Reps 3회)");
            }
            if ((b6 - 3.75) <= weighta6 && weighta6 < (b6 - 1.25)) {
                System.out.println("6.Set 데드리프트 " + (b6 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b6 - 5) <= weighta6 && weighta6 < -3.75) {
                System.out.println("6.Set 데드리프트 " + (b6 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weighta6 < (b6 + 1.25)) {
                System.out.println("6.Set 데드리프트 " + b6 + "kg(권장 Reps 3회)");
            }
            if ((b6 + 1.25) <= weighta6 && weighta6 < (b6 + 3.75)) {
                System.out.println("6.Set 데드리프트 " + (b6 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b6 + 3.75) <= weighta6 && weighta6 < (b6 + 5)) {
                System.out.println("6.Set 데드리프트 " + (b6 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps16 = scanner.nextDouble();

        double weighta7 = num2 * 0.75;
        double b7 = Math.round(weighta7 / 10) * 10;

        if (weighta7 < b7 && b7 <= (weighta7 + 5)) {
            if ((b7 - 1.25) <= weighta7) {
                System.out.println("7.Set 데드리프트 " + b7 + "kg(권장 Reps 5회)");
            }
            if ((b7 - 3.75) <= weighta7 && weighta7 < (b7 - 1.25)) {
                System.out.println("7.Set 데드리프트 " + (b7 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b7 - 5) <= weighta7 && weighta7 < -3.75) {
                System.out.println("7.Set 데드리프트 " + (b7 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weighta7 < (b7 + 1.25)) {
                System.out.println("7.Set 데드리프트 " + b7 + "kg(권장 Reps 5회)");
            }
            if ((b7 + 1.25) <= weighta7 && weighta7 < (b7 + 3.75)) {
                System.out.println("7.Set 데드리프트 " + (b7 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b7 + 3.75) <= weighta7 && weighta7 < (b7 + 5)) {
                System.out.println("7.Set 데드리프트 " + (b7 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps17 = scanner.nextDouble();

        double weighta8 = num2 * 0.70;
        double b8 = Math.round(weighta8 / 10) * 10;

        if (weighta8 < b8 && b8 <= (weighta8 + 5)) {
            if ((b8 - 1.25) <= weighta8) {
                System.out.println("8.Set 데드리프트 " + b8 + "kg(권장 Reps 3회)");
            }
            if ((b8 - 3.75) <= weighta8 && weighta8 < (b8 - 1.25)) {
                System.out.println("8.Set 데드리프트 " + (b8 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b8 - 5) <= weighta8 && weighta8 < -3.75) {
                System.out.println("8.Set 데드리프트 " + (b8 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weighta8 < (b8 + 1.25)) {
                System.out.println("8.Set 데드리프트 " + b8 + "kg(권장 Reps 3회)");
            }
            if ((b8 + 1.25) <= weighta8 && weighta8 < (b8 + 3.75)) {
                System.out.println("8.Set 데드리프트 " + (b8 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b8 + 3.75) <= weighta8 && weighta8 < (b8 + 5)) {
                System.out.println("8.Set 데드리프트 " + (b8 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps18 = scanner.nextDouble();

        double weighta9 = num2 * 0.65;
        double b9 = Math.round(weighta9 / 10) * 10;

        if (weighta9 < b9 && b9 <= (weighta9 + 5)) {
            if ((b9 - 1.25) <= weighta9) {
                System.out.println("9.Set 데드리프트 " + b9 + "kg(권장 Reps 1회 이상)");
            }
            if ((b9 - 3.75) <= weighta9 && weighta9 < (b9 - 1.25)) {
                System.out.println("9.Set 데드리프트 " + (b9 - 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((b9 - 5) <= weighta9 && weighta9 < -3.75) {
                System.out.println("9.Set 데드리프트 " + (b9 - 5) + "kg(권장 Reps 1회 이상)");
            }
        } else {
            if (weighta9 < (b9 + 1.25)) {
                System.out.println("9.Set 데드리프트 " + b9 + "kg(권장 Reps 1회 이상)");
            }
            if ((b9 + 1.25) <= weighta9 && weighta9 < (b9 + 3.75)) {
                System.out.println("9.Set 데드리프트 " + (b9 + 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((b9 + 3.75) <= weighta9 && weighta9 < (b9 + 5)) {
                System.out.println("9.Set 데드리프트 " + (b9 + 5) + "kg(권장 Reps 1회 이상)");
            }
        }

        System.out.println("몇 Reps 수행하셨습니까?");

        int asist2 = random.nextInt(4);

        double reps19 = scanner.nextDouble();

        if (reps13 >= 11) {
            num2 = (num2 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps13 >= 8 && reps13 < 11) {
            num2 = (num2 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps13 >= 5 && reps13 < 8) {
            num2 = (num2 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps13 >= 2 && reps13 < 5) {
            num2 = (num2 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps13 < 2) {
            num2 = (num2);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asist2 == 0) {
            System.out.println("마무리 보조운동 추천!!!! 랫풀 다운 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist2 == 1) {
            System.out.println("마무리 보조운동 추천!!!! 바벨 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist2 == 2) {
            System.out.println("마무리 보조운동 추천!!!! 케이블 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist2 == 3) {
            System.out.println("마무리 보조운동 추천!!!! 풀업 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

        //다음 프로그램 시작!!
        System.out.println("다음 프로그램을 수행하시려면 start를 입력하시오!");

        String answer6 = scanner.next().toUpperCase();

        if (!answer6.equals("START")) {
            return;
        }

        //스쿼트 시작!
        System.out.println("-----------1주차------------");
        System.out.println("금요일 스쿼트");

        double weightb1 = num3 * 0.75;
        double c1 = Math.round(weightb1 / 10) * 10;

        if (weightb1 < c1 && c1 <= (weightb1 + 5)) {
            if ((c1 - 1.25) <= weightb1) {
                System.out.println("1.Set 스쿼트 " + c1 + "kg(권장 Reps 5회)");
            }
            if ((c1 - 3.75) <= weightb1 && weightb1 < (c1 - 1.25)) {
                System.out.println("1.Set 스쿼트 " + (c1 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c1 - 5) <= weightb1 && weightb1 < -3.75) {
                System.out.println("1.Set 스쿼트 " + (c1 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weightb1 < (c1 + 1.25)) {
                System.out.println("1.Set 스쿼트 " + c1 + "kg(권장 Reps 5회)");
            }
            if ((c1 + 1.25) <= weightb1 && weightb1 < (c1 + 3.75)) {
                System.out.println("1.Set 스쿼트 " + (c1 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c1 + 3.75) <= weightb1 && weightb1 < (c1 + 5)) {
                System.out.println("1.Set 스쿼트 " + (c1 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps21 = scanner.nextDouble();

        double weightb2 = num3 * 0.85;
        double c2 = Math.round(weightb2 / 10) * 10;

        if (weightb2 < c2 && c2 <= (weightb2 + 5)) {
            if ((c2 - 1.25) <= weightb2) {
                System.out.println("2.Set 스쿼트 " + c2 + "kg(권장 Reps 3회)");
            }
            if ((c2 - 3.75) <= weightb2 && weightb2 < (c2 - 1.25)) {
                System.out.println("2.Set 스쿼트 " + (c2 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c2 - 5) <= weightb2 && weightb2 < -3.75) {
                System.out.println("2.Set 스쿼트 " + (c2 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weightb2 < (c2 + 1.25)) {
                System.out.println("2.Set 스쿼트 " + c2 + "kg(권장 Reps 3회)");
            }
            if ((c2 + 1.25) <= weightb2 && weightb2 < (c2 + 3.75)) {
                System.out.println("2.Set 스쿼트 " + (c2 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c2 + 3.75) <= weightb2 && weightb2 < (c2 + 5)) {
                System.out.println("2.Set 스쿼트 " + (c2 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps22 = scanner.nextDouble();

        double weightb3 = num3 * 0.95;
        double c3 = Math.round(weightb3 / 10) * 10;

        if (weightb3 < c3 && c3 <= (weightb3 + 5)) {
            if ((c3 - 1.25) <= weightb3) {
                System.out.println("3.Set 스쿼트 " + c3 + "kg(권장 Reps 1회)");
            }
            if ((c3 - 3.75) <= weightb3 && weightb3 < (c3 - 1.25)) {
                System.out.println("3.Set 스쿼트 " + (c3 - 2.5) + "kg(권장 Reps 1회)");
            }
            if ((c3 - 5) <= weightb3 && weightb3 < -3.75) {
                System.out.println("3.Set 스쿼트 " + (c3 - 5) + "kg(권장 Reps 1회)");
            }
        } else {
            if (weightb3 < (c3 + 1.25)) {
                System.out.println("3.Set 스쿼트 " + c3 + "kg(권장 Reps 1회)");
            }
            if ((c3 + 1.25) <= weightb3 && weightb3 < (c3 + 3.75)) {
                System.out.println("3.Set 스쿼트 " + (c3 + 2.5) + "kg(권장 Reps 1회)");
            }
            if ((c3 + 3.75) <= weightb3 && weightb3 < (c3 + 5)) {
                System.out.println("3.Set 스쿼트 " + (c3 + 5) + "kg(권장 Reps 1회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps23 = scanner.nextDouble();

        double weightb4 = num3 * 0.90;
        double c4 = Math.round(weightb4 / 10) * 10;

        if (weightb4 < c4 && c4 <= (weightb4 + 5)) {
            if ((c4 - 1.25) <= weightb4) {
                System.out.println("4.Set 스쿼트 " + c4 + "kg(권장 Reps 3회)");
            }
            if ((c4 - 3.75) <= weightb4 && weightb4 < (c4 - 1.25)) {
                System.out.println("4.Set 스쿼트 " + (c4 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c4 - 5) <= weightb4 && weightb4 < -3.75) {
                System.out.println("4.Set 스쿼트 " + (c4 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weightb4 < (c4 + 1.25)) {
                System.out.println("4.Set 스쿼트 " + c4 + "kg(권장 Reps 3회)");
            }
            if ((c4 + 1.25) <= weightb4 && weightb4 < (c4 + 3.75)) {
                System.out.println("4.Set 스쿼트 " + (c4 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c4 + 3.75) <= weightb4 && weightb4 < (c4 + 5)) {
                System.out.println("4.Set 스쿼트 " + (c4 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps24 = scanner.nextDouble();

        double weightb5 = num3 * 0.85;
        double c5 = Math.round(weightb5 / 10) * 10;

        if (weightb5 < c5 && c5 <= (weightb5 + 5)) {
            if ((c5 - 1.25) <= weightb5) {
                System.out.println("5.Set 스쿼트 " + c5 + "kg(권장 Reps 5회)");
            }
            if ((c5 - 3.75) <= weightb5 && weightb5 < (c5 - 1.25)) {
                System.out.println("5.Set 스쿼트 " + (c5 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c5 - 5) <= weightb5 && weightb5 < -3.75) {
                System.out.println("5.Set 스쿼트 " + (c5 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weightb5 < (c5 + 1.25)) {
                System.out.println("5.Set 스쿼트 " + c5 + "kg(권장 Reps 5회)");
            }
            if ((c5 + 1.25) <= weightb5 && weightb5 < (c5 + 3.75)) {
                System.out.println("5.Set 스쿼트 " + (c5 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c5 + 3.75) <= weightb5 && weightb5 < (c5 + 5)) {
                System.out.println("5.Set 스쿼트 " + (c5 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps25 = scanner.nextDouble();

        double weightb6 = num3 * 0.80;
        double c6 = Math.round(weightb6 / 10) * 10;

        if (weightb6 < c6 && c6 <= (weightb6 + 5)) {
            if ((c6 - 1.25) <= weightb6) {
                System.out.println("6.Set 스쿼트 " + c6 + "kg(권장 Reps 3회)");
            }
            if ((c6 - 3.75) <= weightb6 && weightb6 < (c6 - 1.25)) {
                System.out.println("6.Set 스쿼트 " + (c6 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c6 - 5) <= weightb6 && weightb6 < -3.75) {
                System.out.println("6.Set 스쿼트 " + (c6 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weightb6 < (c6 + 1.25)) {
                System.out.println("6.Set 스쿼트 " + c6 + "kg(권장 Reps 3회)");
            }
            if ((c6 + 1.25) <= weightb6 && weightb6 < (c6 + 3.75)) {
                System.out.println("6.Set 스쿼트 " + (c6 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c6 + 3.75) <= weightb6 && weightb6 < (c6 + 5)) {
                System.out.println("6.Set 스쿼트 " + (c6 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps26 = scanner.nextDouble();

        double weightb7 = num3 * 0.75;
        double c7 = Math.round(weightb7 / 10) * 10;

        if (weightb7 < c7 && c7 <= (weightb7 + 5)) {
            if ((c7 - 1.25) <= weightb7) {
                System.out.println("7.Set 스쿼트 " + c7 + "kg(권장 Reps 5회)");
            }
            if ((c7 - 3.75) <= weightb7 && weightb7 < (c7 - 1.25)) {
                System.out.println("7.Set 스쿼트 " + (c7 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c7 - 5) <= weightb7 && weightb7 < -3.75) {
                System.out.println("7.Set 스쿼트 " + (c7 - 5) + "kg(권장 Reps 5회)");
            }
        }else{
            if (weightb7 < (c7 + 1.25)) {
                System.out.println("7.Set 스쿼트 " + c7 + "kg(권장 Reps 5회)");
            }
            if ((c7 + 1.25) <= weightb7 && weightb7 < (c7 + 3.75)) {
                System.out.println("7.Set 스쿼트 " + (c7 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c7 + 3.75) <= weightb7 && weightb7 < (c7 + 5)) {
                System.out.println("7.Set 스쿼트 " + (c7 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps27 = scanner.nextDouble();

        double weightb8 = num3 * 0.70;
        double c8 = Math.round(weightb8 / 10) * 10;

        if (weightb8 < c8 && c8 <= (weightb8 + 5)) {
            if ((c8 - 1.25) <= weightb8) {
                System.out.println("8.Set 스쿼트 " + c8 + "kg(권장 Reps 3회)");
            }
            if ((c8 - 3.75) <= weightb8 && weightb8 < (c8 - 1.25)) {
                System.out.println("8.Set 스쿼트 " + (c8 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c8 - 5) <= weightb8 && weightb8 < -3.75) {
                System.out.println("8.Set 스쿼트 " + (c8 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weightb8 < (c8 + 1.25)) {
                System.out.println("8.Set 스쿼트 " + c8 + "kg(권장 Reps 3회)");
            }
            if ((c8 + 1.25) <= weightb8 && weightb8 < (c8 + 3.75)) {
                System.out.println("8.Set 스쿼트 " + (c8 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c8 + 3.75) <= weightb8 && weightb8 < (c8 + 5)) {
                System.out.println("8.Set 스쿼트 " + (c8 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps28 = scanner.nextDouble();

        double weightb9 = num3 * 0.65;
        double c9 = Math.round(weightb9 / 10) * 10;

        if (weightb9 < c9 && c9 <= (weightb9 + 5)) {
            if ((c9 - 1.25) <= weightb9) {
                System.out.println("9.Set 스쿼트 " + c9 + "kg(권장 Reps 1회 이상)");
            }
            if ((c9 - 3.75) <= weightb9 && weightb9 < (c9 - 1.25)) {
                System.out.println("9.Set 스쿼트 " + (c9 - 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((c9 - 5) <= weightb9 && weightb9 < -3.75) {
                System.out.println("9.Set 스쿼트 " + (c9 - 5) + "kg(권장 Reps 1회 이상)");
            }
        } else {
            if (weightb9 < (c9 + 1.25)) {
                System.out.println("9.Set 스쿼트 " + c9 + "kg(권장 Reps 1회 이상)");
            }
            if ((c9 + 1.25) <= weightb9 && weightb9 < (c9 + 3.75)) {
                System.out.println("9.Set 스쿼트 " + (c9 + 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((c9 + 3.75) <= weightb9 && weightb9 < (c9 + 5)) {
                System.out.println("9.Set 스쿼트 " + (c9 + 5) + "kg(권장 Reps 1회 이상)");
            }
        }

        System.out.println("몇 Reps 수행하셨습니까?");

        int asist3 = random.nextInt(4);

        double reps29 = scanner.nextDouble();

        if (reps23 >= 11) {
            num3 = (num3 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps23 >= 8 && reps23 < 11) {
            num3 = (num3 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps23 >= 5 && reps23 < 8) {
            num3 = (num3 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps23 >= 2 && reps23 < 5) {
            num3 = (num3 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps23 < 2) {
            num3 = (num3);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asist3 == 0) {
            System.out.println("마무리 보조운동 추천!!!! 레그 익스텐션 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist3 == 1) {
            System.out.println("마무리 보조운동 추천!!!! 레그 프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist3 == 2) {
            System.out.println("마무리 보조운동 추천!!!! 레그 컬 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asist == 3) {
            System.out.println("마무리 보조운동 추천!!!! 핵 스쿼트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        ///////

        //다음 프로그램 시작!!
        System.out.println("다음 프로그램을 수행하시려면 start를 입력하시오!");

        String answer7 = scanner.next().toUpperCase();

        if (!answer7.equals("START")) {
            return;
        }

        System.out.println("-----------2주차------------");
        System.out.println("월요일 벤치프레스");

        double weight11 = num1 * 0.75;
        double a11 = Math.round(weight11 / 10) * 10;

        if (weight11 < a11 && a11 <= (weight11 + 5)) {
            if ((a11 - 1.25) <= weight11) {
                System.out.println("1.Set 벤치프레스 " + a11 + "kg(권장 Reps 5회)");
            }
            if ((a11 - 3.75) <= weight11 && weight11 < (a11 - 1.25)) {
                System.out.println("1.Set 벤치프레스 " + (a11 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a11 - 5) <= weight11 && weight11 < -3.75) {
                System.out.println("1.Set 벤치프레스 " + (a11 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight11 < (a11 + 1.25)) {
                System.out.println("1.Set 벤치프레스 " + a11 + "kg(권장 Reps 5회)");
            }
            if ((a11 + 1.25) <= weight11 && weight11 < (a11 + 3.75)) {
                System.out.println("1.Set 벤치프레스 " + (a11 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a11 + 3.75) <= weight11 && weight11 < (a11 + 5)) {
                System.out.println("1.Set 벤치프레스 " + (a11 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a = scanner.nextDouble();

        double weight12 = num1 * 0.85;
        double a22 = Math.round(weight12 / 10) * 10;

        if (weight12 < a22 && a22 <= (weight12 + 5)) {
            if ((a22 - 1.25) <= weight12) {
                System.out.println("2.Set 벤치프레스 " + a22 + "kg(권장 Reps 3회)");
            }
            if ((a22 - 3.75) <= weight12 && weight12 < (a22 - 1.25)) {
                System.out.println("2.Set 벤치프레스 " + (a22 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a22 - 5) <= weight12 && weight12 < -3.75) {
                System.out.println("2.Set 벤치프레스 " + (a22 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight12 < (a22 + 1.25)) {
                System.out.println("2.Set 벤치프레스 " + a22 + "kg(권장 Reps 3회)");
            }
            if ((a22 + 1.25) <= weight12 && weight12 < (a22 + 3.75)) {
                System.out.println("2.Set 벤치프레스 " + (a22 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a22 + 3.75) <= weight12 && weight12 < (a22 + 5)) {
                System.out.println("2.Set 벤치프레스 " + (a22 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a = scanner.nextDouble();

        double weight13 = num1 * 0.95;
        double a33 = Math.round(weight13 / 10) * 10;

        if (weight13 < a33 && a33 <= (weight13 + 5)) {
            if ((a33 - 1.25) <= weight13) {
                System.out.println("3.Set 벤치프레스 " + a33 + "kg(권장 Reps 1회)");
            }
            if ((a33 - 3.75) <= weight13 && weight13 < (a33 - 1.25)) {
                System.out.println("3.Set 벤치프레스 " + (a33 - 2.5) + "kg(권장 Reps 1회)");
            }
            if ((a33 - 5) <= weight13 && weight13 < -3.75) {
                System.out.println("3.Set 벤치프레스 " + (a33 - 5) + "kg(권장 Reps 1회)");
            }
        } else {
            if (weight13 < (a33 + 1.25)) {
                System.out.println("3.Set 벤치프레스 " + a33 + "kg(권장 Reps 1회)");
            }
            if ((a33 + 1.25) <= weight13 && weight13 < (a33 + 3.75)) {
                System.out.println("3.Set 벤치프레스 " + (a33 + 2.5) + "kg(권장 Reps 1회)");
            }
            if ((a33 + 3.75) <= weight13 && weight13 < (a33 + 5)) {
                System.out.println("3.Set 벤치프레스 " + (a33 + 5) + "kg(권장 Reps 1회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps3a = scanner.nextDouble();

        double weight14 = num1 * 0.90;
        double a44 = Math.round(weight14 / 10) * 10;

        if (weight14 < a44 && a44 <= (weight14 + 5)) {
            if ((a44 - 1.25) <= weight14) {
                System.out.println("4.Set 벤치프레스 " + a44 + "kg(권장 Reps 3회)");
            }
            if ((a44 - 3.75) <= weight14 && weight14 < (a44 - 1.25)) {
                System.out.println("4.Set 벤치프레스 " + (a44 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a44 - 5) <= weight14 && weight14 < -3.75) {
                System.out.println("4.Set 벤치프레스 " + (a44 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight14 < (a44 + 1.25)) {
                System.out.println("4.Set 벤치프레스 " + a44 + "kg(권장 Reps 3회)");
            }
            if ((a44 + 1.25) <= weight14 && weight14 < (a44 + 3.75)) {
                System.out.println("4.Set 벤치프레스 " + (a44 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a44 + 3.75) <= weight14 && weight14 < (a44 + 5)) {
                System.out.println("4.Set 벤치프레스 " + (a44 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps4a = scanner.nextDouble();

        double weight15 = num1 * 0.85;
        double a55 = Math.round(weight15 / 10) * 10;

        if (weight15 < a55 && a55 <= (weight15 + 5)) {
            if ((a55 - 1.25) <= weight15) {
                System.out.println("5.Set 벤치프레스 " + a55 + "kg(권장 Reps 5회)");
            }
            if ((a55 - 3.75) <= weight15 && weight15 < (a55 - 1.25)) {
                System.out.println("5.Set 벤치프레스 " + (a55 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a55 - 5) <= weight15 && weight15 < -3.75) {
                System.out.println("5.Set 벤치프레스 " + (a55 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight15 < (a55 + 1.25)) {
                System.out.println("5.Set 벤치프레스 " + a55 + "kg(권장 Reps 5회)");
            }
            if ((a55 + 1.25) <= weight15 && weight15 < (a55 + 3.75)) {
                System.out.println("5.Set 벤치프레스 " + (a55 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a55 + 3.75) <= weight15 && weight15 < (a55 + 5)) {
                System.out.println("5.Set 벤치프레스 " + (a55 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps5a = scanner.nextDouble();

        double weight16 = num1 * 0.80;
        double a66 = Math.round(weight16 / 10) * 10;

        if (weight16 < a66 && a66 <= (weight16 + 5)) {
            if ((a66 - 1.25) <= weight16) {
                System.out.println("6.Set 벤치프레스 " + a66 + "kg(권장 Reps 3회)");
            }
            if ((a66 - 3.75) <= weight16 && weight16 < (a66 - 1.25)) {
                System.out.println("6.Set 벤치프레스 " + (a66 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a66 - 5) <= weight16 && weight16 < -3.75) {
                System.out.println("6.Set 벤치프레스 " + (a66 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight16 < (a66 + 1.25)) {
                System.out.println("6.Set 벤치프레스 " + a66 + "kg(권장 Reps 3회)");
            }
            if ((a66 + 1.25) <= weight16 && weight16 < (a66 + 3.75)) {
                System.out.println("6.Set 벤치프레스 " + (a66 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a66 + 3.75) <= weight16 && weight16 < (a66 + 5)) {
                System.out.println("6.Set 벤치프레스 " + (a66 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps6a = scanner.nextDouble();

        double weight17 = num1 * 0.75;
        double a77 = Math.round(weight17 / 10) * 10;

        if (weight17 < a77 && a77 <= (weight17 + 5)) {
            if ((a77 - 1.25) <= weight17) {
                System.out.println("7.Set 벤치프레스 " + a77 + "kg(권장 Reps 5회)");
            }
            if ((a77 - 3.75) <= weight17 && weight17 < (a77 - 1.25)) {
                System.out.println("7.Set 벤치프레스 " + (a77 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a77 - 5) <= weight17 && weight17 < -3.75) {
                System.out.println("7.Set 벤치프레스 " + (a77 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight17 < (a77 + 1.25)) {
                System.out.println("7.Set 벤치프레스 " + a77 + "kg(권장 Reps 5회)");
            }
            if ((a77 + 1.25) <= weight17 && weight17 < (a77 + 3.75)) {
                System.out.println("7.Set 벤치프레스 " + (a77 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((a77 + 3.75) <= weight17 && weight17 < (a77 + 5)) {
                System.out.println("7.Set 벤치프레스 " + (a77 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps7a = scanner.nextDouble();

        double weight18 = num1 * 0.70;
        double a88 = Math.round(weight18 / 10) * 10;

        if (weight18 < a88 && a88 <= (weight18 + 5)) {
            if ((a88 - 1.25) <= weight18) {
                System.out.println("8.Set 벤치프레스 " + a88 + "kg(권장 Reps 3회)");
            }
            if ((a88 - 3.75) <= weight18 && weight18 < (a88 - 1.25)) {
                System.out.println("8.Set 벤치프레스 " + (a88 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a88 - 5) <= weight18 && weight18 < -3.75) {
                System.out.println("8.Set 벤치프레스 " + (a88 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight18 < (a88 + 1.25)) {
                System.out.println("8.Set 벤치프레스 " + a88 + "kg(권장 Reps 3회)");
            }
            if ((a88 + 1.25) <= weight18 && weight18 < (a88 + 3.75)) {
                System.out.println("8.Set 벤치프레스 " + (a88 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((a88 + 3.75) <= weight18 && weight18 < (a88 + 5)) {
                System.out.println("8.Set 벤치프레스 " + (a88 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps8a = scanner.nextDouble();

        double weight19 = num1 * 0.65;
        double a99 = Math.round(weight19 / 10) * 10;

        if (weight19 < a99 && a99 <= (weight19 + 5)) {
            if ((a99 - 1.25) <= weight19) {
                System.out.println("9.Set 벤치프레스 " + a99 + "kg(권장 Reps 1회 이상)");
            }
            if ((a99 - 3.75) <= weight19 && weight19 < (a99 - 1.25)) {
                System.out.println("9.Set 벤치프레스 " + (a99 - 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((a99 - 5) <= weight19 && weight19 < -3.75) {
                System.out.println("9.Set 벤치프레스 " + (a99 - 5) + "kg(권장 Reps 1회 이상)");
            }
        } else {
            if (weight19 < (a99 + 1.25)) {
                System.out.println("9.Set 벤치프레스 " + a99 + "kg(권장 Reps 1회 이상)");
            }
            if ((a99 + 1.25) <= weight19 && weight19 < (a99 + 3.75)) {
                System.out.println("9.Set 벤치프레스 " + (a99 + 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((a99 + 3.75) <= weight19 && weight19 < (a99 + 5)) {
                System.out.println("9.Set 벤치프레스 " + (a99 + 5) + "kg(권장 Reps 1회 이상)");
            }
        }

        System.out.println("몇 Reps 수행하셨습니까?");

        int asista = random.nextInt(4);

        double reps9a = scanner.nextDouble();

        if (reps3a >= 11) {
            num1 = (num1 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps3a >= 8 && reps3a < 11) {
            num1 = (num1 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps3a >= 5 && reps3a < 8) {
            num1 = (num1 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps3a >= 2 && reps3a < 5) {
            num1 = (num1 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps3a < 2) {
            num1 = (num1);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asista == 0) {
            System.out.println("마무리 보조운동 추천!!!! 인클라인 덤벨프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista == 1) {
            System.out.println("마무리 보조운동 추천!!!! 딥스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista == 2) {
            System.out.println("마무리 보조운동 추천!!!! 클로즈그립 데드리프트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista == 3) {
            System.out.println("마무리 보조운동 추천!!!! 덤벨 플라이 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

        //다음 프로그램 시작!!
        System.out.println("다음 프로그램을 수행하시려면 start를 입력하시오!");

        String answer5a = scanner.next().toUpperCase();

        if (!answer5a.equals("START")) {
            return;
        }

        //데드리프트 시작!
        System.out.println("-----------2주차------------");
        System.out.println("수요일 데드리프트");

        double weight1a11 = num2 * 0.75;
        double b11 = Math.round(weight1a11 / 10) * 10;

        if (weight1a11 < b11 && b11 <= (weight1a11 + 5)) {
            if ((b11 - 1.25) <= weight1a11) {
                System.out.println("1.Set 데드리프트 " + b11 + "kg(권장 Reps 5회)");
            }
            if ((b11 - 3.75) <= weight1a11 && weight1a11 < (b11 - 1.25)) {
                System.out.println("1.Set 데드리프트 " + (b11 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b11 - 5) <= weight1a11 && weight1a11 < -3.75) {
                System.out.println("1.Set 데드리프트 " + (b11 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1a11 < (b11 + 1.25)) {
                System.out.println("1.Set 데드리프트 " + b11 + "kg(권장 Reps 5회)");
            }
            if ((b11 + 1.25) <= weight1a11 && weight1a11 < (b11 + 3.75)) {
                System.out.println("1.Set 데드리프트 " + (b11 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b11 + 3.75) <= weight1a11 && weight1a11 < (b11 + 5)) {
                System.out.println("1.Set 데드리프트 " + (b11 + 5) + "kg(권장 Reps 5회)");
            }
        }


        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a1 = scanner.nextDouble();

        double weight1a22 = num2 * 0.85;
        double b22 = Math.round(weight1a22 / 10) * 10;

        if (weight1a22 < b22 && b22 <= (weight1a22 + 5)) {
            if ((b22 - 1.25) <= weight1a22) {
                System.out.println("2.Set 데드리프트 " + b22 + "kg(권장 Reps 3회)");
            }
            if ((b22 - 3.75) <= weight1a22 && weight1a22 < (b22 - 1.25)) {
                System.out.println("2.Set 데드리프트 " + (b22 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b22 - 5) <= weight1a22 && weight1a22 < -3.75) {
                System.out.println("2.Set 데드리프트 " + (b22 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1a22 < (b22 + 1.25)) {
                System.out.println("2.Set 데드리프트 " + b22 + "kg(권장 Reps 3회)");
            }
            if ((b22 + 1.25) <= weight1a22 && weight1a22 < (b22 + 3.75)) {
                System.out.println("2.Set 데드리프트 " + (b22 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b22 + 3.75) <= weight1a22 && weight1a22 < (b22 + 5)) {
                System.out.println("2.Set 데드리프트 " + (b22 + 5) + "kg(권장 Reps 3회)");
            }
        }


        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a2 = scanner.nextDouble();

        double weight1a33 = num2 * 0.95;
        double b33 = Math.round(weight1a33 / 10) * 10;

        if (weight1a33 < b33 && b33 <= (weight1a33 + 5)) {
            if ((b33 - 1.25) <= weight1a33) {
                System.out.println("3.Set 데드리프트 " + b33 + "kg(권장 Reps 1회)");
            }
            if ((b33 - 3.75) <= weight1a33 && weight1a33 < (b33 - 1.25)) {
                System.out.println("3.Set 데드리프트 " + (b33 - 2.5) + "kg(권장 Reps 1회)");
            }
            if ((b33 - 5) <= weight1a33 && weight1a33 < -3.75) {
                System.out.println("3.Set 데드리프트 " + (b33 - 5) + "kg(권장 Reps 1회)");
            }
        } else {
            if (weight1a33 < (b33 + 1.25)) {
                System.out.println("3.Set 데드리프트 " + b33 + "kg(권장 Reps 1회)");
            }
            if ((b33 + 1.25) <= weight1a33 && weight1a33 < (b33 + 3.75)) {
                System.out.println("3.Set 데드리프트 " + (b33 + 2.5) + "kg(권장 Reps 1회)");
            }
            if ((b33 + 3.75) <= weight1a33 && weight1a33 < (b33 + 5)) {
                System.out.println("3.Set 데드리프트 " + (b33 + 5) + "kg(권장 Reps 1회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a3 = scanner.nextDouble();

        double weight1a44 = num2 * 0.90;
        double b44 = Math.round(weight1a44 / 10) * 10;

        if (weight1a44 < b44 && b44 <= (weight1a44 + 5)) {
            if ((b44 - 1.25) <= weight1a44) {
                System.out.println("4.Set 데드리프트 " + b44 + "kg(권장 Reps 3회)");
            }
            if ((b44 - 3.75) <= weight1a44 && weight1a44 < (b44 - 1.25)) {
                System.out.println("4.Set 데드리프트 " + (b44 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b44 - 5) <= weight1a44 && weight1a44 < -3.75) {
                System.out.println("4.Set 데드리프트 " + (b44 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1a44 < (b44 + 1.25)) {
                System.out.println("4.Set 데드리프트 " + b44 + "kg(권장 Reps 3회)");
            }
            if ((b44 + 1.25) <= weight1a44 && weight1a44 < (b44 + 3.75)) {
                System.out.println("4.Set 데드리프트 " + (b44 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b44 + 3.75) <= weight1a44 && weight1a44 < (b44 + 5)) {
                System.out.println("4.Set 데드리프트 " + (b44 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a4 = scanner.nextDouble();

        double weight1a55 = num2 * 0.85;
        double b55 = Math.round(weight1a55 / 10) * 10;

        if (weight1a55 < b55 && b55 <= (weight1a55 + 5)) {
            if ((b55 - 1.25) <= weight1a55) {
                System.out.println("5.Set 데드리프트 " + b55 + "kg(권장 Reps 5회)");
            }
            if ((b55 - 3.75) <= weight1a55 && weight1a55 < (b55 - 1.25)) {
                System.out.println("5.Set 데드리프트 " + (b55 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b55 - 5) <= weight1a55 && weight1a55 < -3.75) {
                System.out.println("5.Set 데드리프트 " + (b55 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1a55 < (b55 + 1.25)) {
                System.out.println("5.Set 데드리프트 " + b55 + "kg(권장 Reps 5회)");
            }
            if ((b55 + 1.25) <= weight1a55 && weight1a55 < (b55 + 3.75)) {
                System.out.println("5.Set 데드리프트 " + (b55 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b55 + 3.75) <= weight1a55 && weight1a55 < (b55 + 5)) {
                System.out.println("5.Set 데드리프트 " + (b55 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a5 = scanner.nextDouble();

        double weight1a66 = num2 * 0.80;
        double b66 = Math.round(weight1a66 / 10) * 10;

        if (weight1a66 < b66 && b66 <= (weight1a66 + 5)) {
            if ((b66 - 1.25) <= weight1a66) {
                System.out.println("6.Set 데드리프트 " + b66 + "kg(권장 Reps 3회)");
            }
            if ((b66 - 3.75) <= weight1a66 && weight1a66 < (b66 - 1.25)) {
                System.out.println("6.Set 데드리프트 " + (b66 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b66 - 5) <= weight1a66 && weight1a66 < -3.75) {
                System.out.println("6.Set 데드리프트 " + (b66 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1a66 < (b66 + 1.25)) {
                System.out.println("6.Set 데드리프트 " + b66 + "kg(권장 Reps 3회)");
            }
            if ((b66 + 1.25) <= weight1a66 && weight1a66 < (b66 + 3.75)) {
                System.out.println("6.Set 데드리프트 " + (b66 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b66 + 3.75) <= weight1a66 && weight1a66 < (b66 + 5)) {
                System.out.println("6.Set 데드리프트 " + (b66 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a6 = scanner.nextDouble();

        double weight1a77 = num2 * 0.75;
        double b77 = Math.round(weight1a77 / 10) * 10;

        if (weight1a77 < b77 && b77 <= (weight1a77 + 5)) {
            if ((b77 - 1.25) <= weight1a77) {
                System.out.println("7.Set 데드리프트 " + b77 + "kg(권장 Reps 5회)");
            }
            if ((b77 - 3.75) <= weight1a77 && weight1a77 < (b77 - 1.25)) {
                System.out.println("7.Set 데드리프트 " + (b77 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b77 - 5) <= weight1a77 && weight1a77 < -3.75) {
                System.out.println("7.Set 데드리프트 " + (b77 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1a77 < (b77 + 1.25)) {
                System.out.println("7.Set 데드리프트 " + b77 + "kg(권장 Reps 5회)");
            }
            if ((b77 + 1.25) <= weight1a77 && weight1a77 < (b77 + 3.75)) {
                System.out.println("7.Set 데드리프트 " + (b77 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((b77 + 3.75) <= weight1a77 && weight1a77 < (b77 + 5)) {
                System.out.println("7.Set 데드리프트 " + (b77 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a7 = scanner.nextDouble();

        double weight1a88 = num2 * 0.70;
        double b88 = Math.round(weight1a88 / 10) * 10;

        if (weight1a88 < b88 && b88 <= (weight1a88 + 5)) {
            if ((b88 - 1.25) <= weight1a88) {
                System.out.println("8.Set 데드리프트 " + b88 + "kg(권장 Reps 3회)");
            }
            if ((b88 - 3.75) <= weight1a88 && weight1a88 < (b88 - 1.25)) {
                System.out.println("8.Set 데드리프트 " + (b88 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b88 - 5) <= weight1a88 && weight1a88 < -3.75) {
                System.out.println("8.Set 데드리프트 " + (b88 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1a88 < (b88 + 1.25)) {
                System.out.println("8.Set 데드리프트 " + b88 + "kg(권장 Reps 3회)");
            }
            if ((b88 + 1.25) <= weight1a88 && weight1a88 < (b88 + 3.75)) {
                System.out.println("8.Set 데드리프트 " + (b88 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((b88 + 3.75) <= weight1a88 && weight1a88 < (b88 + 5)) {
                System.out.println("8.Set 데드리프트 " + (b88 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps1a8 = scanner.nextDouble();

        double weight1a99 = num2 * 0.65;
        double b99 = Math.round(weight1a99 / 10) * 10;

        if (weight1a99 < b99 && b99 <= (weight1a99 + 5)) {
            if ((b99 - 1.25) <= weight1a99) {
                System.out.println("9.Set 데드리프트 " + b99 + "kg(권장 Reps 1회 이상)");
            }
            if ((b99 - 3.75) <= weight1a99 && weight1a99 < (b99 - 1.25)) {
                System.out.println("9.Set 데드리프트 " + (b99 - 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((b99 - 5) <= weight1a99 && weight1a99 < -3.75) {
                System.out.println("9.Set 데드리프트 " + (b99 - 5) + "kg(권장 Reps 1회 이상)");
            }
        } else {
            if (weight1a99 < (b99 + 1.25)) {
                System.out.println("9.Set 데드리프트 " + b99 + "kg(권장 Reps 1회 이상)");
            }
            if ((b99 + 1.25) <= weight1a99 && weight1a99 < (b99 + 3.75)) {
                System.out.println("9.Set 데드리프트 " + (b99 + 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((b99 + 3.75) <= weight1a99 && weight1a99 < (b99 + 5)) {
                System.out.println("9.Set 데드리프트 " + (b99 + 5) + "kg(권장 Reps 1회 이상)");
            }
        }

        System.out.println("몇 Reps 수행하셨습니까?");

        int asista2a = random.nextInt(4);

        double reps1a9 = scanner.nextDouble();

        if (reps1a3 >= 11) {
            num2 = (num2 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps1a3 >= 8 && reps1a3 < 11) {
            num2 = (num2 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps1a3 >= 5 && reps1a3 < 8) {
            num2 = (num2 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps1a3 >= 2 && reps1a3 < 5) {
            num2 = (num2 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps1a3 < 2) {
            num2 = (num2);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asista2a == 0) {
            System.out.println("마무리 보조운동 추천!!!! 랫풀 다운 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista2a == 1) {
            System.out.println("마무리 보조운동 추천!!!! 바벨 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista2a == 2) {
            System.out.println("마무리 보조운동 추천!!!! 케이블 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista2a == 3) {
            System.out.println("마무리 보조운동 추천!!!! 풀업 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

        //다음 프로그램 시작!!
        System.out.println("다음 프로그램을 수행하시려면 start를 입력하시오!");

        String answer6a = scanner.next().toUpperCase();

        if (!answer6a.equals("START")) {
            return;
        }

        //스쿼트 시작!
        System.out.println("-----------2주차------------");
        System.out.println("금요일 스쿼트");

        double weight1b11 = num3 * 0.75;
        double c11 = Math.round(weight1b11 / 10) * 10;

        if (weight1b11 < c11 && c11 <= (weight1b11 + 5)) {
            if ((c11 - 1.25) <= weight1b11) {
                System.out.println("1.Set 스쿼트 " + c11 + "kg(권장 Reps 5회)");
            }
            if ((c11 - 3.75) <= weight1b11 && weight1b11 < (c11 - 1.25)) {
                System.out.println("1.Set 스쿼트 " + (c11 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c11 - 5) <= weight1b11 && weight1b11 < -3.75) {
                System.out.println("1.Set 스쿼트 " + (c11 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1b11 < (c11 + 1.25)) {
                System.out.println("1.Set 스쿼트 " + c11 + "kg(권장 Reps 5회)");
            }
            if ((c11 + 1.25) <= weight1b11 && weight1b11 < (c11 + 3.75)) {
                System.out.println("1.Set 스쿼트 " + (c11 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c11 + 3.75) <= weight1b11 && weight1b11 < (c11 + 5)) {
                System.out.println("1.Set 스쿼트 " + (c11 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a1 = scanner.nextDouble();

        double weight1b22 = num3 * 0.85;
        double c22 = Math.round(weight1b22 / 10) * 10;

        if (weight1b22 < c22 && c22 <= (weight1b22 + 5)) {
            if ((c22 - 1.25) <= weight1b22) {
                System.out.println("2.Set 스쿼트 " + c22 + "kg(권장 Reps 3회)");
            }
            if ((c22 - 3.75) <= weight1b22 && weight1b22 < (c22 - 1.25)) {
                System.out.println("2.Set 스쿼트 " + (c22 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c22 - 5) <= weight1b22 && weight1b22 < -3.75) {
                System.out.println("2.Set 스쿼트 " + (c22 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1b22 < (c22 + 1.25)) {
                System.out.println("2.Set 스쿼트 " + c22 + "kg(권장 Reps 3회)");
            }
            if ((c22 + 1.25) <= weight1b22 && weight1b22 < (c22 + 3.75)) {
                System.out.println("2.Set 스쿼트 " + (c22 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c22 + 3.75) <= weight1b22 && weight1b22 < (c22 + 5)) {
                System.out.println("2.Set 스쿼트 " + (c22 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a2 = scanner.nextDouble();

        double weight1b33 = num3 * 0.95;
        double c33 = Math.round(weight1b33 / 10) * 10;

        if (weight1b33 < c33 && c33 <= (weight1b33 + 5)) {
            if ((c33 - 1.25) <= weight1b33) {
                System.out.println("3.Set 스쿼트 " + c33 + "kg(권장 Reps 1회)");
            }
            if ((c33 - 3.75) <= weight1b33 && weight1b33 < (c33 - 1.25)) {
                System.out.println("3.Set 스쿼트 " + (c33 - 2.5) + "kg(권장 Reps 1회)");
            }
            if ((c33 - 5) <= weight1b33 && weight1b33 < -3.75) {
                System.out.println("3.Set 스쿼트 " + (c33 - 5) + "kg(권장 Reps 1회)");
            }
        } else {
            if (weight1b33 < (c33 + 1.25)) {
                System.out.println("3.Set 스쿼트 " + c33 + "kg(권장 Reps 1회)");
            }
            if ((c33 + 1.25) <= weight1b33 && weight1b33 < (c33 + 3.75)) {
                System.out.println("3.Set 스쿼트 " + (c33 + 2.5) + "kg(권장 Reps 1회)");
            }
            if ((c33 + 3.75) <= weight1b33 && weight1b33 < (c33 + 5)) {
                System.out.println("3.Set 스쿼트 " + (c33 + 5) + "kg(권장 Reps 1회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a3 = scanner.nextDouble();

        double weight1b44 = num3 * 0.90;
        double c44 = Math.round(weight1b44 / 10) * 10;

        if (weight1b44 < c44 && c44 <= (weight1b44 + 5)) {
            if ((c44 - 1.25) <= weight1b44) {
                System.out.println("4.Set 스쿼트 " + c44 + "kg(권장 Reps 3회)");
            }
            if ((c44 - 3.75) <= weight1b44 && weight1b44 < (c44 - 1.25)) {
                System.out.println("4.Set 스쿼트 " + (c44 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c44 - 5) <= weight1b44 && weight1b44 < -3.75) {
                System.out.println("4.Set 스쿼트 " + (c44 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1b44 < (c44 + 1.25)) {
                System.out.println("4.Set 스쿼트 " + c44 + "kg(권장 Reps 3회)");
            }
            if ((c44 + 1.25) <= weight1b44 && weight1b44 < (c44 + 3.75)) {
                System.out.println("4.Set 스쿼트 " + (c44 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c44 + 3.75) <= weight1b44 && weight1b44 < (c44 + 5)) {
                System.out.println("4.Set 스쿼트 " + (c44 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a4 = scanner.nextDouble();

        double weight1b55 = num3 * 0.85;
        double c55 = Math.round(weight1b55 / 10) * 10;

        if (weight1b55 < c55 && c55 <= (weight1b55 + 5)) {
            if ((c55 - 1.25) <= weight1b55) {
                System.out.println("5.Set 스쿼트 " + c55 + "kg(권장 Reps 5회)");
            }
            if ((c55 - 3.75) <= weight1b55 && weight1b55 < (c55 - 1.25)) {
                System.out.println("5.Set 스쿼트 " + (c55 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c55 - 5) <= weight1b55 && weight1b55 < -3.75) {
                System.out.println("5.Set 스쿼트 " + (c55 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1b55 < (c55 + 1.25)) {
                System.out.println("5.Set 스쿼트 " + c55 + "kg(권장 Reps 5회)");
            }
            if ((c55 + 1.25) <= weight1b55 && weight1b55 < (c55 + 3.75)) {
                System.out.println("5.Set 스쿼트 " + (c55 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c55 + 3.75) <= weight1b55 && weight1b55 < (c55 + 5)) {
                System.out.println("5.Set 스쿼트 " + (c55 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a5 = scanner.nextDouble();

        double weight1b66 = num3 * 0.80;
        double c66 = Math.round(weight1b66 / 10) * 10;

        if (weight1b66 < c66 && c66 <= (weight1b66 + 5)) {
            if ((c66 - 1.25) <= weight1b66) {
                System.out.println("6.Set 스쿼트 " + c66 + "kg(권장 Reps 3회)");
            }
            if ((c66 - 3.75) <= weight1b66 && weight1b66 < (c66 - 1.25)) {
                System.out.println("6.Set 스쿼트 " + (c66 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c66 - 5) <= weight1b66 && weight1b66 < -3.75) {
                System.out.println("6.Set 스쿼트 " + (c66 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1b66 < (c66 + 1.25)) {
                System.out.println("6.Set 스쿼트 " + c66 + "kg(권장 Reps 3회)");
            }
            if ((c66 + 1.25) <= weight1b66 && weight1b66 < (c66 + 3.75)) {
                System.out.println("6.Set 스쿼트 " + (c66 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c66 + 3.75) <= weight1b66 && weight1b66 < (c66 + 5)) {
                System.out.println("6.Set 스쿼트 " + (c66 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a6 = scanner.nextDouble();

        double weight1b77 = num3 * 0.75;
        double c77 = Math.round(weight1b77 / 10) * 10;

        if (weight1b77 < c77 && c77 <= (weight1b77 + 5)) {
            if ((c77 - 1.25) <= weight1b77) {
                System.out.println("7.Set 스쿼트 " + c77 + "kg(권장 Reps 5회)");
            }
            if ((c77 - 3.75) <= weight1b77 && weight1b77 < (c77 - 1.25)) {
                System.out.println("7.Set 스쿼트 " + (c77 - 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c77 - 5) <= weight1b77 && weight1b77 < -3.75) {
                System.out.println("7.Set 스쿼트 " + (c77 - 5) + "kg(권장 Reps 5회)");
            }
        } else {
            if (weight1b77 < (c77 + 1.25)) {
                System.out.println("7.Set 스쿼트 " + c77 + "kg(권장 Reps 5회)");
            }
            if ((c77 + 1.25) <= weight1b77 && weight1b77 < (c77 + 3.75)) {
                System.out.println("7.Set 스쿼트 " + (c77 + 2.5) + "kg(권장 Reps 5회)");
            }
            if ((c77 + 3.75) <= weight1b77 && weight1b77 < (c77 + 5)) {
                System.out.println("7.Set 스쿼트 " + (c77 + 5) + "kg(권장 Reps 5회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a7 = scanner.nextDouble();

        double weight1b88 = num3 * 0.70;
        double c88 = Math.round(weight1b88 / 10) * 10;

        if (weight1b88 < c88 && c88 <= (weight1b88 + 5)) {
            if ((c88 - 1.25) <= weight1b88) {
                System.out.println("8.Set 스쿼트 " + c88 + "kg(권장 Reps 3회)");
            }
            if ((c88 - 3.75) <= weight1b88 && weight1b88 < (c88 - 1.25)) {
                System.out.println("8.Set 스쿼트 " + (c88 - 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c88 - 5) <= weight1b88 && weight1b88 < -3.75) {
                System.out.println("8.Set 스쿼트 " + (c88 - 5) + "kg(권장 Reps 3회)");
            }
        } else {
            if (weight1b88 < (c88 + 1.25)) {
                System.out.println("8.Set 스쿼트 " + c88 + "kg(권장 Reps 3회)");
            }
            if ((c88 + 1.25) <= weight1b88 && weight1b88 < (c88 + 3.75)) {
                System.out.println("8.Set 스쿼트 " + (c88 + 2.5) + "kg(권장 Reps 3회)");
            }
            if ((c88 + 3.75) <= weight1b88 && weight1b88 < (c88 + 5)) {
                System.out.println("8.Set 스쿼트 " + (c88 + 5) + "kg(권장 Reps 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps2a8 = scanner.nextDouble();

        double weight1b99 = num3 * 0.65;
        double c99 = Math.round(weight1b99 / 10) * 10;

        if (weight1b99 < c99 && c99 <= (weight1b99 + 5)) {
            if ((c99 - 1.25) <= weight1b99) {
                System.out.println("9.Set 스쿼트 " + c99 + "kg(권장 Reps 1회 이상)");
            }
            if ((c99 - 3.75) <= weight1b99 && weight1b99 < (c99 - 1.25)) {
                System.out.println("9.Set 스쿼트 " + (c99 - 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((c99 - 5) <= weight1b99 && weight1b99 < -3.75) {
                System.out.println("9.Set 스쿼트 " + (c99 - 5) + "kg(권장 Reps 1회 이상)");
            }
        } else {
            if (weight1b99 < (c99 + 1.25)) {
                System.out.println("9.Set 스쿼트 " + c99 + "kg(권장 Reps 1회 이상)");
            }
            if ((c99 + 1.25) <= weight1b99 && weight1b99 < (c99 + 3.75)) {
                System.out.println("9.Set 스쿼트 " + (c99 + 2.5) + "kg(권장 Reps 1회 이상)");
            }
            if ((c99 + 3.75) <= weight1b99 && weight1b99 < (c99 + 5)) {
                System.out.println("9.Set 스쿼트 " + (c99 + 5) + "kg(권장 Reps 1회 이상)");
            }
        }

        System.out.println("몇 Reps 수행하셨습니까?");

        int asista3a = random.nextInt(4);

        double reps2a9 = scanner.nextDouble();

        if (reps2a3 >= 11) {
            num3 = (num3 + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps2a3 >= 8 && reps2a3 < 11) {
            num3 = (num3 + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps2a3 >= 5 && reps2a3 < 8) {
            num3 = (num3 + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps2a3 >= 2 && reps2a3 < 5) {
            num3 = (num3 + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps2a3 < 2) {
            num3 = (num3);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asista3a == 0) {
            System.out.println("마무리 보조운동 추천!!!! 레그 익스텐션 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista3a == 1) {
            System.out.println("마무리 보조운동 추천!!!! 레그 프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista3a == 2) {
            System.out.println("마무리 보조운동 추천!!!! 레그 컬 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asista == 3) {
            System.out.println("마무리 보조운동 추천!!!! 핵 스쿼트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

    }
}
