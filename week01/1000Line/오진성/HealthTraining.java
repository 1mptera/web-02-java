import java.util.Random;
import java.util.Scanner;

public class HealthTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //프로그램 시작
        System.out.println("헬스 2주차 벌크업 + 3대 증량 프로그램입니다");
        System.out.println("시작하시려면 Yes 나약한자들은 No를 적어주세요!");

        String answer1 = scanner.nextLine().toUpperCase();

        if (!answer1.equals("YES")) {
            System.out.println("Goodbye");
            return;
        }

        //1rm 기입!
        System.out.println("삼대 운동 1rm을 입력하시오.");
        System.out.print("벤치프레스(kg): ");

        double benchpress1rm = scanner.nextDouble();

        System.out.print("데드리프트(kg): ");

        double deadlift1rm = scanner.nextDouble();

        System.out.print("스쿼트(kg): ");

        double squt1rm = scanner.nextDouble();

        //나이와 키,몸무게,성별 기입!
        System.out.println("나이와 키,몸무게,성별를 입력하시오.");
        System.out.print("나이(세): ");

        double age = scanner.nextDouble();

        System.out.print("키(cm): ");

        double height = scanner.nextDouble();

        System.out.print("몸무게(kg): ");

        double bodyweight = scanner.nextDouble();

        System.out.print("성별(남성,여성): ");

        String gender = scanner.next();

        //생활습관 체크!
        System.out.println("평소의 생활습관을 고르시오!");
        System.out.println("1. 좌식 업무");
        System.out.println("2. 돌아다니는 업무");
        System.out.println("3. 활동적인 업무");

        double lifestyle = scanner.nextDouble();

        //(좌식 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (lifestyle == 1) {
            double calorie = ((66 + 13.8 * bodyweight + 5 * height - 6.8 * age) * 1.5 + 500);
            double carbohidratoamount = ((655 + 9.6 * bodyweight + 1.8 * height - 4.7 * age) * 1.5 + 300);
            double fatamount = calorie * 0.2 / 9;
            double proteinamount = bodyweight * 2;

            if (gender.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie + "칼로리");
                System.out.println("탄수화물량: " + (calorie - fatamount - proteinamount) / 4 + "g");
                System.out.println("단백질량: " + proteinamount / 4 + "g");
                System.out.println("지방량: " + fatamount / 9 + "g");
            }


            //여성일때:
            if (gender.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + carbohidratoamount + "칼로리");
                System.out.println("탄수화물량: " + (carbohidratoamount - fatamount - proteinamount) + "g");
                System.out.println("단백질량: " + proteinamount / 4 + "g");
                System.out.println("지방량: " + fatamount / 9 + "g");
            }
        }

        //(돌아다니는 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (lifestyle == 2) {
            double calorie = ((66 + 13.8 * bodyweight + 5 * height - 6.8 * age) * 1.75 + 500);
            double carbohidratoamount = ((655 + 9.6 * bodyweight + 1.8 * height - 4.7 * age) * 1.75 + 300);
            double fatamount = calorie * 0.2 / 9;
            double proteinamount = bodyweight * 2;

            if (gender.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie + "칼로리");
                System.out.println("탄수화물량: " + (calorie - fatamount - proteinamount) / 4 + "g");
                System.out.println("단백질량: " + proteinamount / 4 + "g");
                System.out.println("지방량: " + fatamount + "g");
            }


            //여성일때:
            if (gender.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + carbohidratoamount + "칼로리");
                System.out.println("탄수화물량: " + (carbohidratoamount - fatamount - proteinamount) + "g");
                System.out.println("단백질량: " + proteinamount / 4 + "g");
                System.out.println("지방량: " + fatamount + "g");
            }
        }

        //(활동적인 업무)칼로리와 탄단지 계산!
        //남성일때:
        if (lifestyle == 3) {
            double calorie = ((66 + 13.8 * bodyweight + 5 * height - 6.8 * age) * 2 + 500);
            double carbohidratoamount = ((655 + 9.6 * bodyweight + 1.8 * height - 4.7 * age) * 2 + 300);
            double fatamount = calorie * 0.2 / 9;
            double proteinamount = bodyweight * 2;

            if (gender.equals("남성")) {
                System.out.println("하루 먹어야할 칼로리량: " + calorie + "칼로리");
                System.out.println("탄수화물량: " + (calorie - fatamount - proteinamount) / 4 + "g");
                System.out.println("단백질량: " + proteinamount / 4 + "g");
                System.out.println("지방량: " + fatamount + "g");
            }


            //여성일때:
            if (gender.equals("여성")) {
                System.out.println("하루 먹어야할 칼로리량: " + carbohidratoamount + "칼로리");
                System.out.println("탄수화물량: " + (carbohidratoamount - fatamount - proteinamount) + "g");
                System.out.println("단백질량: " + proteinamount / 4 + "g");
                System.out.println("지방량: " + fatamount + "g");
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

        double benchpressweight1 = benchpress1rm * 0.75;
        double benchpressroundoff1 = Math.round(benchpressweight1 / 10) * 10;
        double standardWeight = 2.5;

        if (benchpressweight1 != standardWeight - 1) {

        }

        if (benchpressweight1 < benchpressroundoff1 && benchpressroundoff1 <= (benchpressweight1 + 5)) {
            if ((benchpressroundoff1 - 1.25) <= benchpressweight1) {
                System.out.println("1.Set 벤치프레스 " + benchpressroundoff1 + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff1 - 3.75) <= benchpressweight1 && benchpressweight1 < (benchpressroundoff1 - 1.25)) {
                System.out.println("1.Set 벤치프레스 " + (benchpressroundoff1 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff1 - 5) <= benchpressweight1 && benchpressweight1 < (benchpressroundoff1 - 3.75)) {
                System.out.println("1.Set 벤치프레스 " + (benchpressroundoff1 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (benchpressweight1 >= benchpressroundoff1 && benchpressroundoff1 > (benchpressweight1 - 5)) {
            if (benchpressweight1 < (benchpressroundoff1 + 1.25)) {
                System.out.println("1.Set 벤치프레스 " + benchpressroundoff1 + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff1 + 1.25) <= benchpressweight1 && benchpressweight1 < (benchpressroundoff1 + 3.75)) {
                System.out.println("1.Set 벤치프레스 " + (benchpressroundoff1 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff1 + 3.75) <= benchpressweight1 && benchpressweight1 < (benchpressroundoff1 + 5)) {
                System.out.println("1.Set 벤치프레스 " + (benchpressroundoff1 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21 = scanner.nextDouble();

        double benchpressweight2 = benchpress1rm * 0.85;
        double benchpressroundoff2 = Math.round(benchpressweight2 / 10) * 10;

        if (benchpressweight2 < benchpressroundoff2 && benchpressroundoff2 <= (benchpressweight2 + 5)) {
            if ((benchpressroundoff2 - 1.25) <= benchpressweight2) {
                System.out.println("2.Set 벤치프레스 " + benchpressroundoff2 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff2 - 3.75) <= benchpressweight2 && benchpressweight2 < (benchpressroundoff2 - 1.25)) {
                System.out.println("2.Set 벤치프레스 " + (benchpressroundoff2 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff2 - 5) <= benchpressweight2 && benchpressweight2 < (benchpressroundoff2 - 3.75)) {
                System.out.println("2.Set 벤치프레스 " + (benchpressroundoff2 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight2 >= benchpressroundoff2 && benchpressroundoff2 > (benchpressweight2 - 5)) {
            if (benchpressweight2 < (benchpressroundoff2 + 1.25)) {
                System.out.println("2.Set 벤치프레스 " + benchpressroundoff2 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff2 + 1.25) <= benchpressweight2 && benchpressweight2 < (benchpressroundoff2 + 3.75)) {
                System.out.println("2.Set 벤치프레스 " + (benchpressroundoff2 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff2 + 3.75) <= benchpressweight2 && benchpressweight2 < (benchpressroundoff2 + 5)) {
                System.out.println("2.Set 벤치프레스 " + (benchpressroundoff2 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22 = scanner.nextDouble();

        double benchpressweight3 = benchpress1rm * 0.95;
        double benchpressroundoff3 = Math.round(benchpressweight3 / 10) * 10;

        if (benchpressweight3 < benchpressroundoff3 && benchpressroundoff3 <= (benchpressweight3 + 5)) {
            if ((benchpressroundoff3 - 1.25) <= benchpressweight3) {
                System.out.println("3.Set 벤치프레스 " + benchpressroundoff3 + "kg(권장 Reps2 1회)");
            }
            if ((benchpressroundoff3 - 3.75) <= benchpressweight3 && benchpressweight3 < (benchpressroundoff3 - 1.25)) {
                System.out.println("3.Set 벤치프레스 " + (benchpressroundoff3 - 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((benchpressroundoff3 - 5) <= benchpressweight3 && benchpressweight3 < (benchpressroundoff3 - 3.75)) {
                System.out.println("3.Set 벤치프레스 " + (benchpressroundoff3 - 5) + "kg(권장 Reps2 1회)");
            }
        }
        if (benchpressweight3 >= benchpressroundoff3 && benchpressroundoff3 > (benchpressweight3 - 5)) {
            if (benchpressweight3 < (benchpressroundoff3 + 1.25)) {
                System.out.println("3.Set 벤치프레스 " + benchpressroundoff3 + "kg(권장 Reps2 1회)");
            }
            if ((benchpressroundoff3 + 1.25) <= benchpressweight3 && benchpressweight3 < (benchpressroundoff3 + 3.75)) {
                System.out.println("3.Set 벤치프레스 " + (benchpressroundoff3 + 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((benchpressroundoff3 + 3.75) <= benchpressweight3 && benchpressweight3 < (benchpressroundoff3 + 5)) {
                System.out.println("3.Set 벤치프레스 " + (benchpressroundoff3 + 5) + "kg(권장 Reps2 1회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps23 = scanner.nextDouble();

        double benchpressweight4 = benchpress1rm * 0.90;
        double benchpressroundoff4 = Math.round(benchpressweight4 / 10) * 10;

        if (benchpressweight4 < benchpressroundoff4 && benchpressroundoff4 <= (benchpressweight4 + 5)) {
            if ((benchpressroundoff4 - 1.25) <= benchpressweight4) {
                System.out.println("4.Set 벤치프레스 " + benchpressroundoff4 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff4 - 3.75) <= benchpressweight4 && benchpressweight4 < (benchpressroundoff4 - 1.25)) {
                System.out.println("4.Set 벤치프레스 " + (benchpressroundoff4 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff4 - 5) <= benchpressweight4 && benchpressweight4 < (benchpressroundoff4 - 3.75)) {
                System.out.println("4.Set 벤치프레스 " + (benchpressroundoff4 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight4 >= benchpressroundoff4 && benchpressroundoff4 > (benchpressweight4 - 5)) {
            if (benchpressweight4 < (benchpressroundoff4 + 1.25)) {
                System.out.println("4.Set 벤치프레스 " + benchpressroundoff4 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff4 + 1.25) <= benchpressweight4 && benchpressweight4 < (benchpressroundoff4 + 3.75)) {
                System.out.println("4.Set 벤치프레스 " + (benchpressroundoff4 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff4 + 3.75) <= benchpressweight4 && benchpressweight4 < (benchpressroundoff4 + 5)) {
                System.out.println("4.Set 벤치프레스 " + (benchpressroundoff4 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps24 = scanner.nextDouble();

        double benchpressweight5 = benchpress1rm * 0.85;
        double benchpressroundoff5 = Math.round(benchpressweight5 / 10) * 10;

        if (benchpressweight5 < benchpressroundoff5 && benchpressroundoff5 <= (benchpressweight5 + 5)) {
            if ((benchpressroundoff5 - 1.25) <= benchpressweight5) {
                System.out.println("5.Set 벤치프레스 " + benchpressroundoff5 + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff5 - 3.75) <= benchpressweight5 && benchpressweight5 < (benchpressroundoff5 - 1.25)) {
                System.out.println("5.Set 벤치프레스 " + (benchpressroundoff5 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff5 - 5) <= benchpressweight5 && benchpressweight5 < (benchpressroundoff5 - 3.75)) {
                System.out.println("5.Set 벤치프레스 " + (benchpressroundoff5 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (benchpressweight5 >= benchpressroundoff5 && benchpressroundoff5 > (benchpressweight5 - 5)) {
            if (benchpressweight5 < (benchpressroundoff5 + 1.25)) {
                System.out.println("5.Set 벤치프레스 " + benchpressroundoff5 + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff5 + 1.25) <= benchpressweight5 && benchpressweight5 < (benchpressroundoff5 + 3.75)) {
                System.out.println("5.Set 벤치프레스 " + (benchpressroundoff5 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff5 + 3.75) <= benchpressweight5 && benchpressweight5 < (benchpressroundoff5 + 5)) {
                System.out.println("5.Set 벤치프레스 " + (benchpressroundoff5 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps25 = scanner.nextDouble();

        double benchpressweight6 = benchpress1rm * 0.80;
        double benchpressroundoff6 = Math.round(benchpressweight6 / 10) * 10;

        if (benchpressweight6 < benchpressroundoff6 && benchpressroundoff6 <= (benchpressweight6 + 5)) {
            if ((benchpressroundoff6 - 1.25) <= benchpressweight6) {
                System.out.println("6.Set 벤치프레스 " + benchpressroundoff6 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff6 - 3.75) <= benchpressweight6 && benchpressweight6 < (benchpressroundoff6 - 1.25)) {
                System.out.println("6.Set 벤치프레스 " + (benchpressroundoff6 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff6 - 5) <= benchpressweight6 && benchpressweight6 < (benchpressroundoff6 - 3.75)) {
                System.out.println("6.Set 벤치프레스 " + (benchpressroundoff6 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight6 >= benchpressroundoff6 && benchpressroundoff6 > (benchpressweight6 - 5)) {
            if (benchpressweight6 < (benchpressroundoff6 + 1.25)) {
                System.out.println("6.Set 벤치프레스 " + benchpressroundoff6 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff6 + 1.25) <= benchpressweight6 && benchpressweight6 < (benchpressroundoff6 + 3.75)) {
                System.out.println("6.Set 벤치프레스 " + (benchpressroundoff6 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff6 + 3.75) <= benchpressweight6 && benchpressweight6 < (benchpressroundoff6 + 5)) {
                System.out.println("6.Set 벤치프레스 " + (benchpressroundoff6 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps26 = scanner.nextDouble();

        double benchpressweight7 = benchpress1rm * 0.75;
        double benchpressroundoff7 = Math.round(benchpressweight7 / 10) * 10;

        if (benchpressweight7 < benchpressroundoff7 && benchpressroundoff7 <= (benchpressweight7 + 5)) {
            if ((benchpressroundoff7 - 1.25) <= benchpressweight7) {
                System.out.println("7.Set 벤치프레스 " + benchpressroundoff7 + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff7 - 3.75) <= benchpressweight7 && benchpressweight7 < (benchpressroundoff7 - 1.25)) {
                System.out.println("7.Set 벤치프레스 " + (benchpressroundoff7 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff7 - 5) <= benchpressweight7 && benchpressweight7 < (benchpressroundoff7 - 3.75)) {
                System.out.println("7.Set 벤치프레스 " + (benchpressroundoff7 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (benchpressweight7 >= benchpressroundoff7 && benchpressroundoff7 > (benchpressweight7 - 5)) {
            if (benchpressweight7 < (benchpressroundoff7 + 1.25)) {
                System.out.println("7.Set 벤치프레스 " + benchpressroundoff7 + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff7 + 1.25) <= benchpressweight7 && benchpressweight7 < (benchpressroundoff7 + 3.75)) {
                System.out.println("7.Set 벤치프레스 " + (benchpressroundoff7 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchpressroundoff7 + 3.75) <= benchpressweight7 && benchpressweight7 < (benchpressroundoff7 + 5)) {
                System.out.println("7.Set 벤치프레스 " + (benchpressroundoff7 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps27 = scanner.nextDouble();

        double benchpressweight8 = benchpress1rm * 0.70;
        double benchpressroundoff8 = Math.round(benchpressweight8 / 10) * 10;

        if (benchpressweight8 < benchpressroundoff8 && benchpressroundoff8 <= (benchpressweight8 + 5)) {
            if ((benchpressroundoff8 - 1.25) <= benchpressweight8) {
                System.out.println("8.Set 벤치프레스 " + benchpressroundoff8 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff8 - 3.75) <= benchpressweight8 && benchpressweight8 < (benchpressroundoff8 - 1.25)) {
                System.out.println("8.Set 벤치프레스 " + (benchpressroundoff8 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff8 - 5) <= benchpressweight8 && benchpressweight8 < (benchpressroundoff8 - 3.75)) {
                System.out.println("8.Set 벤치프레스 " + (benchpressroundoff8 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight8 >= benchpressroundoff8 && benchpressroundoff8 > (benchpressweight8 - 5)) {
            if (benchpressweight8 < (benchpressroundoff8 + 1.25)) {
                System.out.println("8.Set 벤치프레스 " + benchpressroundoff8 + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff8 + 1.25) <= benchpressweight8 && benchpressweight8 < (benchpressroundoff8 + 3.75)) {
                System.out.println("8.Set 벤치프레스 " + (benchpressroundoff8 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchpressroundoff8 + 3.75) <= benchpressweight8 && benchpressweight8 < (benchpressroundoff8 + 5)) {
                System.out.println("8.Set 벤치프레스 " + (benchpressroundoff8 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps28 = scanner.nextDouble();

        double benchpressweight9 = benchpress1rm * 0.65;
        double benchpressroundoff9 = Math.round(benchpressweight9 / 10) * 10;

        if (benchpressweight9 < benchpressroundoff9 && benchpressroundoff9 <= (benchpressweight9 + 5)) {
            if ((benchpressroundoff9 - 1.25) <= benchpressweight9) {
                System.out.println("9.Set 벤치프레스 " + benchpressroundoff9 + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchpressroundoff9 - 3.75) <= benchpressweight9 && benchpressweight9 < (benchpressroundoff9 - 1.25)) {
                System.out.println("9.Set 벤치프레스 " + (benchpressroundoff9 - 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchpressroundoff9 - 5) <= benchpressweight9 && benchpressweight9 < (benchpressroundoff9 - 3.75)) {
                System.out.println("9.Set 벤치프레스 " + (benchpressroundoff9 - 5) + "kg(권장 Reps2 1회 이상)");
            }
        }
        if (benchpressweight9 >= benchpressroundoff9 && benchpressroundoff9 > (benchpressweight9 - 5)) {
            if (benchpressweight9 < (benchpressroundoff9 + 1.25)) {
                System.out.println("9.Set 벤치프레스 " + benchpressroundoff9 + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchpressroundoff9 + 1.25) <= benchpressweight9 && benchpressweight9 < (benchpressroundoff9 + 3.75)) {
                System.out.println("9.Set 벤치프레스 " + (benchpressroundoff9 + 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchpressroundoff9 + 3.75) <= benchpressweight9 && benchpressweight9 < (benchpressroundoff9 + 5)) {
                System.out.println("9.Set 벤치프레스 " + (benchpressroundoff9 + 5) + "kg(권장 Reps2 1회 이상)");
            }
        }

        System.out.println("몇 Reps2 수행하셨습니까?");

        int asistworkout = random.nextInt(4);

        double reps29 = scanner.nextDouble();

        if (reps23 >= 11) {
            benchpress1rm = (benchpress1rm + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps23 >= 8 && reps23 < 11) {
            benchpress1rm = (benchpress1rm + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps23 >= 5 && reps23 < 8) {
            benchpress1rm = (benchpress1rm + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps23 >= 2 && reps23 < 5) {
            benchpress1rm = (benchpress1rm + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps23 < 2) {
            benchpress1rm = (benchpress1rm);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asistworkout == 0) {
            System.out.println("마무리 보조운동 추천!!!! 인클라인 덤벨프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout == 1) {
            System.out.println("마무리 보조운동 추천!!!! 딥스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout == 2) {
            System.out.println("마무리 보조운동 추천!!!! 클로즈그립 데드리프트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout == 3) {
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

        double deadliftweight1 = deadlift1rm * 0.75;
        double deadliftroundoff1 = Math.round(deadliftweight1 / 10) * 10;

        if (deadliftweight1 < deadliftroundoff1 && deadliftroundoff1 <= (deadliftweight1 + 5)) {
            if ((deadliftroundoff1 - 1.25) <= deadliftweight1) {
                System.out.println("1.Set 데드리프트 " + deadliftroundoff1 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff1 - 3.75) <= deadliftweight1 && deadliftweight1 < (deadliftroundoff1 - 1.25)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff1 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff1 - 5) <= deadliftweight1 && deadliftweight1 < (deadliftroundoff1 - 3.75)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff1 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (deadliftweight1 >= deadliftroundoff1 && deadliftroundoff1 > (deadliftweight1 - 5)) {
            if (deadliftweight1 < (deadliftroundoff1 + 1.25)) {
                System.out.println("1.Set 데드리프트 " + deadliftroundoff1 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff1 + 1.25) <= deadliftweight1 && deadliftweight1 < (deadliftroundoff1 + 3.75)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff1 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff1 + 3.75) <= deadliftweight1 && deadliftweight1 < (deadliftroundoff1 + 5)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff1 + 5) + "kg(권장 Reps2 5회)");
            }
        }


        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps211 = scanner.nextDouble();

        double deadliftweight2 = deadlift1rm * 0.85;
        double deadliftroundoff2 = Math.round(deadliftweight2 / 10) * 10;

        if (deadliftweight2 < deadliftroundoff2 && deadliftroundoff2 <= (deadliftweight2 + 5)) {
            if ((deadliftroundoff2 - 1.25) <= deadliftweight2) {
                System.out.println("2.Set 데드리프트 " + deadliftroundoff2 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff2 - 3.75) <= deadliftweight2 && deadliftweight2 < (deadliftroundoff2 - 1.25)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff2 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff2 - 5) <= deadliftweight2 && deadliftweight2 < (deadliftroundoff2 - 3.75)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff2 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight2 >= deadliftroundoff2 && deadliftroundoff2 > (deadliftweight2 - 5)) {
            if (deadliftweight2 < (deadliftroundoff2 + 1.25)) {
                System.out.println("2.Set 데드리프트 " + deadliftroundoff2 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff2 + 1.25) <= deadliftweight2 && deadliftweight2 < (deadliftroundoff2 + 3.75)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff2 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff2 + 3.75) <= deadliftweight2 && deadliftweight2 < (deadliftroundoff2 + 5)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff2 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps212 = scanner.nextDouble();

        double deadliftweight3 = deadlift1rm * 0.95;
        double deadliftroundoff3 = Math.round(deadliftweight3 / 10) * 10;

        if (deadliftweight3 < deadliftroundoff3 && deadliftroundoff3 <= (deadliftweight3 + 5)) {
            if ((deadliftroundoff3 - 1.25) <= deadliftweight3) {
                System.out.println("3.Set 데드리프트 " + deadliftroundoff3 + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff3 - 3.75) <= deadliftweight3 && deadliftweight3 < (deadliftroundoff3 - 1.25)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff3 - 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff3 - 5) <= deadliftweight3 && deadliftweight3 < (deadliftroundoff3 - 3.75)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff3 - 5) + "kg(권장 Reps2 1회)");
            }
        }
        if (deadliftweight3 >= deadliftroundoff3 && deadliftroundoff3 > (deadliftweight3 - 5)) {
            if (deadliftweight3 < (deadliftroundoff3 + 1.25)) {
                System.out.println("3.Set 데드리프트 " + deadliftroundoff3 + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff3 + 1.25) <= deadliftweight3 && deadliftweight3 < (deadliftroundoff3 + 3.75)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff3 + 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff3 + 3.75) <= deadliftweight3 && deadliftweight3 < (deadliftroundoff3 + 5)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff3 + 5) + "kg(권장 Reps2 1회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps213 = scanner.nextDouble();

        double deadliftweight4 = deadlift1rm * 0.90;
        double deadliftroundoff4 = Math.round(deadliftweight4 / 10) * 10;

        if (deadliftweight4 < deadliftroundoff4 && deadliftroundoff4 <= (deadliftweight4 + 5)) {
            if ((deadliftroundoff4 - 1.25) <= deadliftweight4) {
                System.out.println("4.Set 데드리프트 " + deadliftroundoff4 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff4 - 3.75) <= deadliftweight4 && deadliftweight4 < (deadliftroundoff4 - 1.25)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff4 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff4 - 5) <= deadliftweight4 && deadliftweight4 < (deadliftroundoff4 - 3.75)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff4 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight4 >= deadliftroundoff4 && deadliftroundoff4 > (deadliftweight4 - 5)) {
            if (deadliftweight4 < (deadliftroundoff4 + 1.25)) {
                System.out.println("4.Set 데드리프트 " + deadliftroundoff4 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff4 + 1.25) <= deadliftweight4 && deadliftweight4 < (deadliftroundoff4 + 3.75)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff4 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff4 + 3.75) <= deadliftweight4 && deadliftweight4 < (deadliftroundoff4 + 5)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff4 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps214 = scanner.nextDouble();

        double deadliftweight5 = deadlift1rm * 0.85;
        double deadliftroundoff5 = Math.round(deadliftweight5 / 10) * 10;

        if (deadliftweight5 < deadliftroundoff5 && deadliftroundoff5 <= (deadliftweight5 + 5)) {
            if ((deadliftroundoff5 - 1.25) <= deadliftweight5) {
                System.out.println("5.Set 데드리프트 " + deadliftroundoff5 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff5 - 3.75) <= deadliftweight5 && deadliftweight5 < (deadliftroundoff5 - 1.25)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff5 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff5 - 5) <= deadliftweight5 && deadliftweight5 < (deadliftroundoff5 - 3.75)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff5 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (deadliftweight5 >= deadliftroundoff5 && deadliftroundoff5 > (deadliftweight5 - 5)) {
            if (deadliftweight5 < (deadliftroundoff5 + 1.25)) {
                System.out.println("5.Set 데드리프트 " + deadliftroundoff5 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff5 + 1.25) <= deadliftweight5 && deadliftweight5 < (deadliftroundoff5 + 3.75)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff5 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff5 + 3.75) <= deadliftweight5 && deadliftweight5 < (deadliftroundoff5 + 5)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff5 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps215 = scanner.nextDouble();

        double deadliftweight6 = deadlift1rm * 0.80;
        double deadliftroundoff6 = Math.round(deadliftweight6 / 10) * 10;

        if (deadliftweight6 < deadliftroundoff6 && deadliftroundoff6 <= (deadliftweight6 + 5)) {
            if ((deadliftroundoff6 - 1.25) <= deadliftweight6) {
                System.out.println("6.Set 데드리프트 " + deadliftroundoff6 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff6 - 3.75) <= deadliftweight6 && deadliftweight6 < (deadliftroundoff6 - 1.25)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff6 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff6 - 5) <= deadliftweight6 && deadliftweight6 < (deadliftroundoff6 - 3.75)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff6 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight6 >= deadliftroundoff6 && deadliftroundoff6 > (deadliftweight6 - 5)) {
            if (deadliftweight6 < (deadliftroundoff6 + 1.25)) {
                System.out.println("6.Set 데드리프트 " + deadliftroundoff6 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff6 + 1.25) <= deadliftweight6 && deadliftweight6 < (deadliftroundoff6 + 3.75)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff6 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff6 + 3.75) <= deadliftweight6 && deadliftweight6 < (deadliftroundoff6 + 5)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff6 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps216 = scanner.nextDouble();

        double deadliftweight7 = deadlift1rm * 0.75;
        double deadliftroundoff7 = Math.round(deadliftweight7 / 10) * 10;

        if (deadliftweight7 < deadliftroundoff7 && deadliftroundoff7 <= (deadliftweight7 + 5)) {
            if ((deadliftroundoff7 - 1.25) <= deadliftweight7) {
                System.out.println("7.Set 데드리프트 " + deadliftroundoff7 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff7 - 3.75) <= deadliftweight7 && deadliftweight7 < (deadliftroundoff7 - 1.25)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff7 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff7 - 5) <= deadliftweight7 && deadliftweight7 < (deadliftroundoff7 - 3.75)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff7 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (deadliftweight7 >= deadliftroundoff7 && deadliftroundoff7 > (deadliftweight7 - 5)) {
            if (deadliftweight7 < (deadliftroundoff7 + 1.25)) {
                System.out.println("7.Set 데드리프트 " + deadliftroundoff7 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff7 + 1.25) <= deadliftweight7 && deadliftweight7 < (deadliftroundoff7 + 3.75)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff7 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff7 + 3.75) <= deadliftweight7 && deadliftweight7 < (deadliftroundoff7 + 5)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff7 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps217 = scanner.nextDouble();

        double deadliftweight8 = deadlift1rm * 0.70;
        double deadliftroundoff8 = Math.round(deadliftweight8 / 10) * 10;

        if (deadliftweight8 < deadliftroundoff8 && deadliftroundoff8 <= (deadliftweight8 + 5)) {
            if ((deadliftroundoff8 - 1.25) <= deadliftweight8) {
                System.out.println("8.Set 데드리프트 " + deadliftroundoff8 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff8 - 3.75) <= deadliftweight8 && deadliftweight8 < (deadliftroundoff8 - 1.25)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff8 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff8 - 5) <= deadliftweight8 && deadliftweight8 < (deadliftroundoff8 - 3.75)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff8 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight8 >= deadliftroundoff8 && deadliftroundoff8 > (deadliftweight8 - 5)) {
            if (deadliftweight8 < (deadliftroundoff8 + 1.25)) {
                System.out.println("8.Set 데드리프트 " + deadliftroundoff8 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff8 + 1.25) <= deadliftweight8 && deadliftweight8 < (deadliftroundoff8 + 3.75)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff8 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff8 + 3.75) <= deadliftweight8 && deadliftweight8 < (deadliftroundoff8 + 5)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff8 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps218 = scanner.nextDouble();

        double deadliftweight9 = deadlift1rm * 0.65;
        double deadliftroundoff9 = Math.round(deadliftweight9 / 10) * 10;

        if (deadliftweight9 < deadliftroundoff9 && deadliftroundoff9 <= (deadliftweight9 + 5)) {
            if ((deadliftroundoff9 - 1.25) <= deadliftweight9) {
                System.out.println("9.Set 데드리프트 " + deadliftroundoff9 + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff9 - 3.75) <= deadliftweight9 && deadliftweight9 < (deadliftroundoff9 - 1.25)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff9 - 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff9 - 5) <= deadliftweight9 && deadliftweight9 < (deadliftroundoff9 - 3.75)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff9 - 5) + "kg(권장 Reps2 1회 이상)");
            }
        }
        if (deadliftweight9 >= deadliftroundoff9 && deadliftroundoff9 > (deadliftweight9 - 5)) {
            if (deadliftweight9 < (deadliftroundoff9 + 1.25)) {
                System.out.println("9.Set 데드리프트 " + deadliftroundoff9 + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff9 + 1.25) <= deadliftweight9 && deadliftweight9 < (deadliftroundoff9 + 3.75)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff9 + 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff9 + 3.75) <= deadliftweight9 && deadliftweight9 < (deadliftroundoff9 + 5)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff9 + 5) + "kg(권장 Reps2 1회 이상)");
            }
        }

        System.out.println("몇 Reps2 수행하셨습니까?");

        int asistworkout2 = random.nextInt(4);

        double reps219 = scanner.nextDouble();

        if (reps213 >= 11) {
            deadlift1rm = (deadlift1rm + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps213 >= 8 && reps213 < 11) {
            deadlift1rm = (deadlift1rm + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps213 >= 5 && reps213 < 8) {
            deadlift1rm = (deadlift1rm + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps213 >= 2 && reps213 < 5) {
            deadlift1rm = (deadlift1rm + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps213 < 2) {
            deadlift1rm = (deadlift1rm);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asistworkout2 == 0) {
            System.out.println("마무리 보조운동 추천!!!! 랫풀 다운 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout2 == 1) {
            System.out.println("마무리 보조운동 추천!!!! 바벨 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout2 == 2) {
            System.out.println("마무리 보조운동 추천!!!! 케이블 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout2 == 3) {
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

        double squtweight1 = squt1rm * 0.75;
        double squtroundoff1 = Math.round(squtweight1 / 10) * 10;

        if (squtweight1 < squtroundoff1 && squtroundoff1 <= (squtweight1 + 5)) {
            if ((squtroundoff1 - 1.25) <= squtweight1) {
                System.out.println("1.Set 스쿼트 " + squtroundoff1 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff1 - 3.75) <= squtweight1 && squtweight1 < (squtroundoff1 - 1.25)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff1 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff1 - 5) <= squtweight1 && squtweight1 < (squtroundoff1 - 3.75)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff1 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (squtweight1 >= squtroundoff1 && squtroundoff1 > (squtweight1 - 5)) {
            if (squtweight1 < (squtroundoff1 + 1.25)) {
                System.out.println("1.Set 스쿼트 " + squtroundoff1 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff1 + 1.25) <= squtweight1 && squtweight1 < (squtroundoff1 + 3.75)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff1 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff1 + 3.75) <= squtweight1 && squtweight1 < (squtroundoff1 + 5)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff1 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps221 = scanner.nextDouble();

        double squtweight2 = squt1rm * 0.85;
        double squtroundoff2 = Math.round(squtweight2 / 10) * 10;

        if (squtweight2 < squtroundoff2 && squtroundoff2 <= (squtweight2 + 5)) {
            if ((squtroundoff2 - 1.25) <= squtweight2) {
                System.out.println("2.Set 스쿼트 " + squtroundoff2 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff2 - 3.75) <= squtweight2 && squtweight2 < (squtroundoff2 - 1.25)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff2 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff2 - 5) <= squtweight2 && squtweight2 < (squtroundoff2 - 3.75)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff2 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight2 >= squtroundoff2 && squtroundoff2 > (squtweight2 - 5)) {
            if (squtweight2 < (squtroundoff2 + 1.25)) {
                System.out.println("2.Set 스쿼트 " + squtroundoff2 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff2 + 1.25) <= squtweight2 && squtweight2 < (squtroundoff2 + 3.75)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff2 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff2 + 3.75) <= squtweight2 && squtweight2 < (squtroundoff2 + 5)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff2 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps222 = scanner.nextDouble();

        double squtweight3 = squt1rm * 0.95;
        double squtroundoff3 = Math.round(squtweight3 / 10) * 10;

        if (squtweight3 < squtroundoff3 && squtroundoff3 <= (squtweight3 + 5)) {
            if ((squtroundoff3 - 1.25) <= squtweight3) {
                System.out.println("3.Set 스쿼트 " + squtroundoff3 + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff3 - 3.75) <= squtweight3 && squtweight3 < (squtroundoff3 - 1.25)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff3 - 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff3 - 5) <= squtweight3 && squtweight3 < (squtroundoff3 - 3.75)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff3 - 5) + "kg(권장 Reps2 1회)");
            }
        }
        if (squtweight3 >= squtroundoff3 && squtroundoff3 > (squtweight3 - 5)) {
            if (squtweight3 < (squtroundoff3 + 1.25)) {
                System.out.println("3.Set 스쿼트 " + squtroundoff3 + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff3 + 1.25) <= squtweight3 && squtweight3 < (squtroundoff3 + 3.75)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff3 + 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff3 + 3.75) <= squtweight3 && squtweight3 < (squtroundoff3 + 5)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff3 + 5) + "kg(권장 Reps2 1회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps223 = scanner.nextDouble();

        double squtweight4 = squt1rm * 0.90;
        double squtroundoff4 = Math.round(squtweight4 / 10) * 10;

        if (squtweight4 < squtroundoff4 && squtroundoff4 <= (squtweight4 + 5)) {
            if ((squtroundoff4 - 1.25) <= squtweight4) {
                System.out.println("4.Set 스쿼트 " + squtroundoff4 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff4 - 3.75) <= squtweight4 && squtweight4 < (squtroundoff4 - 1.25)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff4 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff4 - 5) <= squtweight4 && squtweight4 < (squtroundoff4 - 3.75)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff4 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight4 >= squtroundoff4 && squtroundoff4 > (squtweight4 - 5)) {
            if (squtweight4 < (squtroundoff4 + 1.25)) {
                System.out.println("4.Set 스쿼트 " + squtroundoff4 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff4 + 1.25) <= squtweight4 && squtweight4 < (squtroundoff4 + 3.75)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff4 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff4 + 3.75) <= squtweight4 && squtweight4 < (squtroundoff4 + 5)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff4 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps224 = scanner.nextDouble();

        double squtweight5 = squt1rm * 0.85;
        double squtroundoff5 = Math.round(squtweight5 / 10) * 10;

        if (squtweight5 < squtroundoff5 && squtroundoff5 <= (squtweight5 + 5)) {
            if ((squtroundoff5 - 1.25) <= squtweight5) {
                System.out.println("5.Set 스쿼트 " + squtroundoff5 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff5 - 3.75) <= squtweight5 && squtweight5 < (squtroundoff5 - 1.25)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff5 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff5 - 5) <= squtweight5 && squtweight5 < (squtroundoff5 - 3.75)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff5 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (squtweight5 >= squtroundoff5 && squtroundoff5 > (squtweight5 - 5)) {
            if (squtweight5 < (squtroundoff5 + 1.25)) {
                System.out.println("5.Set 스쿼트 " + squtroundoff5 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff5 + 1.25) <= squtweight5 && squtweight5 < (squtroundoff5 + 3.75)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff5 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff5 + 3.75) <= squtweight5 && squtweight5 < (squtroundoff5 + 5)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff5 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps225 = scanner.nextDouble();

        double squtweight6 = squt1rm * 0.80;
        double squtroundoff6 = Math.round(squtweight6 / 10) * 10;

        if (squtweight6 < squtroundoff6 && squtroundoff6 <= (squtweight6 + 5)) {
            if ((squtroundoff6 - 1.25) <= squtweight6) {
                System.out.println("6.Set 스쿼트 " + squtroundoff6 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff6 - 3.75) <= squtweight6 && squtweight6 < (squtroundoff6 - 1.25)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff6 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff6 - 5) <= squtweight6 && squtweight6 < (squtroundoff6 - 3.75)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff6 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight6 >= squtroundoff6 && squtroundoff6 > (squtweight6 - 5)) {
            if (squtweight6 < (squtroundoff6 + 1.25)) {
                System.out.println("6.Set 스쿼트 " + squtroundoff6 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff6 + 1.25) <= squtweight6 && squtweight6 < (squtroundoff6 + 3.75)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff6 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff6 + 3.75) <= squtweight6 && squtweight6 < (squtroundoff6 + 5)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff6 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps226 = scanner.nextDouble();

        double squtweight7 = squt1rm * 0.75;
        double squtroundoff7 = Math.round(squtweight7 / 10) * 10;

        if (squtweight7 < squtroundoff7 && squtroundoff7 <= (squtweight7 + 5)) {
            if ((squtroundoff7 - 1.25) <= squtweight7) {
                System.out.println("7.Set 스쿼트 " + squtroundoff7 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff7 - 3.75) <= squtweight7 && squtweight7 < (squtroundoff7 - 1.25)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff7 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff7 - 5) <= squtweight7 && squtweight7 < (squtroundoff7 - 3.75)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff7 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (squtweight7 >= squtroundoff7 && squtroundoff7 > (squtweight7 - 5)) {
            if (squtweight7 < (squtroundoff7 + 1.25)) {
                System.out.println("7.Set 스쿼트 " + squtroundoff7 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff7 + 1.25) <= squtweight7 && squtweight7 < (squtroundoff7 + 3.75)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff7 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff7 + 3.75) <= squtweight7 && squtweight7 < (squtroundoff7 + 5)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff7 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps227 = scanner.nextDouble();

        double squtweight8 = squt1rm * 0.70;
        double squtroundoff8 = Math.round(squtweight8 / 10) * 10;

        if (squtweight8 < squtroundoff8 && squtroundoff8 <= (squtweight8 + 5)) {
            if ((squtroundoff8 - 1.25) <= squtweight8) {
                System.out.println("8.Set 스쿼트 " + squtroundoff8 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff8 - 3.75) <= squtweight8 && squtweight8 < (squtroundoff8 - 1.25)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff8 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff8 - 5) <= squtweight8 && squtweight8 < (squtroundoff8 - 3.75)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff8 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight8 >= squtroundoff8 && squtroundoff8 > (squtweight8 - 5)) {
            if (squtweight8 < (squtroundoff8 + 1.25)) {
                System.out.println("8.Set 스쿼트 " + squtroundoff8 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff8 + 1.25) <= squtweight8 && squtweight8 < (squtroundoff8 + 3.75)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff8 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff8 + 3.75) <= squtweight8 && squtweight8 < (squtroundoff8 + 5)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff8 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps228 = scanner.nextDouble();

        double squtweight9 = squt1rm * 0.65;
        double squtroundoff9 = Math.round(squtweight9 / 10) * 10;

        if (squtweight9 < squtroundoff9 && squtroundoff9 <= (squtweight9 + 5)) {
            if ((squtroundoff9 - 1.25) <= squtweight9) {
                System.out.println("9.Set 스쿼트 " + squtroundoff9 + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff9 - 3.75) <= squtweight9 && squtweight9 < (squtroundoff9 - 1.25)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff9 - 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff9 - 5) <= squtweight9 && squtweight9 < (squtroundoff9 - 3.75)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff9 - 5) + "kg(권장 Reps2 1회 이상)");
            }
        }
        if (squtweight9 >= squtroundoff9 && squtroundoff9 > (squtweight9 - 5)) {
            if (squtweight9 < (squtroundoff9 + 1.25)) {
                System.out.println("9.Set 스쿼트 " + squtroundoff9 + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff9 + 1.25) <= squtweight9 && squtweight9 < (squtroundoff9 + 3.75)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff9 + 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff9 + 3.75) <= squtweight9 && squtweight9 < (squtroundoff9 + 5)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff9 + 5) + "kg(권장 Reps2 1회 이상)");
            }
        }

        System.out.println("몇 Reps2 수행하셨습니까?");

        int asistworkout3 = random.nextInt(4);

        double reps229 = scanner.nextDouble();

        if (reps223 >= 11) {
            squt1rm = (squt1rm + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps223 >= 8 && reps223 < 11) {
            squt1rm = (squt1rm + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps223 >= 5 && reps223 < 8) {
            squt1rm = (squt1rm + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps223 >= 2 && reps223 < 5) {
            squt1rm = (squt1rm + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps223 < 2) {
            squt1rm = (squt1rm);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asistworkout3 == 0) {
            System.out.println("마무리 보조운동 추천!!!! 레그 익스텐션 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout3 == 1) {
            System.out.println("마무리 보조운동 추천!!!! 레그 프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout3 == 2) {
            System.out.println("마무리 보조운동 추천!!!! 레그 컬 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkout == 3) {
            System.out.println("마무리 보조운동 추천!!!! 핵 스쿼트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

        //다음 프로그램 시작!!
        System.out.println("다음 프로그램을 수행하시려면 start를 입력하시오!");

        String answer7 = scanner.next().toUpperCase();

        if (!answer7.equals("START")) {
            return;
        }

        System.out.println("-----------2주차------------");
        System.out.println("월요일 벤치프레스");

        double benchpressweight11 = benchpress1rm * 0.75;
        double benchroundoff11 = Math.round(benchpressweight11 / 10) * 10;

        if (benchpressweight11 < benchroundoff11 && benchroundoff11 <= (benchpressweight11 + 5)) {
            if ((benchroundoff11 - 1.25) <= benchpressweight11) {
                System.out.println("1.Set 벤치프레스 " + benchroundoff11 + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff11 - 3.75) <= benchpressweight11 && benchpressweight11 < (benchroundoff11 - 1.25)) {
                System.out.println("1.Set 벤치프레스 " + (benchroundoff11 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff11 - 5) <= benchpressweight11 && benchpressweight11 < (benchroundoff11 - 3.75)) {
                System.out.println("1.Set 벤치프레스 " + (benchroundoff11 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (benchpressweight11 >= benchroundoff11 && benchroundoff11 > (benchpressweight11 - 5)) {
            if (benchpressweight11 < (benchroundoff11 + 1.25)) {
                System.out.println("1.Set 벤치프레스 " + benchroundoff11 + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff11 + 1.25) <= benchpressweight11 && benchpressweight11 < (benchroundoff11 + 3.75)) {
                System.out.println("1.Set 벤치프레스 " + (benchroundoff11 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff11 + 3.75) <= benchpressweight11 && benchpressweight11 < (benchroundoff11 + 5)) {
                System.out.println("1.Set 벤치프레스 " + (benchroundoff11 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a = scanner.nextDouble();

        double benchpressweight12 = benchpress1rm * 0.85;
        double benchroundoff22 = Math.round(benchpressweight12 / 10) * 10;

        if (benchpressweight12 < benchroundoff22 && benchroundoff22 <= (benchpressweight12 + 5)) {
            if ((benchroundoff22 - 1.25) <= benchpressweight12) {
                System.out.println("2.Set 벤치프레스 " + benchroundoff22 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff22 - 3.75) <= benchpressweight12 && benchpressweight12 < (benchroundoff22 - 1.25)) {
                System.out.println("2.Set 벤치프레스 " + (benchroundoff22 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff22 - 5) <= benchpressweight12 && benchpressweight12 < (benchroundoff22 - 3.75)) {
                System.out.println("2.Set 벤치프레스 " + (benchroundoff22 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight12 >= benchroundoff22 && benchroundoff22 > (benchpressweight12 - 5)) {
            if (benchpressweight12 < (benchroundoff22 + 1.25)) {
                System.out.println("2.Set 벤치프레스 " + benchroundoff22 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff22 + 1.25) <= benchpressweight12 && benchpressweight12 < (benchroundoff22 + 3.75)) {
                System.out.println("2.Set 벤치프레스 " + (benchroundoff22 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff22 + 3.75) <= benchpressweight12 && benchpressweight12 < (benchroundoff22 + 5)) {
                System.out.println("2.Set 벤치프레스 " + (benchroundoff22 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a = scanner.nextDouble();

        double benchpressweight13 = benchpress1rm * 0.95;
        double benchroundoff33 = Math.round(benchpressweight13 / 10) * 10;

        if (benchpressweight13 < benchroundoff33 && benchroundoff33 <= (benchpressweight13 + 5)) {
            if ((benchroundoff33 - 1.25) <= benchpressweight13) {
                System.out.println("3.Set 벤치프레스 " + benchroundoff33 + "kg(권장 Reps2 1회)");
            }
            if ((benchroundoff33 - 3.75) <= benchpressweight13 && benchpressweight13 < (benchroundoff33 - 1.25)) {
                System.out.println("3.Set 벤치프레스 " + (benchroundoff33 - 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((benchroundoff33 - 5) <= benchpressweight13 && benchpressweight13 < (benchroundoff33 - 3.75)) {
                System.out.println("3.Set 벤치프레스 " + (benchroundoff33 - 5) + "kg(권장 Reps2 1회)");
            }
        }
        if (benchpressweight13 >= benchroundoff33 && benchroundoff33 > (benchpressweight13 - 5)) {
            if (benchpressweight13 < (benchroundoff33 + 1.25)) {
                System.out.println("3.Set 벤치프레스 " + benchroundoff33 + "kg(권장 Reps2 1회)");
            }
            if ((benchroundoff33 + 1.25) <= benchpressweight13 && benchpressweight13 < (benchroundoff33 + 3.75)) {
                System.out.println("3.Set 벤치프레스 " + (benchroundoff33 + 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((benchroundoff33 + 3.75) <= benchpressweight13 && benchpressweight13 < (benchroundoff33 + 5)) {
                System.out.println("3.Set 벤치프레스 " + (benchroundoff33 + 5) + "kg(권장 Reps2 1회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps23a = scanner.nextDouble();

        double benchpressweight14 = benchpress1rm * 0.90;
        double benchroundoff44 = Math.round(benchpressweight14 / 10) * 10;

        if (benchpressweight14 < benchroundoff44 && benchroundoff44 <= (benchpressweight14 + 5)) {
            if ((benchroundoff44 - 1.25) <= benchpressweight14) {
                System.out.println("4.Set 벤치프레스 " + benchroundoff44 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff44 - 3.75) <= benchpressweight14 && benchpressweight14 < (benchroundoff44 - 1.25)) {
                System.out.println("4.Set 벤치프레스 " + (benchroundoff44 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff44 - 5) <= benchpressweight14 && benchpressweight14 < (benchroundoff44 - 3.75)) {
                System.out.println("4.Set 벤치프레스 " + (benchroundoff44 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight14 >= benchroundoff44 && benchroundoff44 > (benchpressweight14 - 5)) {
            if (benchpressweight14 < (benchroundoff44 + 1.25)) {
                System.out.println("4.Set 벤치프레스 " + benchroundoff44 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff44 + 1.25) <= benchpressweight14 && benchpressweight14 < (benchroundoff44 + 3.75)) {
                System.out.println("4.Set 벤치프레스 " + (benchroundoff44 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff44 + 3.75) <= benchpressweight14 && benchpressweight14 < (benchroundoff44 + 5)) {
                System.out.println("4.Set 벤치프레스 " + (benchroundoff44 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps24a = scanner.nextDouble();

        double benchpressweight15 = benchpress1rm * 0.85;
        double benchroundoff55 = Math.round(benchpressweight15 / 10) * 10;

        if (benchpressweight15 < benchroundoff55 && benchroundoff55 <= (benchpressweight15 + 5)) {
            if ((benchroundoff55 - 1.25) <= benchpressweight15) {
                System.out.println("5.Set 벤치프레스 " + benchroundoff55 + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff55 - 3.75) <= benchpressweight15 && benchpressweight15 < (benchroundoff55 - 1.25)) {
                System.out.println("5.Set 벤치프레스 " + (benchroundoff55 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff55 - 5) <= benchpressweight15 && benchpressweight15 < (benchroundoff55 - 3.75)) {
                System.out.println("5.Set 벤치프레스 " + (benchroundoff55 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (benchpressweight15 >= benchroundoff55 && benchroundoff55 > (benchpressweight15 - 5)) {
            if (benchpressweight15 < (benchroundoff55 + 1.25)) {
                System.out.println("5.Set 벤치프레스 " + benchroundoff55 + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff55 + 1.25) <= benchpressweight15 && benchpressweight15 < (benchroundoff55 + 3.75)) {
                System.out.println("5.Set 벤치프레스 " + (benchroundoff55 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff55 + 3.75) <= benchpressweight15 && benchpressweight15 < (benchroundoff55 + 5)) {
                System.out.println("5.Set 벤치프레스 " + (benchroundoff55 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps25a = scanner.nextDouble();

        double benchpressweight16 = benchpress1rm * 0.80;
        double benchroundoff66 = Math.round(benchpressweight16 / 10) * 10;

        if (benchpressweight16 < benchroundoff66 && benchroundoff66 <= (benchpressweight16 + 5)) {
            if ((benchroundoff66 - 1.25) <= benchpressweight16) {
                System.out.println("6.Set 벤치프레스 " + benchroundoff66 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff66 - 3.75) <= benchpressweight16 && benchpressweight16 < (benchroundoff66 - 1.25)) {
                System.out.println("6.Set 벤치프레스 " + (benchroundoff66 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff66 - 5) <= benchpressweight16 && benchpressweight16 < (benchroundoff66 - 3.75)) {
                System.out.println("6.Set 벤치프레스 " + (benchroundoff66 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight16 >= benchroundoff66 && benchroundoff66 > (benchpressweight16 - 5)) {
            if (benchpressweight16 < (benchroundoff66 + 1.25)) {
                System.out.println("6.Set 벤치프레스 " + benchroundoff66 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff66 + 1.25) <= benchpressweight16 && benchpressweight16 < (benchroundoff66 + 3.75)) {
                System.out.println("6.Set 벤치프레스 " + (benchroundoff66 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff66 + 3.75) <= benchpressweight16 && benchpressweight16 < (benchroundoff66 + 5)) {
                System.out.println("6.Set 벤치프레스 " + (benchroundoff66 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps26a = scanner.nextDouble();

        double benchpressweight17 = benchpress1rm * 0.75;
        double benchroundoff77 = Math.round(benchpressweight17 / 10) * 10;

        if (benchpressweight17 < benchroundoff77 && benchroundoff77 <= (benchpressweight17 + 5)) {
            if ((benchroundoff77 - 1.25) <= benchpressweight17) {
                System.out.println("7.Set 벤치프레스 " + benchroundoff77 + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff77 - 3.75) <= benchpressweight17 && benchpressweight17 < (benchroundoff77 - 1.25)) {
                System.out.println("7.Set 벤치프레스 " + (benchroundoff77 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff77 - 5) <= benchpressweight17 && benchpressweight17 < (benchroundoff77 - 3.75)) {
                System.out.println("7.Set 벤치프레스 " + (benchroundoff77 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (benchpressweight17 >= benchroundoff77 && benchroundoff77 > (benchpressweight17 - 5)) {
            if (benchpressweight17 < (benchroundoff77 + 1.25)) {
                System.out.println("7.Set 벤치프레스 " + benchroundoff77 + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff77 + 1.25) <= benchpressweight17 && benchpressweight17 < (benchroundoff77 + 3.75)) {
                System.out.println("7.Set 벤치프레스 " + (benchroundoff77 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((benchroundoff77 + 3.75) <= benchpressweight17 && benchpressweight17 < (benchroundoff77 + 5)) {
                System.out.println("7.Set 벤치프레스 " + (benchroundoff77 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps27a = scanner.nextDouble();

        double benchpressweight18 = benchpress1rm * 0.70;
        double benchroundoff88 = Math.round(benchpressweight18 / 10) * 10;

        if (benchpressweight18 < benchroundoff88 && benchroundoff88 <= (benchpressweight18 + 5)) {
            if ((benchroundoff88 - 1.25) <= benchpressweight18) {
                System.out.println("8.Set 벤치프레스 " + benchroundoff88 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff88 - 3.75) <= benchpressweight18 && benchpressweight18 < (benchroundoff88 - 1.25)) {
                System.out.println("8.Set 벤치프레스 " + (benchroundoff88 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff88 - 5) <= benchpressweight18 && benchpressweight18 < (benchroundoff88 - 3.75)) {
                System.out.println("8.Set 벤치프레스 " + (benchroundoff88 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (benchpressweight18 >= benchroundoff88 && benchroundoff88 > (benchpressweight18 - 5)) {
            if (benchpressweight18 < (benchroundoff88 + 1.25)) {
                System.out.println("8.Set 벤치프레스 " + benchroundoff88 + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff88 + 1.25) <= benchpressweight18 && benchpressweight18 < (benchroundoff88 + 3.75)) {
                System.out.println("8.Set 벤치프레스 " + (benchroundoff88 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((benchroundoff88 + 3.75) <= benchpressweight18 && benchpressweight18 < (benchroundoff88 + 5)) {
                System.out.println("8.Set 벤치프레스 " + (benchroundoff88 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps28a = scanner.nextDouble();

        double benchpressweight19 = benchpress1rm * 0.65;
        double benchroundoff99 = Math.round(benchpressweight19 / 10) * 10;

        if (benchpressweight19 < benchroundoff99 && benchroundoff99 <= (benchpressweight19 + 5)) {
            if ((benchroundoff99 - 1.25) <= benchpressweight19) {
                System.out.println("9.Set 벤치프레스 " + benchroundoff99 + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchroundoff99 - 3.75) <= benchpressweight19 && benchpressweight19 < (benchroundoff99 - 1.25)) {
                System.out.println("9.Set 벤치프레스 " + (benchroundoff99 - 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchroundoff99 - 5) <= benchpressweight19 && benchpressweight19 < (benchroundoff99 - 3.75)) {
                System.out.println("9.Set 벤치프레스 " + (benchroundoff99 - 5) + "kg(권장 Reps2 1회 이상)");
            }
        }
        if (benchpressweight19 >= benchroundoff99 && benchroundoff99 > (benchpressweight19 - 5)) {
            if (benchpressweight19 < (benchroundoff99 + 1.25)) {
                System.out.println("9.Set 벤치프레스 " + benchroundoff99 + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchroundoff99 + 1.25) <= benchpressweight19 && benchpressweight19 < (benchroundoff99 + 3.75)) {
                System.out.println("9.Set 벤치프레스 " + (benchroundoff99 + 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((benchroundoff99 + 3.75) <= benchpressweight19 && benchpressweight19 < (benchroundoff99 + 5)) {
                System.out.println("9.Set 벤치프레스 " + (benchroundoff99 + 5) + "kg(권장 Reps2 1회 이상)");
            }
        }

        System.out.println("몇 Reps2 수행하셨습니까?");

        int asistworkouta = random.nextInt(4);

        double reps29a = scanner.nextDouble();

        if (reps23a >= 11) {
            benchpress1rm = (benchpress1rm + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps23a >= 8 && reps23a < 11) {
            benchpress1rm = (benchpress1rm + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps23a >= 5 && reps23a < 8) {
            benchpress1rm = (benchpress1rm + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps23a >= 2 && reps23a < 5) {
            benchpress1rm = (benchpress1rm + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps23a < 2) {
            benchpress1rm = (benchpress1rm);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asistworkouta == 0) {
            System.out.println("마무리 보조운동 추천!!!! 인클라인 덤벨프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta == 1) {
            System.out.println("마무리 보조운동 추천!!!! 딥스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta == 2) {
            System.out.println("마무리 보조운동 추천!!!! 클로즈그립 데드리프트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta == 3) {
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

        double deadliftweight11 = deadlift1rm * 0.75;
        double deadliftroundoff11 = Math.round(deadliftweight11 / 10) * 10;

        if (deadliftweight11 < deadliftroundoff11 && deadliftroundoff11 <= (deadliftweight11 + 5)) {
            if ((deadliftroundoff11 - 1.25) <= deadliftweight11) {
                System.out.println("1.Set 데드리프트 " + deadliftroundoff11 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff11 - 3.75) <= deadliftweight11 && deadliftweight11 < (deadliftroundoff11 - 1.25)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff11 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff11 - 5) <= deadliftweight11 && deadliftweight11 < (deadliftroundoff11 - 3.75)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff11 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (deadliftweight11 >= deadliftroundoff11 && deadliftroundoff11 > (deadliftweight11 - 5)) {
            if (deadliftweight11 < (deadliftroundoff11 + 1.25)) {
                System.out.println("1.Set 데드리프트 " + deadliftroundoff11 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff11 + 1.25) <= deadliftweight11 && deadliftweight11 < (deadliftroundoff11 + 3.75)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff11 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff11 + 3.75) <= deadliftweight11 && deadliftweight11 < (deadliftroundoff11 + 5)) {
                System.out.println("1.Set 데드리프트 " + (deadliftroundoff11 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a1 = scanner.nextDouble();

        double deadliftweight22 = deadlift1rm * 0.85;
        double deadliftroundoff22 = Math.round(deadliftweight22 / 10) * 10;

        if (deadliftweight22 < deadliftroundoff22 && deadliftroundoff22 <= (deadliftweight22 + 5)) {
            if ((deadliftroundoff22 - 1.25) <= deadliftweight22) {
                System.out.println("2.Set 데드리프트 " + deadliftroundoff22 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff22 - 3.75) <= deadliftweight22 && deadliftweight22 < (deadliftroundoff22 - 1.25)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff22 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff22 - 5) <= deadliftweight22 && deadliftweight22 < (deadliftroundoff22 - 3.75)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff22 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight22 >= deadliftroundoff22 && deadliftroundoff22 > (deadliftweight22 - 5)) {
            if (deadliftweight22 < (deadliftroundoff22 + 1.25)) {
                System.out.println("2.Set 데드리프트 " + deadliftroundoff22 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff22 + 1.25) <= deadliftweight22 && deadliftweight22 < (deadliftroundoff22 + 3.75)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff22 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff22 + 3.75) <= deadliftweight22 && deadliftweight22 < (deadliftroundoff22 + 5)) {
                System.out.println("2.Set 데드리프트 " + (deadliftroundoff22 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a2 = scanner.nextDouble();

        double deadliftweight33 = deadlift1rm * 0.95;
        double deadliftroundoff33 = Math.round(deadliftweight33 / 10) * 10;

        if (deadliftweight33 < deadliftroundoff33 && deadliftroundoff33 <= (deadliftweight33 + 5)) {
            if ((deadliftroundoff33 - 1.25) <= deadliftweight33) {
                System.out.println("3.Set 데드리프트 " + deadliftroundoff33 + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff33 - 3.75) <= deadliftweight33 && deadliftweight33 < (deadliftroundoff33 - 1.25)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff33 - 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff33 - 5) <= deadliftweight33 && deadliftweight33 < (deadliftroundoff33 - 3.75)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff33 - 5) + "kg(권장 Reps2 1회)");
            }
        }
        if (deadliftweight33 >= deadliftroundoff33 && deadliftroundoff33 > (deadliftweight33 - 5)) {
            if (deadliftweight33 < (deadliftroundoff33 + 1.25)) {
                System.out.println("3.Set 데드리프트 " + deadliftroundoff33 + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff33 + 1.25) <= deadliftweight33 && deadliftweight33 < (deadliftroundoff33 + 3.75)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff33 + 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((deadliftroundoff33 + 3.75) <= deadliftweight33 && deadliftweight33 < (deadliftroundoff33 + 5)) {
                System.out.println("3.Set 데드리프트 " + (deadliftroundoff33 + 5) + "kg(권장 Reps2 1회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a3 = scanner.nextDouble();

        double deadliftweight44 = deadlift1rm * 0.90;
        double deadliftroundoff44 = Math.round(deadliftweight44 / 10) * 10;

        if (deadliftweight44 < deadliftroundoff44 && deadliftroundoff44 <= (deadliftweight44 + 5)) {
            if ((deadliftroundoff44 - 1.25) <= deadliftweight44) {
                System.out.println("4.Set 데드리프트 " + deadliftroundoff44 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff44 - 3.75) <= deadliftweight44 && deadliftweight44 < (deadliftroundoff44 - 1.25)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff44 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff44 - 5) <= deadliftweight44 && deadliftweight44 < (deadliftroundoff44 - 3.75)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff44 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight44 >= deadliftroundoff44 && deadliftroundoff44 > (deadliftweight44 - 5)) {
            if (deadliftweight44 < (deadliftroundoff44 + 1.25)) {
                System.out.println("4.Set 데드리프트 " + deadliftroundoff44 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff44 + 1.25) <= deadliftweight44 && deadliftweight44 < (deadliftroundoff44 + 3.75)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff44 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff44 + 3.75) <= deadliftweight44 && deadliftweight44 < (deadliftroundoff44 + 5)) {
                System.out.println("4.Set 데드리프트 " + (deadliftroundoff44 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a4 = scanner.nextDouble();

        double deadliftweight55 = deadlift1rm * 0.85;
        double deadliftroundoff55 = Math.round(deadliftweight55 / 10) * 10;

        if (deadliftweight55 < deadliftroundoff55 && deadliftroundoff55 <= (deadliftweight55 + 5)) {
            if ((deadliftroundoff55 - 1.25) <= deadliftweight55) {
                System.out.println("5.Set 데드리프트 " + deadliftroundoff55 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff55 - 3.75) <= deadliftweight55 && deadliftweight55 < (deadliftroundoff55 - 1.25)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff55 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff55 - 5) <= deadliftweight55 && deadliftweight55 < (deadliftroundoff55 - 3.75)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff55 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (deadliftweight55 >= deadliftroundoff55 && deadliftroundoff55 > (deadliftweight55 - 5)) {
            if (deadliftweight55 < (deadliftroundoff55 + 1.25)) {
                System.out.println("5.Set 데드리프트 " + deadliftroundoff55 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff55 + 1.25) <= deadliftweight55 && deadliftweight55 < (deadliftroundoff55 + 3.75)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff55 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff55 + 3.75) <= deadliftweight55 && deadliftweight55 < (deadliftroundoff55 + 5)) {
                System.out.println("5.Set 데드리프트 " + (deadliftroundoff55 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a5 = scanner.nextDouble();

        double deadliftweight66 = deadlift1rm * 0.80;
        double deadliftroundoff66 = Math.round(deadliftweight66 / 10) * 10;

        if (deadliftweight66 < deadliftroundoff66 && deadliftroundoff66 <= (deadliftweight66 + 5)) {
            if ((deadliftroundoff66 - 1.25) <= deadliftweight66) {
                System.out.println("6.Set 데드리프트 " + deadliftroundoff66 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff66 - 3.75) <= deadliftweight66 && deadliftweight66 < (deadliftroundoff66 - 1.25)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff66 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff66 - 5) <= deadliftweight66 && deadliftweight66 < (deadliftroundoff66 - 3.75)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff66 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight66 >= deadliftroundoff66 && deadliftroundoff66 > (deadliftweight66 - 5)) {
            if (deadliftweight66 < (deadliftroundoff66 + 1.25)) {
                System.out.println("6.Set 데드리프트 " + deadliftroundoff66 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff66 + 1.25) <= deadliftweight66 && deadliftweight66 < (deadliftroundoff66 + 3.75)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff66 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff66 + 3.75) <= deadliftweight66 && deadliftweight66 < (deadliftroundoff66 + 5)) {
                System.out.println("6.Set 데드리프트 " + (deadliftroundoff66 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a6 = scanner.nextDouble();

        double deadliftweight77 = deadlift1rm * 0.75;
        double deadliftroundoff77 = Math.round(deadliftweight77 / 10) * 10;

        if (deadliftweight77 < deadliftroundoff77 && deadliftroundoff77 <= (deadliftweight77 + 5)) {
            if ((deadliftroundoff77 - 1.25) <= deadliftweight77) {
                System.out.println("7.Set 데드리프트 " + deadliftroundoff77 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff77 - 3.75) <= deadliftweight77 && deadliftweight77 < (deadliftroundoff77 - 1.25)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff77 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff77 - 5) <= deadliftweight77 && deadliftweight77 < (deadliftroundoff77 - 3.75)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff77 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (deadliftweight77 >= deadliftroundoff77 && deadliftroundoff77 > (deadliftweight77 - 5)) {
            if (deadliftweight77 < (deadliftroundoff77 + 1.25)) {
                System.out.println("7.Set 데드리프트 " + deadliftroundoff77 + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff77 + 1.25) <= deadliftweight77 && deadliftweight77 < (deadliftroundoff77 + 3.75)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff77 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((deadliftroundoff77 + 3.75) <= deadliftweight77 && deadliftweight77 < (deadliftroundoff77 + 5)) {
                System.out.println("7.Set 데드리프트 " + (deadliftroundoff77 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a7 = scanner.nextDouble();

        double deadliftweight88 = deadlift1rm * 0.70;
        double deadliftroundoff88 = Math.round(deadliftweight88 / 10) * 10;

        if (deadliftweight88 < deadliftroundoff88 && deadliftroundoff88 <= (deadliftweight88 + 5)) {
            if ((deadliftroundoff88 - 1.25) <= deadliftweight88) {
                System.out.println("8.Set 데드리프트 " + deadliftroundoff88 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff88 - 3.75) <= deadliftweight88 && deadliftweight88 < (deadliftroundoff88 - 1.25)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff88 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff88 - 5) <= deadliftweight88 && deadliftweight88 < (deadliftroundoff88 - 3.75)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff88 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (deadliftweight88 >= deadliftroundoff88 && deadliftroundoff88 > (deadliftweight88 - 5)) {
            if (deadliftweight88 < (deadliftroundoff88 + 1.25)) {
                System.out.println("8.Set 데드리프트 " + deadliftroundoff88 + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff88 + 1.25) <= deadliftweight88 && deadliftweight88 < (deadliftroundoff88 + 3.75)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff88 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((deadliftroundoff88 + 3.75) <= deadliftweight88 && deadliftweight88 < (deadliftroundoff88 + 5)) {
                System.out.println("8.Set 데드리프트 " + (deadliftroundoff88 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps21a8 = scanner.nextDouble();

        double deadliftweight99 = deadlift1rm * 0.65;
        double deadliftroundoff99 = Math.round(deadliftweight99 / 10) * 10;

        if (deadliftweight99 < deadliftroundoff99 && deadliftroundoff99 <= (deadliftweight99 + 5)) {
            if ((deadliftroundoff99 - 1.25) <= deadliftweight99) {
                System.out.println("9.Set 데드리프트 " + deadliftroundoff99 + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff99 - 3.75) <= deadliftweight99 && deadliftweight99 < (deadliftroundoff99 - 1.25)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff99 - 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff99 - 5) <= deadliftweight99 && deadliftweight99 < (deadliftroundoff99 - 3.75)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff99 - 5) + "kg(권장 Reps2 1회 이상)");
            }
        }
        if (deadliftweight99 >= deadliftroundoff99 && deadliftroundoff99 > (deadliftweight99 - 5)) {
            if (deadliftweight99 < (deadliftroundoff99 + 1.25)) {
                System.out.println("9.Set 데드리프트 " + deadliftroundoff99 + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff99 + 1.25) <= deadliftweight99 && deadliftweight99 < (deadliftroundoff99 + 3.75)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff99 + 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((deadliftroundoff99 + 3.75) <= deadliftweight99 && deadliftweight99 < (deadliftroundoff99 + 5)) {
                System.out.println("9.Set 데드리프트 " + (deadliftroundoff99 + 5) + "kg(권장 Reps2 1회 이상)");
            }
        }

        System.out.println("몇 Reps2 수행하셨습니까?");

        int asistworkouta2a = random.nextInt(4);

        double reps21a9 = scanner.nextDouble();

        if (reps21a3 >= 11) {
            deadlift1rm = (deadlift1rm + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps21a3 >= 8 && reps21a3 < 11) {
            deadlift1rm = (deadlift1rm + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps21a3 >= 5 && reps21a3 < 8) {
            deadlift1rm = (deadlift1rm + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps21a3 >= 2 && reps21a3 < 5) {
            deadlift1rm = (deadlift1rm + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps21a3 < 2) {
            deadlift1rm = (deadlift1rm);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asistworkouta2a == 0) {
            System.out.println("마무리 보조운동 추천!!!! 랫풀 다운 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta2a == 1) {
            System.out.println("마무리 보조운동 추천!!!! 바벨 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta2a == 2) {
            System.out.println("마무리 보조운동 추천!!!! 케이블 로우 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta2a == 3) {
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

        double squtweight11 = squt1rm * 0.75;
        double squtroundoff11 = Math.round(squtweight11 / 10) * 10;

        if (squtweight11 < squtroundoff11 && squtroundoff11 <= (squtweight11 + 5)) {
            if ((squtroundoff11 - 1.25) <= squtweight11) {
                System.out.println("1.Set 스쿼트 " + squtroundoff11 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff11 - 3.75) <= squtweight11 && squtweight11 < (squtroundoff11 - 1.25)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff11 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff11 - 5) <= squtweight11 && squtweight11 < (squtroundoff11 - 3.75)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff11 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (squtweight11 >= squtroundoff11 && squtroundoff11 > (squtweight11 - 5)) {
            if (squtweight11 < (squtroundoff11 + 1.25)) {
                System.out.println("1.Set 스쿼트 " + squtroundoff11 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff11 + 1.25) <= squtweight11 && squtweight11 < (squtroundoff11 + 3.75)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff11 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff11 + 3.75) <= squtweight11 && squtweight11 < (squtroundoff11 + 5)) {
                System.out.println("1.Set 스쿼트 " + (squtroundoff11 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a1 = scanner.nextDouble();

        double squtweight22 = squt1rm * 0.85;
        double squtroundoff22 = Math.round(squtweight22 / 10) * 10;

        if (squtweight22 < squtroundoff22 && squtroundoff22 <= (squtweight22 + 5)) {
            if ((squtroundoff22 - 1.25) <= squtweight22) {
                System.out.println("2.Set 스쿼트 " + squtroundoff22 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff22 - 3.75) <= squtweight22 && squtweight22 < (squtroundoff22 - 1.25)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff22 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff22 - 5) <= squtweight22 && squtweight22 < (squtroundoff22 - 3.75)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff22 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight22 >= squtroundoff22 && squtroundoff22 > (squtweight22 - 5)) {
            if (squtweight22 < (squtroundoff22 + 1.25)) {
                System.out.println("2.Set 스쿼트 " + squtroundoff22 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff22 + 1.25) <= squtweight22 && squtweight22 < (squtroundoff22 + 3.75)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff22 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff22 + 3.75) <= squtweight22 && squtweight22 < (squtroundoff22 + 5)) {
                System.out.println("2.Set 스쿼트 " + (squtroundoff22 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a2 = scanner.nextDouble();

        double squtweight33 = squt1rm * 0.95;
        double squtroundoff33 = Math.round(squtweight33 / 10) * 10;

        if (squtweight33 < squtroundoff33 && squtroundoff33 <= (squtweight33 + 5)) {
            if ((squtroundoff33 - 1.25) <= squtweight33) {
                System.out.println("3.Set 스쿼트 " + squtroundoff33 + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff33 - 3.75) <= squtweight33 && squtweight33 < (squtroundoff33 - 1.25)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff33 - 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff33 - 5) <= squtweight33 && squtweight33 < (squtroundoff33 - 3.75)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff33 - 5) + "kg(권장 Reps2 1회)");
            }
        }
        if (squtweight33 >= squtroundoff33 && squtroundoff33 > (squtweight33 - 5)) {
            if (squtweight33 < (squtroundoff33 + 1.25)) {
                System.out.println("3.Set 스쿼트 " + squtroundoff33 + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff33 + 1.25) <= squtweight33 && squtweight33 < (squtroundoff33 + 3.75)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff33 + 2.5) + "kg(권장 Reps2 1회)");
            }
            if ((squtroundoff33 + 3.75) <= squtweight33 && squtweight33 < (squtroundoff33 + 5)) {
                System.out.println("3.Set 스쿼트 " + (squtroundoff33 + 5) + "kg(권장 Reps2 1회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a3 = scanner.nextDouble();

        double squtweight44 = squt1rm * 0.90;
        double squtroundoff44 = Math.round(squtweight44 / 10) * 10;

        if (squtweight44 < squtroundoff44 && squtroundoff44 <= (squtweight44 + 5)) {
            if ((squtroundoff44 - 1.25) <= squtweight44) {
                System.out.println("4.Set 스쿼트 " + squtroundoff44 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff44 - 3.75) <= squtweight44 && squtweight44 < (squtroundoff44 - 1.25)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff44 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff44 - 5) <= squtweight44 && squtweight44 < (squtroundoff44 - 3.75)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff44 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight44 >= squtroundoff44 && squtroundoff44 > (squtweight44 - 5)) {
            if (squtweight44 < (squtroundoff44 + 1.25)) {
                System.out.println("4.Set 스쿼트 " + squtroundoff44 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff44 + 1.25) <= squtweight44 && squtweight44 < (squtroundoff44 + 3.75)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff44 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff44 + 3.75) <= squtweight44 && squtweight44 < (squtroundoff44 + 5)) {
                System.out.println("4.Set 스쿼트 " + (squtroundoff44 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a4 = scanner.nextDouble();

        double squtweight55 = squt1rm * 0.85;
        double squtroundoff55 = Math.round(squtweight55 / 10) * 10;

        if (squtweight55 < squtroundoff55 && squtroundoff55 <= (squtweight55 + 5)) {
            if ((squtroundoff55 - 1.25) <= squtweight55) {
                System.out.println("5.Set 스쿼트 " + squtroundoff55 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff55 - 3.75) <= squtweight55 && squtweight55 < (squtroundoff55 - 1.25)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff55 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff55 - 5) <= squtweight55 && squtweight55 < (squtroundoff55 - 3.75)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff55 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (squtweight55 >= squtroundoff55 && squtroundoff55 > (squtweight55 - 5)) {
            if (squtweight55 < (squtroundoff55 + 1.25)) {
                System.out.println("5.Set 스쿼트 " + squtroundoff55 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff55 + 1.25) <= squtweight55 && squtweight55 < (squtroundoff55 + 3.75)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff55 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff55 + 3.75) <= squtweight55 && squtweight55 < (squtroundoff55 + 5)) {
                System.out.println("5.Set 스쿼트 " + (squtroundoff55 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a5 = scanner.nextDouble();

        double squtweight66 = squt1rm * 0.80;
        double squtroundoff66 = Math.round(squtweight66 / 10) * 10;

        if (squtweight66 < squtroundoff66 && squtroundoff66 <= (squtweight66 + 5)) {
            if ((squtroundoff66 - 1.25) <= squtweight66) {
                System.out.println("6.Set 스쿼트 " + squtroundoff66 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff66 - 3.75) <= squtweight66 && squtweight66 < (squtroundoff66 - 1.25)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff66 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff66 - 5) <= squtweight66 && squtweight66 < (squtroundoff66 - 3.75)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff66 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight66 >= squtroundoff66 && squtroundoff66 > (squtweight66 - 5)) {
            if (squtweight66 < (squtroundoff66 + 1.25)) {
                System.out.println("6.Set 스쿼트 " + squtroundoff66 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff66 + 1.25) <= squtweight66 && squtweight66 < (squtroundoff66 + 3.75)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff66 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff66 + 3.75) <= squtweight66 && squtweight66 < (squtroundoff66 + 5)) {
                System.out.println("6.Set 스쿼트 " + (squtroundoff66 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a6 = scanner.nextDouble();

        double squtweight77 = squt1rm * 0.75;
        double squtroundoff77 = Math.round(squtweight77 / 10) * 10;

        if (squtweight77 < squtroundoff77 && squtroundoff77 <= (squtweight77 + 5)) {
            if ((squtroundoff77 - 1.25) <= squtweight77) {
                System.out.println("7.Set 스쿼트 " + squtroundoff77 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff77 - 3.75) <= squtweight77 && squtweight77 < (squtroundoff77 - 1.25)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff77 - 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff77 - 5) <= squtweight77 && squtweight77 < (squtroundoff77 - 3.75)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff77 - 5) + "kg(권장 Reps2 5회)");
            }
        }
        if (squtweight77 >= squtroundoff77 && squtroundoff77 > (squtweight77 - 5)) {
            if (squtweight77 < (squtroundoff77 + 1.25)) {
                System.out.println("7.Set 스쿼트 " + squtroundoff77 + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff77 + 1.25) <= squtweight77 && squtweight77 < (squtroundoff77 + 3.75)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff77 + 2.5) + "kg(권장 Reps2 5회)");
            }
            if ((squtroundoff77 + 3.75) <= squtweight77 && squtweight77 < (squtroundoff77 + 5)) {
                System.out.println("7.Set 스쿼트 " + (squtroundoff77 + 5) + "kg(권장 Reps2 5회)");
            }
        }

        System.out.print("몇 Reps2 수행하셨습니까?");

        double reps22a7 = scanner.nextDouble();

        double squtweight88 = squt1rm * 0.70;
        double squtroundoff88 = Math.round(squtweight88 / 10) * 10;

        if (squtweight88 < squtroundoff88 && squtroundoff88 <= (squtweight88 + 5)) {
            if ((squtroundoff88 - 1.25) <= squtweight88) {
                System.out.println("8.Set 스쿼트 " + squtroundoff88 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff88 - 3.75) <= squtweight88 && squtweight88 < (squtroundoff88 - 1.25)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff88 - 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff88 - 5) <= squtweight88 && squtweight88 < (squtroundoff88 - 3.75)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff88 - 5) + "kg(권장 Reps2 3회)");
            }
        }
        if (squtweight88 >= squtroundoff88 && squtroundoff88 > (squtweight88 - 5)) {
            if (squtweight88 < (squtroundoff88 + 1.25)) {
                System.out.println("8.Set 스쿼트 " + squtroundoff88 + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff88 + 1.25) <= squtweight88 && squtweight88 < (squtroundoff88 + 3.75)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff88 + 2.5) + "kg(권장 Reps2 3회)");
            }
            if ((squtroundoff88 + 3.75) <= squtweight88 && squtweight88 < (squtroundoff88 + 5)) {
                System.out.println("8.Set 스쿼트 " + (squtroundoff88 + 5) + "kg(권장 Reps2 3회)");
            }
        }

        System.out.print("몇 Reps 수행하셨습니까?");

        double reps22a8 = scanner.nextDouble();

        double squtweight99 = squt1rm * 0.65;
        double squtroundoff99 = Math.round(squtweight99 / 10) * 10;

        if (squtweight99 < squtroundoff99 && squtroundoff99 <= (squtweight99 + 5)) {
            if ((squtroundoff99 - 1.25) <= squtweight99) {
                System.out.println("9.Set 스쿼트 " + squtroundoff99 + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff99 - 3.75) <= squtweight99 && squtweight99 < (squtroundoff99 - 1.25)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff99 - 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff99 - 5) <= squtweight99 && squtweight99 < (squtroundoff99 - 3.75)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff99 - 5) + "kg(권장 Reps2 1회 이상)");
            }
        }
        if (squtweight99 >= squtroundoff99 && squtroundoff99 > (squtweight99 - 5)) {
            if (squtweight99 < (squtroundoff99 + 1.25)) {
                System.out.println("9.Set 스쿼트 " + squtroundoff99 + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff99 + 1.25) <= squtweight99 && squtweight99 < (squtroundoff99 + 3.75)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff99 + 2.5) + "kg(권장 Reps2 1회 이상)");
            }
            if ((squtroundoff99 + 3.75) <= squtweight99 && squtweight99 < (squtroundoff99 + 5)) {
                System.out.println("9.Set 스쿼트 " + (squtroundoff99 + 5) + "kg(권장 Reps2 1회 이상)");
            }
        }

        System.out.println("몇 Reps2 수행하셨습니까?");

        int asistworkouta3a = random.nextInt(4);

        double reps22a9 = scanner.nextDouble();

        if (reps22a3 >= 11) {
            squt1rm = (squt1rm + 10);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 10kg 증량후 시작합니다!!");
        }
        if (reps22a3 >= 8 && reps22a3 < 11) {
            squt1rm = (squt1rm + 7.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 7.5kg 증량후 시작합니다!!");
        }
        if (reps22a3 >= 5 && reps22a3 < 8) {
            squt1rm = (squt1rm + 5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 5kg 증량후 시작합니다!!");
        }
        if (reps22a3 >= 2 && reps22a3 < 5) {
            squt1rm = (squt1rm + 2.5);
            System.out.println("잘하셨습니다!! 다음 주 부터는 훈련무게 2.5kg 증량후 시작합니다!!");
        }
        if (reps22a3 < 2) {
            squt1rm = (squt1rm);
            System.out.println("아쉽네요!! 컨디션 조절후 다시 증량 해봅시다!!");
        }

        //보조운동
        if (asistworkouta3a == 0) {
            System.out.println("마무리 보조운동 추천!!!! 레그 익스텐션 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta3a == 1) {
            System.out.println("마무리 보조운동 추천!!!! 레그 프레스 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta3a == 2) {
            System.out.println("마무리 보조운동 추천!!!! 레그 컬 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }
        if (asistworkouta3a == 3) {
            System.out.println("마무리 보조운동 추천!!!! 핵 스쿼트 3Set!!");
            System.out.println("이것만하면 집에 갈수있다!!");
        }

        //프로그램 종료
        System.out.println("다음 프로그램을 종료하시려면 yes를 입력하시오!");

        String answer8 = scanner.next().toUpperCase();

        if (!answer8.equals("YES")) {
            return;
        }

        System.out.println("프로그램이 종료되었습니다!");
        System.out.println("벤치프레스 1rm: " + benchpress1rm + "(kg)");
        System.out.println("데드리프트 1rm: " + deadlift1rm + "(kg)");
        System.out.println("스쿼트 1rm: " + squt1rm + "(kg)");

        if ((benchpress1rm + deadlift1rm + squt1rm) >= 500) {
            System.out.println("축하합니다. 당신은 언더아머를 입을 자격이 있습니다!");
        }
        System.out.println("프로그램을 처음부터 다시 시작하시오");
    }
}
