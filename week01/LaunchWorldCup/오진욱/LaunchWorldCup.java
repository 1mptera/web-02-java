import java.util.Scanner;

public class LaunchWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chineseMeal1 = "짜장";
        String chineseMeal2 = "짬뽕";
        String chineseMeal3 = "볶음밥";
        String chineseMeal4 = "잡채밥";

        String japaneseMeal1 = "스시";
        String japaneseMeal2 = "덴뿌라";
        String japaneseMeal3 = "우동";
        String japaneseMeal4 = "돈까스";

        String westernMeal1 = "파스타";
        String westernMeal2 = "리조또";
        String westernMeal3 = "스테이크";
        String westernMeal4 = "피자";

        int round1;
        int round2;
        int round3;

        System.out.println("점심 월드컵!");
        System.out.println("-------카테고리 선택-------");
        System.out.println("1. 중식\n2. 일식\n3. 한식\n4. 양식");

        int categorySelect = scanner.nextInt();

        //중식
        if (categorySelect == 1) {
            System.out.println("1." + chineseMeal1 + "vs 2." + chineseMeal2);
            round1 = scanner.nextInt();

            System.out.println("1." + chineseMeal3 + "vs 2." + chineseMeal4);
            round2 = scanner.nextInt();

            if (round1 == 1 && round2 == 1) {
                System.out.println("1." + chineseMeal1 + "vs 2." + chineseMeal3);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은" + chineseMeal1 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은" + chineseMeal3 + "입니다!");
            }

            if (round1 == 1 && round2 == 2) {
                System.out.println("1." + chineseMeal1 + "vs 2." + chineseMeal4);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은" + chineseMeal1 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은" + chineseMeal4 + "입니다!");
            }

            if (round1 == 2 && round2 == 1) {
                System.out.println("1." + chineseMeal2 + "vs 2." + chineseMeal3);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은 " + chineseMeal2 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은 " + chineseMeal3 + "입니다!");
            }

            if (round1 == 2 && round2 == 2) {
                System.out.println("1." + chineseMeal2 + "vs 2." + chineseMeal4);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은 " + chineseMeal2 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은 " + chineseMeal4 + "입니다!");
            }
        }

        //일식
        if (categorySelect == 2) {
            System.out.println("1." + japaneseMeal1 + "vs 2." + japaneseMeal2);
            round1 = scanner.nextInt();

            System.out.println("1." + japaneseMeal3 + "vs 2." + japaneseMeal4);
            round2 = scanner.nextInt();

            if (round1 == 1 && round2 == 1) {
                System.out.println("1." + japaneseMeal1 + "vs 2." + japaneseMeal3);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은" + japaneseMeal1 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은" + japaneseMeal3 + "입니다!");
            }

            if (round1 == 1 && round2 == 2) {
                System.out.println("1." + japaneseMeal1 + "vs 2." + japaneseMeal4);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은" + japaneseMeal1 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은" + japaneseMeal4 + "입니다!");
            }

            if (round1 == 2 && round2 == 1) {
                System.out.println("1." + japaneseMeal2 + "vs 2." + japaneseMeal3);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은 " + japaneseMeal2 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은 " + japaneseMeal3 + "입니다!");
            }

            if (round1 == 2 && round2 == 2) {
                System.out.println("1." + japaneseMeal2 + "vs 2." + japaneseMeal4);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은 " + japaneseMeal2 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은 " + japaneseMeal4 + "입니다!");
            }
        }

        //양식
        if (categorySelect == 1) {
            System.out.println("1." + westernMeal1 + "vs 2." + westernMeal2);
            round1 = scanner.nextInt();

            System.out.println("1." + westernMeal3 + "vs 2." + westernMeal4);
            round2 = scanner.nextInt();

            if (round1 == 1 && round2 == 1) {
                System.out.println("1." + westernMeal1 + "vs 2." + westernMeal3);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은" + westernMeal1 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은" + westernMeal3 + "입니다!");
            }

            if (round1 == 1 && round2 == 2) {
                System.out.println("1." + westernMeal1 + "vs 2." + westernMeal4);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은" + westernMeal1 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은" + westernMeal4 + "입니다!");
            }

            if (round1 == 2 && round2 == 1) {
                System.out.println("1." + westernMeal2 + "vs 2." + westernMeal3);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은 " + westernMeal2 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은 " + westernMeal3 + "입니다!");
            }

            if (round1 == 2 && round2 == 2) {
                System.out.println("1." + westernMeal2 + "vs 2." + westernMeal4);
                round3 = scanner.nextInt();

                if (round3 == 1) {
                    System.out.println("오늘의 점심은 " + westernMeal2 + "입니다!");
                    return;
                }
                System.out.println("오늘의 점심은 " + westernMeal4 + "입니다!");
            }
        }

        //한식
        if (categorySelect == 4) {
            System.out.println("한식은 선택지가 없습니다. \n오늘의 점심은 제육볶음입니다!");
        }
    }
}
