import java.util.Random;
import java.util.Scanner;

public class LunchWorldCup {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] lunchs = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥"
                , "라멘", "쌀국수", "곰탕", "국밥", "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면",
                "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

        String[] selectedLunchs = new String[16];

        int roundNumbers = lunchs.length / 2;

        while (roundNumbers != 1) {

            System.out.println("점심 메뉴 월드컵");
            System.out.println(" ");
            System.out.println("----------------");
            System.out.println("점심 메뉴 월드컵 " + roundNumbers + "강");
            System.out.println("----------------");
            System.out.println(" ");
            System.out.println("선호하는 메뉴를 번호로 선택해주세요.");
            System.out.println(" ");

            for (int i = 0; i < roundNumbers; i += 1) {

                System.out.println("1. " + lunchs[2 * i]);
                System.out.println("2. " + lunchs[2 * i + 1]);

                int choose = scanner.nextInt();

                if (choose == 1) {
                    selectedLunchs[i] = lunchs[2 * i];
                }

                if (choose == 2) {
                    selectedLunchs[i] = lunchs[2 * i + 1];
                }

                if (choose == 3) {
                    i -= 1;
                    System.out.println("다시 입력해주세요");
                    continue;
                }
            }

            lunchs = selectedLunchs;

            roundNumbers /= 2;
        }

        System.out.println("점심 메뉴 월드컵");
        System.out.println(" ");
        System.out.println("----------------");
        System.out.println("점심 메뉴 월드컵 결승전!");
        System.out.println("----------------");
        System.out.println(" ");
        System.out.println("선호하는 메뉴를 번호로 선택해주세요.");
        System.out.println(" ");

        System.out.println("1. " + lunchs[0]);
        System.out.println("2. " + lunchs[1]);

        int choose = scanner.nextInt();

        if (choose == 1) {
            System.out.println("오늘 점심은 " + lunchs[0] + " 입니다");

        }

        if (choose == 2) {
            System.out.println("오늘 점심은 " + lunchs[1] + " 입니다");
        }
    }
}
