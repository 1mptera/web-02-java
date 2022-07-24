import java.util.*;
public class DeliveryTycoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int day = 0;
        int health = 0;
        int money = 0;
        int awareness = 0;
        String name = "";

        System.out.println("---------------");
        System.out.println("딜리버리 타이쿤 게임");
        System.out.println("---------------");

        int option = 3;

        boolean playing = true;

        while (playing) {
            if (option == 3) {
                System.out.println("메뉴를 선택해주세요");
                System.out.println("1. 게임시작");
                System.out.println("2. 게임종료");

                int MainMenu = scanner.nextInt();

                if (MainMenu == 2) {
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

            String status = "체력: " + health + ", 자산: " + money + "만원, 인지도: " + awareness;
            String StoreLevel = "노점상";

            if (money > 2000 && awareness > 20) {
                StoreLevel = "푸드 트럭";
            }

            if (money > 5000 && awareness > 50) {
                StoreLevel = "구멍 가게";
            }

            if (money > 8000 && awareness > 80) {
                StoreLevel = "레스토랑";
            }

            System.out.println(day + "일차 " + name + "의 " + StoreLevel);
            System.out.println("------------------------------------------");
            System.out.println(status);
            System.out.println("------------------------------------------");
            System.out.println("1. 가게 오픈하기");
            System.out.println("2. 상점");
            System.out.println("3. 메뉴로 돌아가기");

            option = scanner.nextInt();

            if (option == 1 && health < 500) {
                System.out.println("체력이 부족합니다. 체력을 보충해 주세요! 내 체력: " + health);
                System.out.println();
                continue;
            }

            if (option == 1) {
                int TotalRevenue = 0;

                String[] menus = new String[]{"1. 햄버거", "2. 피자", "3. 치킨", "4. 커피", "5. 케이크", "6. 족발"};
                int[] price = new int[]{1, 5, 3, 1, 2, 4};

                for (int i = 0; i < 5; i += 1) {
                    int orderConut = random.nextInt(menus.length) + 1;
                    int[] orders = new int[orderConut];

                    for (int j = 0; j < orders.length; j += 1) {
                        int food = random.nextInt(menus.length);

                        for (int k = 0; k < j; k += 1) {
                            if (food == orders[k]) {
                                j -= 1;
                                break;
                            }

                            orders[j] = food;
                        }
                    }

                    int[] answers = new int[orders.length];
                    String[] FoodNameProcessing = new String[orders.length];

                    System.out.println("------------------------------------------");
                    System.out.println(status);
                    System.out.println("------------------------------------------");
                    System.out.println(orders.length + "개의 주문이 들어 왔습니다. (10초 안에 음식을 완성해주세요)");

                    int sales = 0;
                    int DeliveryFee = 0;

                    boolean success = true;

                    long start = System.currentTimeMillis();

                    for (int j = 0; j < orders.length; j += 1) {
                        System.out.println(menus[orders[j]]);

                        DeliveryFee += price[orders[j]];
                    }

                    for (int j = 0; j < orders.length; j += 1) {
                        System.out.println("음식준비:");

                        answers[j] = scanner.nextInt();

                        FoodNameProcessing[j] = menus[orders[j]].substring(0, 1);

                        if (answers[j] != Integer.parseInt(FoodNameProcessing[j])){
                            success = false;
                            break;
                        }
                    }

                    long end = System.currentTimeMillis();
                    long LeadTime = (end - start) / 1000;

                    if (success == false){
                        sales -= DeliveryFee;
                        money += sales;
                        awareness -= 1;

                        System.out.println("주문이 틀렸습니다! " + sales + " 만원의 손해가 발생했습니다.");
                        System.out.println("내 자산: " + money);

                        continue;
                    }

                    if (LeadTime > 10) {
                        sales -= DeliveryFee;
                        awareness -= 1;

                        System.out.println("음식 준비 완료! 소요시간: " + LeadTime);
                        System.out.println("주문 시간이 초과했습니다! " + sales + " 만원의 손해가 발생했습니다.");
                    }

                    if (LeadTime <= 10) {
                        sales += DeliveryFee;
                        awareness += 1;

                        System.out.println("음식 준비 완료! 소요시간: " + LeadTime);
                        System.out.println("배달완료! 수익: " + sales + " 만원");
                    }

                    TotalRevenue += sales;
                }

                System.out.println(day + "일차 가게 마감!");
                System.out.println("총 수익: " + TotalRevenue + " 만원");
                System.out.println("인지도: " + awareness);
                System.out.println("체력 소모: - 500");

                money += TotalRevenue;
                health -= 500;
                day += 1;
            }

            boolean shopping = true;

            if (option == 2) {
                while (shopping) {
                    System.out.println("---------------");
                    System.out.println("플렉스 상점");
                    System.out.println("---------------");
                    System.out.println("1. 자양강장제: 체력 100회복 - 10 만원");
                    System.out.println("2. 광고: 인지도 +10 - 300 만원");
                    System.out.println("3. 도박: 50% 확률로 자산 X 2 - 50 만원");
                    System.out.println("4. 상점 나가기");

                    int purchasechoice = scanner.nextInt();

                    if (purchasechoice == 1) {
                        if (money < 10){
                            System.out.println("돈이 부족합니다.");
                            continue;
                        }

                        money -= 10;
                        health += 100;

                        System.out.println("자양강장제 구입! 내 자산: " + money);
                        System.out.println("체력 회복! 내 체력: " + health);
                    }

                    if (purchasechoice == 2) {
                        if (money < 300){
                            System.out.println("돈이 부족합니다.");
                            continue;
                        }

                        money -= 300;
                        awareness += 10;

                        System.out.println("광고 구입! 내 자산: " + money);
                        System.out.println("인지도 상승! 내 인지도: " + awareness);
                    }


                    if (purchasechoice == 3) {
                        if (money < 50){
                            System.out.println("돈이 부족합니다.");
                            continue;
                        }

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
                        shopping = false;
                        continue;
                    }
                }
            }

            System.out.println();
        }
    }
}
