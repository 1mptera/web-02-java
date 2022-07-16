import java.util.Scanner;

public class LaunchWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점심 월드컵!");
        System.out.println("-------카테고리 선택-------");
        System.out.println("1. 중식\n2. 일식\n3. 한식\n4. 양식");

        int option = scanner.nextInt();

        String food1 = "";
        String food2 = "";

        //중식
        if (option == 1) {

            System.out.println("1. 짜장 vs 2. 짬뽕");

            int option1 = scanner.nextInt();

            System.out.println("1. 볶음밥 vs 2. 잡채밥");

            int option2 = scanner.nextInt();

            //최종선택
            if (option1 == 1) {

                food1 = "짜장";
            }

            if (option1 == 2) {

                food1 = "짬뽕";
            }

            if (option2 == 1) {

                food2 = "볶음밥";
            }

            if (option2 == 2) {

                food2 = "잡채밥";
            }
        }

        //일식
        if (option == 2) {
            System.out.println("1. 스시 vs 2. 덴뿌라");

            int option1 = scanner.nextInt();

            System.out.println("1. 우동 vs 2. 돈까스");

            int option2 = scanner.nextInt();

            //최종선택
            if (option1 == 1) {

                food1 = "스시";
            }

            if (option1 == 2) {

                food1 = "덴뿌라";
            }

            if (option2 == 1) {

                food2 = "우동";
            }

            if (option2 == 2) {

                food2 = "돈까스";
            }
        }

        //양식
        if (option == 4) {
            System.out.println("1. 파스타 vs 2. 리조또");

            int option1 = scanner.nextInt();

            System.out.println("1. 스테이크 vs 2. 피자");

            int option2 = scanner.nextInt();

            //최종선택
            if (option1 == 1) {

                food1 = "파스타";
            }

            if (option1 == 2) {

                food1 = "리조또";
            }

            if (option2 == 1) {

                food2 = "스테이크";
            }

            if (option2 == 2) {

                food2 = "피자";
            }
        }

        System.out.println("1. " + food1 + " vs 2. " + food2);

        int result = scanner.nextInt();

        //결과
        if (result == 1) {
            System.out.println("오늘의 점심은 " + food1 + "입니다!");
        }

        if (result == 2) {
            System.out.println("오늘의 점심은 " + food2 + "입니다!");
        }

        //한식
        if (option == 3) {
            System.out.println("한식은 선택지가 없습니다.\n 오늘의 점심은 제욱볶음입니다.");
        }
    }
}
