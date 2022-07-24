import java.util.Scanner;

public class LunchWorldcup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foodmenu = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥",
                "라멘", "쌀국수", "곰탕", "국밥", "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면",
                "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

        int NumberOfRounds = 5;

        String[] foods = new String[foodmenu.length / 2];

        for (int i = 1; i <= NumberOfRounds; i += 1 ) {
            int round = foodmenu.length / 2;

            System.out.println("점심 메뉴 월드컵");
            System.out.println();
            System.out.println("----------------");

            boolean finals = i == 4;
            
            if (!finals) {
                System.out.println("점심 메뉴 월드컵 " + round + "강");
            }

            if (finals) {
                System.out.println("점심 메뉴 월드컵 결승전!");
            }

            System.out.println("----------------");
            System.out.println();
            System.out.println("선호하는 메뉴를 선택해주세요.");
            System.out.println();

            for (int j = 0; j < round * 2; j += 2) {
                int option = 0;

                while (option != 1 && option != 2) {
                    int x = j / 2;

                    System.out.println("1. " + foodmenu[j]);
                    System.out.println("2. " + foodmenu[j + 1]);

                    option = scanner.nextInt();

                    if (option != 1 && option != 2) {
                        System.out.println("다시 입력해주세요");
                    }

                    if (option == 1) {
                        foods[x] = foodmenu[j];
                    }

                    if (option == 2) {
                        foods[x] = foodmenu[j + 1];
                    }
                }
            }
            foodmenu = foods;

            foods = new String[round / 2];
        }

        System.out.println("오늘의 점심은 " + foodmenu[0] + "입니다");
    }
}
