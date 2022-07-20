import java.util.Scanner;

public class DeliveryTycoon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String shortdash = "---------------";
        System.out.println(shortdash);
        System.out.println("딜리버리 타이쿤 게임");
        System.out.println(shortdash);

        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 게임시작");
        System.out.println("2. 게임종료");

        int mainmenu = scanner.nextInt();
        int option = scanner.nextInt();
        int day = 1;
        int health = 1000;
        int money = 1000;
        int awareness = 0;
        String dash = "------------------------------------------";
        String status = "체력: " + health + ", 자산: " + money + "만원, 인지도: " + awareness;

        System.out.println("주인공 이름을 입력해주세요");

        String name = scanner.nextLine();

        System.out.println(day + "일차 " + name + "의 노점상");
        System.out.println(dash);
        System.out.println(status);
        System.out.println(dash);
        System.out.println("1. 가게 오픈하기");
        System.out.println("2. 상점");
        System.out.println("3. 메뉴로 돌아가기");

        option = scanner.nextInt();

        if (option == 1){
            System.out.println(dash);
            System.out.println(status);
            System.out.println(dash);

            health -= 500;
        }

        if (option == 2){
            System.out.println(shortdash);
            System.out.println("플렉스 상점");
            System.out.println(shortdash);
            System.out.println("1. 자양강장제: 체력 100회복 - 10 만원");
            System.out.println("2. 광고: 인지도 +10 - 300 만원");
            System.out.println("3. 도박: 50% 확률로 자산 X 2 - 50 만원");
            System.out.println("4. 상점 나가기");

        }

        if (option == 3) {

        }
        System.out.println("");


    }
}
