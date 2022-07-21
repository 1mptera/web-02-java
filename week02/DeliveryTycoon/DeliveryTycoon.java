import java.util.Random;
import java.util.Scanner;

public class DeliveryTycoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] foodMenu = new String[]{"1. 햄버거", "2. 피자", "3. 치킨", "4. 커피", "5. 케이크", "6. 족발"};
        int[] foodPrice = new int[]{1, 5, 3, 1, 2, 4};
        int[] select = new int[]{1, 2, 3, 4, 5, 6};

        int date = 0;
        int money = 1000;
        int hp = 1000;
        int popularity = 0;
        int ordersPrice = 0;

        String[] storeName = new String[]{"노점상", "푸드 트럭", "구멍 가게", "레스토랑"};
        String currentLevel = "";

        System.out.println("---------------");
        System.out.println("딜리버리 타이쿤 게임");
        System.out.println("---------------");
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 게임시작");
        System.out.println("2. 게임종료");

        int choose = scanner.nextInt();

        System.out.println("주인공 이름을 입력해주세요");

        String name = scanner.next();


        while (true) {
            date += 1;

            currentLevel = storeName[0];
            if (money > 2000 && popularity > 20) {
                currentLevel = storeName[1];
            }
            if (money > 5000 && popularity > 50) {
                currentLevel = storeName[2];
            }
            if (money > 8000 && popularity > 80) {
                currentLevel = storeName[3];
            }

            System.out.println(date + "일차 " + name + "의 " + currentLevel);
            System.out.println("--------------------------------------------");
            System.out.println("체력: " + hp + ", 자산: " + money + "만원, 인지도: " + popularity);
            System.out.println("--------------------------------------------");
            System.out.println("1. 가게 오픈하기");
            System.out.println("2. 상점");
            System.out.println("3. 메뉴로 돌아가기");
            choose = scanner.nextInt();

            if (choose == 1) {
                for (int i = 0; i < 5; i += 1) {

                    int[] numberOfOrders = new int[]{1, 2, 3, 4, 5, 6};

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

                    for (int j = 0; j < 20; j += 1) {
                        int x = random.nextInt(6);
                        int y = random.nextInt(6);
                        String temp1 = foodMenu[x];
                        foodMenu[x] = foodMenu[y];
                        foodMenu[y] = temp1;
                        int temp2 = foodPrice[x];
                        foodPrice[x] = foodPrice[y];
                        foodPrice[y] = temp2;
                        int temp3 = select[x];
                        select[x] = select[y];
                        select[y] = temp3;
                    }


                    for (int j = 0; j < numberOfOrders[i]; j += 1) {
                        System.out.println(foodMenu[j]);
                        ordersPrice += foodPrice[j];
                    }

                    for (int j = 0; j < numberOfOrders[i]; j += 1) {
                        System.out.println("음식 준비: ");
                        choose = scanner.nextInt();

                        if (choose != select[j]) {
                            money -= ordersPrice;
                            System.out.println("주문이 틀렸습니다! " + ordersPrice + " 만원의 손해가 발생했습니다.");
                            System.out.println("내 자산: " + money);
                            System.out.println();
                            break;
                        }
                    }
                    money += ordersPrice;
                    System.out.println("음식 준비 완료! 소요시간: ");
                    System.out.println("배달완료! 수익: " + ordersPrice);
                    System.out.println();
                }
            }


            if (choose == 2) {
                while (choose != 4) {
                    System.out.println("-----------------------");
                    System.out.println("플렉스 상점");
                    System.out.println("-----------------------");
                    System.out.println("1. 자양강장제: 체력 100 회복 -10만원");
                    System.out.println("2. 광고: 인지도 +10 -300만원");
                    System.out.println("3. 도박: 50% 확률로 자산 X 2 - 50만원");
                    System.out.println("4. 상점 나가기");

                    choose = scanner.nextInt();

                    if (choose == 1) {
                        hp += 100;
                        money -= 10;
                        System.out.println("자양강장제 구입! 내 자산: " + money);
                        System.out.println("자양강장제 구입! 내 체력: " + hp);
                        continue;
                    }

                    if (choose == 2) {
                        popularity += 10;
                        money -= 300;
                        System.out.println("광고 구입! 내 자산: " + money);
                        System.out.println("인지도 상승! 내 인지도: " + popularity);
                        continue;
                    }

                    if (choose == 3) {
                        int gambling = random.nextInt(2);
                        boolean succes = gambling == 1;
                        money -= 50;

                        System.out.println("복권 구입! 내 자산: " + money);

                        if (succes) {
                            money *= 2;
                            System.out.println("도박 성공! 내 자산: " + money);
                        }
                        if (!succes) {
                            System.out.println("도박 실패! 내 자산: " + money);
                        }
                        date += 1;
                        continue;
                    }
                }
            }

            if (choose == 3) {
                System.out.println("메뉴를 선택해주세요");
                System.out.println("1. 게임시작");
                System.out.println("2. 게임종료");

                choose = scanner.nextInt();
                if (choose == 1) {
                    date = 1;
                    System.out.println("주인공 이름을 입력해주세요");

                    name = scanner.next();
                    continue;
                }
                if (choose == 2) {
                    break;
                }

            }
        }
    }
}
