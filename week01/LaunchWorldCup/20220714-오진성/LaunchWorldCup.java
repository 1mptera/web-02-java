import java.util.Scanner;

public class LaunchWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //점심 월드컵 시즈악!
        System.out.println("점심 월드컵!\n-------카테고리 선택-------");
        System.out.println("1. 중식");
        System.out.println("2. 일식");
        System.out.println("3. 한식");
        System.out.println("4. 양식");

        String chiniesemenu1 = "짜장";
        String chiniesemenu2 = "짬뽕";
        String chiniesemenu3 = "볶음밥";
        String chiniesemenu4 = "잡채밥";

        int answer1 = scanner.nextInt();

        if (answer1 == 1) {
            System.out.println("1." + chiniesemenu1 + " vs 2." + chiniesemenu2);

            int answer2 = scanner.nextInt();

            System.out.println("1. " + chiniesemenu3 + " vs 2." + chiniesemenu4);

            int answer3 = scanner.nextInt();

            if (answer2 == 1 && answer3 == 1) {
                System.out.println("1." + chiniesemenu1 + " vs 2." + chiniesemenu3);
            }
            if (answer2 == 2 && answer3 == 1) {
                System.out.println("1." + chiniesemenu2 + " vs 2." + chiniesemenu3);
            }
            if (answer2 == 1 && answer3 == 2) {
                System.out.println("1." + chiniesemenu1 + " vs 2." + chiniesemenu4);
            }
            if (answer2 == 2 && answer3 == 2) {
                System.out.println("1." + chiniesemenu2 + " vs 2." + chiniesemenu4);
            }

            int answer4 = scanner.nextInt();

            if (answer2 == 1 && answer4 == 1) {
                System.out.println("오늘의 점심은 " + chiniesemenu1 + "입니다!");
            }
            if (answer2 == 2 && answer4 == 1) {
                System.out.println("오늘의 점심은 " + chiniesemenu2 + "입니다!");
            }
            if (answer3 == 1 && answer4 == 2) {
                System.out.println("오늘의 점심은 " + chiniesemenu3 + "입니다!");
            }
            if (answer3 == 2 && answer4 == 2) {
                System.out.println("오늘의 점심은 " + chiniesemenu4 + "입니다!");
            }
        }

        String japanesemenu1 = "스시";
        String japanesemenu2 = "덴뿌라";
        String japanesemenu3 = "우동";
        String japanesemenu4 = "돈까스";

        if (answer1 == 2) {
            System.out.println("1." + japanesemenu1 + " vs 2." + japanesemenu2);

            int answer2 = scanner.nextInt();

            System.out.println("1." + japanesemenu3 + " vs 2." + japanesemenu4);

            int answer3 = scanner.nextInt();

            if (answer2 == 1 && answer3 == 1) {
                System.out.println("1." + japanesemenu1 + " vs 2." + japanesemenu3);
            }
            if (answer2 == 2 && answer3 == 1) {
                System.out.println("1." + japanesemenu2 + " vs 2." + japanesemenu3);
            }
            if (answer2 == 1 && answer3 == 2) {
                System.out.println("1." + japanesemenu1 + " vs 2." + japanesemenu4);
            }
            if (answer2 == 2 && answer3 == 2) {
                System.out.println("1." + japanesemenu2 + "vs 2." + japanesemenu4);
            }

            int answer4 = scanner.nextInt();

            if (answer2 == 1 && answer4 == 1) {
                System.out.println("오늘의 점심은 " + japanesemenu1 + "입니다!");
            }
            if (answer2 == 2 && answer4 == 1) {
                System.out.println("오늘의 점심은 " + japanesemenu2 + "입니다!");
            }
            if (answer3 == 1 && answer4 == 2) {
                System.out.println("오늘의 점심은 " + japanesemenu3 + "입니다!");
            }
            if (answer3 == 2 && answer4 == 2) {
                System.out.println("오늘의 점심은 " + japanesemenu4 + "입니다!");
            }
        }

        String koreanmenu1 = "제육볶음";

        if (answer1 == 3) {

            System.out.println("한식은 선택지가 없습니다!");
            System.out.println("오늘의 점심은 " + koreanmenu1 + "입니다!");
        }

        String westfoodmenu1 = "파스타";
        String westfoodmenu2 = "리조또";
        String westfoodmenu3 = "스테이크";
        String westfoodmenu4 = "피자";

        if (answer1 == 4) {
            System.out.println("1." + westfoodmenu1 + " vs 2." + westfoodmenu2 + "");

            int answer2 = scanner.nextInt();

            System.out.println("1." + westfoodmenu3 + " vs 2.피자");

            int answer3 = scanner.nextInt();

            if (answer2 == 1 && answer3 == 1) {
                System.out.println("1." + westfoodmenu1 + " vs 2." + westfoodmenu3);
            }
            if (answer2 == 2 && answer3 == 1) {
                System.out.println("1." + westfoodmenu2 + " vs 2." + westfoodmenu3);
            }
            if (answer2 == 1 && answer3 == 2) {
                System.out.println("1." + westfoodmenu1 + " vs 2." + westfoodmenu4);
            }
            if (answer2 == 2 && answer3 == 2) {
                System.out.println("1." + westfoodmenu2 + " vs 2." + westfoodmenu4);
            }

            int answer4 = scanner.nextInt();

            if (answer2 == 1 && answer4 == 1) {
                System.out.println("오늘의 점심은 " + westfoodmenu1 + "입니다!");
            }
            if (answer2 == 2 && answer4 == 1) {
                System.out.println("오늘의 점심은 " + westfoodmenu2 + "입니다!");
            }
            if (answer3 == 1 && answer4 == 2) {
                System.out.println("오늘의 점심은 " + westfoodmenu3 + "입니다!");
            }
            if (answer3 == 2 && answer4 == 2) {
                System.out.println("오늘의 점심은 " + westfoodmenu4 + "입니다!");
            }
        }
    }
}
