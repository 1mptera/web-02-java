import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class DeliveryTycoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String shortdash = "---------------";
        String name = "";

        System.out.println(shortdash);
        System.out.println("딜리버리 타이쿤 게임");
        System.out.println(shortdash);

        int day = 1;
        int health = 1000;
        int money = 1000;
        int awareness = 0;
        int option = 3;

        while (true) {

            if (option == 3) {
                System.out.println("메뉴를 선택해주세요");
                System.out.println("1. 게임시작");
                System.out.println("2. 게임종료");

                option = scanner.nextInt();

                if (option == 2) {
                    return;
                }

                System.out.println("주인공 이름을 입력해주세요");

                scanner.nextLine();
                name = scanner.nextLine();

                day = 1;
                health = 1000;
                money = 1000;
                awareness = 0;
            }

            String dash = "------------------------------------------";
            String status = "체력: " + health + ", 자산: " + money + "만원, 인지도: " + awareness;
            String storelevel = "노점상";

            if (money > 2000 && awareness > 20) {
                storelevel = "푸드 트럭";
            }

            if (money > 5000 && awareness > 50) {
                storelevel = "구멍 가게";
            }

            if (money > 8000 && awareness > 80) {
                storelevel = "레스토랑";
            }

            System.out.println(day + "일차 " + name + "의 " + storelevel);
            System.out.println(dash);
            System.out.println(status);
            System.out.println(dash);
            System.out.println("1. 가게 오픈하기");
            System.out.println("2. 상점");
            System.out.println("3. 메뉴로 돌아가기");


            option = scanner.nextInt();

            if (option == 1 && health < 500) {
                System.out.println("체력이 부족합니다. 체력을 보충해 주세요! 내 체력: " + health);
                System.out.println();
                continue;
            }

            //todo 음식 배달 게임 구현
            if (option == 1) {
                int revenue = 0;
                int order = random.nextInt(6) + 1;

                String[] foods = new String[]{"1. 햄버거", "2. 피자", "3. 치킨", "4. 커피", "5. 케이크", "6. 족발"};

                int[] answers = new int[order];

                for (int i = 0; i < 5; i += 1) {
                    System.out.println(dash);
                    System.out.println(status);
                    System.out.println(dash);
                    System.out.println(order+ "개의 주문이 들어 왔습니다. (10초 안에 음식을 완성해주세요)");

                    Timer timer=new Timer();
                    TimerTask task=new TimerTask(){
                        public void run() {
                            System.out.println("주문이 틀렸습니다! " + "만원의 손해가 발생했습니다.");

                            if (){
                                timer.cancel();
                            }
                        }
                    };

                    timer.schedule(task, 10000);

                }

                System.out.println(day + "일차 가게 마감!");
                System.out.println("총 수익: ");
                System.out.println("인지도: " + awareness);
                System.out.println("체력 소모: - 500");
                health -= 500;
                day += 1;
            }

            if (option == 2) {
                while (true) {
                    System.out.println(shortdash);
                    System.out.println("플렉스 상점");
                    System.out.println(shortdash);
                    System.out.println("1. 자양강장제: 체력 100회복 - 10 만원");
                    System.out.println("2. 광고: 인지도 +10 - 300 만원");
                    System.out.println("3. 도박: 50% 확률로 자산 X 2 - 50 만원");
                    System.out.println("4. 상점 나가기");

                    int purchasechoice = scanner.nextInt();

                    if (purchasechoice == 1) {
                        money -= 10;
                        health += 100;

                        System.out.println("자양강장제 구입! 내 자산: " + money);
                        System.out.println("체력 회복! 내 체력: " + health);
                    }

                    if (purchasechoice == 2) {
                        money -= 300;
                        awareness += 10;

                        System.out.println("광고 구입! 내 자산: " + money);
                        System.out.println("인지도 상승! 내 인지도: " + awareness);
                    }


                    if (purchasechoice == 3) {
                        money -= 50;

                        int multiplier = random.nextInt(2) + 1;


                        System.out.println("복권 구입! 내 자산: " + money);

                        money *= multiplier;

                        if (multiplier == 1) {
                            System.out.println("도박 실패! 내 자산: " + money);
                        }

                        if (multiplier == 2) {
                            System.out.println("도박 성공! 내 자산: " + money);
                        }
                    }

                    if (purchasechoice == 4) {
                        break;
                    }
                }
            }

            System.out.println();
        }
    }
}
