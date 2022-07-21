import java.util.Random;
import java.util.Scanner;

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
        int deliveryFee = 0;
        int totalGet = 0;

        long time = 0;
        boolean fail = false;

        boolean exit = false;
        boolean playing = false;
        boolean shop = false;

        String shortDash = "---------------";
        String longDash = "---------------------------------";

        String[] menus = new String[]{"1. 햄버거", "2. 피자", "3. 치킨", "4. 커피", "5. 케이크", "6. 족발"};
        int[] foodPrices = new int[]{1, 5, 3, 1, 2, 4};

        String[] stores = new String[]{"노점상", "푸드 트럭", "구멍가게", "레스토랑"};
        String level = "";

        int[] orders = new int[]{1, 2, 3, 4, 5, 6};

        while (!exit) {
            day = 1;
            hp = 1000;
            money = 1000;
            fame = 0;

            playing = false;

            //입력
            System.out.println(shortDash);
            System.out.println("딜리버리 타이쿤 게임");
            System.out.println(shortDash);

            System.out.println("메뉴를 선택해주세요");
            System.out.println("1. 게임시작");
            System.out.println("2. 게임종료");

            int select = scanner.nextInt();

            if (select == 2) {
                exit = true;
            }

            if (select == 1) {
                System.out.println("이름을 입력해주세요 : ");

                scanner.nextLine();
                name = scanner.nextLine();

                while (!playing) {
                    shop = false;

                    if (money <= 2000 && fame <= 20) {
                        level = stores[0];
                    }
                    if (money > 2000 && fame > 20) {
                        level = stores[1];
                    }
                    if (money > 5000 && fame > 50) {
                        level = stores[2];
                    }
                    if (money > 8000 && fame > 80) {
                        level = stores[3];
                    }

                    System.out.println(day + "일차 " + name + "의 " + level);
                    System.out.println(longDash);
                    System.out.println("체력 : " + hp + ", 자산 : " + money + "원, 인지도: " + fame);
                    System.out.println(longDash);

                    System.out.println("1. 가게 오픈하기");
                    System.out.println("2. 상점");
                    System.out.println("3. 메뉴로 돌아가기");

                    select = scanner.nextInt();

                    if (select != 1 && select !=2 && select != 3){
                        System.out.println("다시 선택해 주세요.");
                        continue;
                    }

                    if (select == 3) {
                        playing = true;
                        continue;
                    }

                    if (select == 1) {
                        if (hp < 500) {
                            System.out.println("체력이 부족합니다. 체력을 보충해주세요! 내 체력: " + hp);
                            System.out.println();
                            continue;
                        }

                        for (int i = 0; i < 20; i += 1) {
                            int x = random.nextInt(orders.length);
                            int y = random.nextInt(orders.length);
                            int temp = orders[x];

                            orders[x] = orders[y];
                            orders[y] = temp;
                        }

                        totalGet = 0;

                        for (int i = 0; i < 5; i += 1) {
                            for (int j = 0; j <= 20; j += 1) {
                                int x = random.nextInt(6);
                                int y = random.nextInt(6);

                                String tempMenu = menus[x];
                                menus[x] = menus[y];
                                menus[y] = tempMenu;

                                int tempPrice = foodPrices[x];
                                foodPrices[x] = foodPrices[y];
                                foodPrices[y] = tempPrice;
                            }

                            deliveryFee = 0;
                            fail = false;

                            long start = System.currentTimeMillis();
                            int order = orders[i];

                            System.out.println(longDash);
                            System.out.println("체력 : " + hp + ", 자산 : " + money + "만 원, 인지도: " + fame);
                            System.out.println(longDash);

                            System.out.println(order + "개의 음식주문이 들어왔습니다. (10초안에 음식을 완성해주세요!)");

                            for (int j = 0; j < order; j += 1) {           //TODO : 나중에 리팩터링
                                System.out.println(menus[j]);

                                deliveryFee += foodPrices[j];
                            }

                            for (int j = 0; j < order; j += 1) {
                                int current = Integer.parseInt(menus[j].substring(0, 1));

                                System.out.println("음식준비:");

                                select = scanner.nextInt();
                                if (select != current) {
                                    fail = true;
                                    break;
                                }
                            }

                            time = (System.currentTimeMillis() - start) / 1000;

                            if (fail == true) {
                                totalGet -= deliveryFee;
                                money -= deliveryFee;

                                System.out.println("주문이 틀렸습니다! " + deliveryFee + "만원의 손해가 발생했습니다.");

                                System.out.println("내 자산: " + money);
                            }

                            if (fail == false) {
                                System.out.println("음식 준비 완료! 소요시간: " + time);

                                if (time > 10) {
                                    totalGet -= deliveryFee;
                                    money -= deliveryFee;
                                    fame -= 1;

                                    System.out.println("주문 시간이 초과했습니다! " + deliveryFee + " 만원의 손해가 발생했습니다.");

                                    System.out.println("내 자산: " + money);
                                    continue;
                                }

                                totalGet += deliveryFee;
                                money += deliveryFee;
                                fame += 1;
                                System.out.println("배달완료! 수익: " + deliveryFee + " 만원");
                            }
                            System.out.println();

                        }
                        System.out.println(day + "일차 가게 마감!");
                        System.out.println("총 수익: " + totalGet + "만 원");
                        System.out.println("인지도: " + fame);
                        System.out.println("체력소모: -500");
                        System.out.println();

                        day += 1;
                        hp -= 500;
                        continue;
                    }

                    if (select == 2) {
                        String[] item = new String[]{"자양강장제", "광고", "도박"};

                        while (!shop) {
                            System.out.println(shortDash);
                            System.out.println("플렉스 상점");
                            System.out.println(shortDash);
                            System.out.println("1. "+ item[0] + ": 체력 100 회 - 10만원");
                            System.out.println("2. "+ item[1] + ": 인지도 +10 -300만원");
                            System.out.println("3. "+ item[2] + ": 50%확률로 자산 X 2 - 50만원");
                            System.out.println("4. 상점 나가기");

                            select = scanner.nextInt();

                            if (select != 1 && select != 2 && select != 3 && select != 4) {
                                System.out.println("1, 2, 3, 4번 중에 골라 주세요!");
                                continue;
                            }

                            if (select == 4) {
                                shop = true;
                                continue;
                            }

                            if (select == 1) {
                                money -= 10;
                                hp += 100;

                                System.out.println(item[0] +" 구입! 내 자산: " + money);
                                System.out.println("체력 회복! 내 체력: " + hp);
                                continue;
                            }

                            if (select == 2) {
                                money -= 300;
                                fame += 10;

                                System.out.println(item[1] + " 구입! 내 자산: " + money);
                                System.out.println("인지도 상승! 내 인지도: " + fame);
                            }

                            if (select == 3) {
                                money -= 50;

                                System.out.println(item[2] + " 구입! 내 자산: " + money);
                                int gamble = random.nextInt(10);

                                if (gamble < 5) {
                                    money *= 2;

                                    System.out.println("도박 성공! 내 자산: " + money);
                                    continue;
                                }

                                System.out.println("도박 실패! 내 자산: " + money);
                            }
                        }
                    }
                }
            }
        }
    }
}
