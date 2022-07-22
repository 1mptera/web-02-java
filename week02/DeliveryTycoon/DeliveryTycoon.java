import java.util.Random;
import java.util.Scanner;

public class DeliveryTycoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] foodMenus = new String[]{"1. 햄버거", "2. 피자", "3. 치킨", "4. 커피", "5. 케이크", "6. 족발"};
        int[] foodPrices = new int[]{1, 5, 3, 1, 2, 4};
        int[] orderLists = new int[]{1, 2, 3, 4, 5, 6};
        int[] answers = new int[6];

        int date = 1;
        int money = 1000;
        int hp = 1000;
        int popularity = 0;

        String[] storeName = new String[]{"푸드 트럭", "구멍 가게", "레스토랑"};

        String currentLevel = "노점상";

        System.out.println("---------------");
        System.out.println("딜리버리 타이쿤 게임");
        System.out.println("---------------");
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 게임시작");
        System.out.println("2. 게임종료");

        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.println("주인공 이름을 입력해주세요");

            String name = scanner.next();

            boolean end = false;
            while (!end) {

                if (money > 2000 && popularity > 20) {
                    currentLevel = storeName[0];
                }
                if (money > 5000 && popularity > 50) {
                    currentLevel = storeName[1];
                }
                if (money > 8000 && popularity > 80) {
                    currentLevel = storeName[2];
                }

                System.out.println(date + "일차 " + name + "의 " + currentLevel);
                System.out.println("--------------------------------------------");
                System.out.println("체력: " + hp + ", 자산: " + money + "만원, 인지도: " + popularity);
                System.out.println("--------------------------------------------");
                System.out.println("1. 가게 오픈하기");
                System.out.println("2. 상점");
                System.out.println("3. 메뉴로 돌아가기");

                choice = scanner.nextInt();

                if (choice == 1) {
                    if (hp < 500) {
                        System.out.println("체력이 부족합니다. 체력을 보충해 주세요! 내 체력: " + hp);
                        continue;
                    }
                    int sum = 0;

                    for (int i = 0; i < 5; i += 1) {
                        int ordersPrice = 0;

                        int[] numberOfOrders = new int[]{1, 2, 3, 4, 5, 6};

                        long beforeTime = System.currentTimeMillis();

                        for (int j = 0; j < 20; j += 1) {
                            int x = random.nextInt(6);
                            int y = random.nextInt(6);
                            String temp1 = foodMenus[x];
                            foodMenus[x] = foodMenus[y];
                            foodMenus[y] = temp1;

                            int temp2 = foodPrices[x];
                            foodPrices[x] = foodPrices[y];
                            foodPrices[y] = temp2;

                            int temp3 = orderLists[x];
                            orderLists[x] = orderLists[y];
                            orderLists[y] = temp3;
                        }

                        for (int j = 0; j < 20; j += 1) {
                            int x = random.nextInt(6);
                            int y = random.nextInt(6);
                            int temp4 = numberOfOrders[x];
                            numberOfOrders[x] = numberOfOrders[y];
                            numberOfOrders[y] = temp4;
                        }

                        System.out.println("--------------------------------------------");
                        System.out.println("체력: " + hp + ", 자산: " + money + "만원, 인지도: " + popularity);
                        System.out.println("--------------------------------------------");
                        System.out.println(numberOfOrders[i] + "개의 주문이 들어 왔습니다. (10초 안에 음식을 완성해주세요.)");

                        for (int j = 0; j < numberOfOrders[i]; j += 1) {
                            System.out.println(foodMenus[j]);
                            ordersPrice += foodPrices[j];
                        }

                        for (int j = 0; j < numberOfOrders[i]; j += 1) {
                            System.out.println("음식 준비: ");
                            answers[j] = scanner.nextInt();
                            if (answers[j] != orderLists[j]) {
                                money -= ordersPrice;
                                sum -= ordersPrice;
                                System.out.println("주문이 틀렸습니다! " + ordersPrice + " 만원의 손해가 발생했습니다.");
                                System.out.println("내 자산: " + money);
                                System.out.println();
                                break;
                            }

                            if (answers[numberOfOrders[i] - 1] == orderLists[numberOfOrders[i] - 1]) {
                                long afterTime = System.currentTimeMillis();
                                long playTime = (afterTime - beforeTime) / 1000;
                                money += ordersPrice;
                                sum += ordersPrice;

                                System.out.println("음식 준비 완료! 소요시간: " + playTime);
                                System.out.println("배달완료! 수익: " + ordersPrice);
                                System.out.println();
                            }
                        }

                        long afterTime = System.currentTimeMillis();
                        long playTime = (afterTime - beforeTime) / 1000;

                        if (playTime > 10) {
                            money -= ordersPrice;
                            sum -= ordersPrice;
                            System.out.println("음식 준비 완료! 소요시간: " + playTime);
                            System.out.println("주문시간 초과했습니다! " + ordersPrice + " 만원의 손해가 발생했습니다.");
                            System.out.println();
                            continue;
                        }
                    }

                    date += 1;
                    hp -= 500;

                    System.out.println();
                    System.out.println("1일차 가게 마감!");
                    System.out.println("총 수익: " + sum);
                    System.out.println("인지도: " + popularity);
                    System.out.println("체력소모: -500");
                    System.out.println();
                    continue;
                }

                if (choice == 2) {
                    while (choice != 4) {
                        System.out.println("-----------------------");
                        System.out.println("플렉스 상점");
                        System.out.println("-----------------------");
                        System.out.println("1. 자양강장제: 체력 100 회복 -10만원");
                        System.out.println("2. 광고: 인지도 +10 -300만원");
                        System.out.println("3. 도박: 50% 확률로 자산 X 2 - 50만원");
                        System.out.println("4. 상점 나가기");

                        choice = scanner.nextInt();

                        if (choice == 1) {
                            if (money < 10) {
                                System.out.println("잔액 부족! 내 자산: " + money);
                                continue;
                            }
                            hp += 100;
                            money -= 10;
                            System.out.println("자양강장제 구입! 내 자산: " + money);
                            System.out.println("자양강장제 구입! 내 체력: " + hp);
                        }

                        if (choice == 2) {
                            if (money < 300) {
                                System.out.println("잔액 부족! 내 자산: " + money);
                                continue;
                            }
                            popularity += 10;
                            money -= 300;
                            System.out.println("광고 구입! 내 자산: " + money);
                            System.out.println("인지도 상승! 내 인지도: " + popularity);
                        }

                        if (choice == 3) {
                            if (money < 50) {
                                System.out.println("잔액 부족! 내 자산: " + money);
                                continue;
                            }
                            int gambling = random.nextInt(2);
                            boolean success = gambling == 1;
                            money -= 50;

                            System.out.println("복권 구입! 내 자산: " + money);

                            if (success) {
                                money *= 2;
                                System.out.println("도박 성공! 내 자산: " + money);
                            }
                            if (!success) {
                                System.out.println("도박 실패! 내 자산: " + money);
                            }
                        }
                    }
                    continue;
                }

                if (choice == 3) {
                    System.out.println();
                    System.out.println("메뉴를 선택해주세요");
                    System.out.println("1. 게임시작");
                    System.out.println("2. 게임종료");

                    choice = scanner.nextInt();

                    if (choice == 1) {
                        date = 1;
                        money = 1000;
                        hp = 1000;
                        popularity = 0;

                        System.out.println();
                        System.out.println("주인공 이름을 입력해주세요");

                        name = scanner.next();
                        continue;
                    }

                    if (choice == 2) {
                        end = true;
                        continue;
                    }
                }
            }
        }
    }
}
