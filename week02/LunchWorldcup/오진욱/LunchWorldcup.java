import java.util.Scanner;

public class LunchWorldcup {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        int roundCount = 6;

        String[][] round = new String[roundCount - 1][];

        for (int i = 1; i <= round.length; i += 1) {
            int length = (int) Math.pow(2, round.length - i);
            round[i - 1] = new String[length];
        }

        String[] foodDB = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥", "라멘", "쌀국수", "곰탕", "국밥", "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면", "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

        for (int i = 0; i < round.length; i += 1) {

            if (i == 0) {
                for (int j = 0; j < round[i].length; j += 1) {
                    round[i][j] = foodDB[j];

                }
                continue;
            }

            System.out.println("");
            System.out.println("-----------------");

            if (i < round.length - 1) {
                System.out.println("점심 메뉴 월드컵 " + round[i].length + "강");
            }

            if (i == round.length - 1) {
                System.out.println("점심 메뉴 월드컵 결승전!");
            }

            System.out.println("-----------------");
            System.out.println("");
            System.out.println("선호하는 메뉴를 번호로 선택해주세요");
            System.out.println("");

            for (int j = 0; j < round[i - 1].length; j += 2) {
                int x = j;
                System.out.println("1. " + round[i - 1][x]);

                x += 1;
                System.out.println("2. " + round[i - 1][x]);

                int select = scanner.nextInt();

                if (select != 1 && select != 2) {
                    System.out.println("다시 입력해주세요!");
                    j -= 2;
                    continue;
                }

                if (select == 1) {
                    round[i][j / 2] = round[i - 1][j];
                }

                if (select == 2) {
                    round[i][j / 2] = round[i - 1][j + 1];
                }
            }
        }

        String lunch = round[round.length - 1][0];

        System.out.println();
        System.out.println("오늘의 점심은 " + lunch + " 입니다");
    }
}
