import java.util.Random;
import java.util.Scanner;


// 요구사항
// 시작
// 게임시작 -> 주인공이름 입력, 새 게임 시작
// 게임종료 -> 프로그램 종료 (return)
// 게임종료 하기전 까지 n일차 반복
// 기본 체력 1000, 자산 1000, 인지도 0

// 가게 오픈
// 오픈시마다 체력 -500
// 5회의 음식배달 진행

//


public class DeliveryTycoon {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name = "";
        int day = 0;
        int hp = 0;
        int money = 0;
        int fame = 0;

        long time = 0;
        boolean fail = false;
        boolean over10s = false;

        boolean exit = false;
        boolean playing = false;

        String shortDash = "---------------";
        String longDash = "---------------------------------";

        String[] menu = new String[]{"햄버거", "족발", "피자", "케이크", "커피", "치킨"};
        int[] orderOrder = new int[]{1, 2, 3, 4, 5, 6};


        while (!exit) {
            day = 1;
            hp = 1000;
            money = 1000;
            fame = 0;

            //입력
            System.out.println(shortDash);
            System.out.println("딜리버리 타이쿤 게임");
            System.out.println(shortDash);

            System.out.println("메뉴를 선택해주세요");
            System.out.println("1. 게임시작");
            System.out.println("2. 게임종료");

            int select = scanner.nextInt();

            if (select == 2) {
                exit = false;
            }

            if (select == 1) {
                System.out.println("이름을 입력해주세요 : ");
                name = scanner.nextLine();

                while (!playing){

                    System.out.println(day + "일차 " + name + "의 노점상");
                    System.out.println(longDash);
                    System.out.println("체력 : " + hp + ", 자산 : " + money + "원, 인지도: " + fame);
                    System.out.println(longDash);

                    System.out.println("1. 가게 오픈하기");
                    System.out.println("2. 상점");
                    System.out.println("3. 메뉴로 돌아가기");

                    select = scanner.nextInt();

                    if (select == 3) {
                        continue;
                    }

                    if (select == 1) {
                        System.out.println(longDash);
                        System.out.println("체력 : " + hp + ", 자산 : " + money + "원, 인지도: " + fame);
                        System.out.println(longDash);
                        for (int i = 0; i < 5; i += 1) {
                            over10s = false;
                            fail = false;
                            long start = System.currentTimeMillis();
                            int order = random.nextInt(6) + 1;
                            System.out.println(order + "개의 음식주문이 들어왔습니다. (10초안에 음식을 완성해주세요!)");

                            for (int j = 1; j <= order; j += 1) {
                                order = random.nextInt(6) + 1;             //TODO : order 섞어서 넣기 (셔플)
                                System.out.println(order + ". " + menu[j - 1]);       //TODO : 메뉴 섞어서 넣기 (셔플)

                                select = scanner.nextInt();
                            }

//                        if() ~                        //배달 순서 입력 -> 틀리면 fail
//                        boolean fail = true

                            while (over10s) {
                                time = (System.currentTimeMillis() - start) / 1000;
                                if (time > 10) {
                                    over10s = true;
                                    fail = true;
                                }
                            }
                        }
                        day += 1;
                        hp -= 500;
                        continue;
                    }                                   //가게 오픈

                    if (select ==2) {
                        System.out.println(shortDash);
                        System.out.println("플렉스 상점");
                        System.out.println(shortDash);
                        System.out.println("1. 자양강장제");
                    }                                   //상점

                }                                       // playing
            }


            //처리
            //출력
        }                                               //exit
    }
}
