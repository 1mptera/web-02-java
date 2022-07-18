import java.util.Scanner;

public class LunchWorldcup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] RoundOf16 = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥",
                "라멘", "쌀국수", "곰탕", "국밥", "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면",
                "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

        String[] RoundOf8 = new String[16];
        String[] RoundOf4 = new String[8];
        String[] RoundOf2 = new String[4];
        String[] finals = new String[2];

        System.out.println("점심 메뉴 월드컵");
        System.out.println();
        System.out.println("----------------");
        System.out.println("점심 메뉴 월드컵 16강");
        System.out.println("----------------");
        System.out.println();
        System.out.println("선호하는 메뉴를 선택해주세요.");
        System.out.println();

        for (int i = 0; i < 31; i += 2) {
            int option = 0;

            while (option != 1 && option != 2) {
                System.out.println("1. " + RoundOf16[i]);
                System.out.println("2. " + RoundOf16[i + 1]);

                option = scanner.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("다시 입력해주세요");
                }
                int x = i / 2;

                if (option == 1) {
                    RoundOf8[x] = RoundOf16[i];
                }

                if (option == 2) {
                    RoundOf8[x] = RoundOf16[i + 1];
                }
            }
        }

        System.out.println("----------------");
        System.out.println("점심 메뉴 월드컵 8강");
        System.out.println("----------------");
        System.out.println();
        System.out.println("선호하는 메뉴를 선택해주세요.");
        System.out.println();

        for (int i = 0; i < 15; i += 2) {
            int option = 0;

            while (option != 1 && option != 2) {
                System.out.println("1. " + RoundOf8[i]);
                System.out.println("2. " + RoundOf8[i + 1]);

                option = scanner.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("다시 입력해주세요");
                }
                int x = i / 2;

                if (option == 1) {
                    RoundOf4[x] = RoundOf8[i];
                }

                if (option == 2) {
                    RoundOf4[x] = RoundOf8[i + 1];
                }
            }
        }

        System.out.println("----------------");
        System.out.println("점심 메뉴 월드컵 4강");
        System.out.println("----------------");
        System.out.println();
        System.out.println("선호하는 메뉴를 선택해주세요.");
        System.out.println();

        for (int i = 0; i < 7; i += 2) {
            int option = 0;

            while (option != 1 && option != 2) {
                System.out.println("1. " + RoundOf4[i]);
                System.out.println("2. " + RoundOf4[i + 1]);

                option = scanner.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("다시 입력해주세요");
                }
                int x = i / 2;

                if (option == 1) {
                    RoundOf2[x] = RoundOf4[i];
                }

                if (option == 2) {
                    RoundOf2[x] = RoundOf4[i + 1];
                }
            }
        }

        System.out.println("----------------");
        System.out.println("점심 메뉴 월드컵 2강");
        System.out.println("----------------");
        System.out.println();
        System.out.println("선호하는 메뉴를 선택해주세요.");
        System.out.println();

        for (int i = 0; i < 3; i += 2) {
            int option = 0;

            while (option != 1 && option != 2) {
                System.out.println("1. " + RoundOf2[i]);
                System.out.println("2. " + RoundOf2[i + 1]);

                option = scanner.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("다시 입력해주세요");
                }
                int x = i / 2;

                if (option == 1) {
                    finals[x] = RoundOf2[i];
                }

                if (option == 2) {
                    finals[x] = RoundOf2[i + 1];
                }
            }
        }

        System.out.println("----------------");
        System.out.println("점심 메뉴 월드컵 결승전!");
        System.out.println("----------------");
        System.out.println();
        System.out.println("선호하는 메뉴를 선택해주세요.");
        System.out.println();

        int option = 0;

        while (option != 1 && option != 2) {
            System.out.println("1. " + finals[0]);
            System.out.println("2. " + finals[1]);

            option = scanner.nextInt();

            if (option != 1 && option != 2) {
                System.out.println("다시 입력해주세요");
            }

            if (option == 1) {
                System.out.println("오늘의 점심은 " + finals[0] + "입니다");
            }

            if (option == 2) {
                System.out.println("오늘의 점심은 " + finals[1] + "입니다");
            }
        }
    }
}
