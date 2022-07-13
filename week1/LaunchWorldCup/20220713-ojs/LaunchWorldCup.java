import java.util.Scanner;

public class LaunchWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //점심 월드컵 시즈악!
        System.out.println("점심 월드컵!\n-------카테고리 선택-------");
        System.out.println("1. 중식\n2. 일식\n3. 한식\n4. 양식");

        //너의 선택은?
        int answer1 = scanner.nextInt();

        //중식
        if (answer1 == 1) {
            System.out.println("1.짜장 vs 2.짬뽕");
            int answer2 = scanner.nextInt();
            System.out.println("1.볶음밥 vs 2.잡채밥");
            int answer3 = scanner.nextInt();
            if (answer2 == 1 && answer3 == 1) {
                System.out.println("1.짜장 vs 2.볶음밥");
            }
            if (answer2 == 2 && answer3 == 1) {
                System.out.println("1.짬뽕 vs 2.볶음밥");
            }
            if (answer2 == 1 && answer3 == 2) {
                System.out.println("1.짜장 vs 2.잡채밥");
            }
            if (answer2 == 2 && answer3 == 2) {
                System.out.println("1.짬뽕 vs 2.잡채밥");
            }
            int answer4 = scanner.nextInt();

            //점심결정!!
            if ((answer2 == 1 && answer3 == 1 && answer4 == 1) || (answer2 == 1 && answer3 == 2 && answer4 == 1)) {
                System.out.println("오늘의 점심은 짜장입니다!");
            }
            if ((answer2 == 2 && answer3 == 1 && answer4 == 1) || (answer2 == 2 && answer3 == 2 && answer4 == 1)) {
                System.out.println("오늘의 점심은 짬뽕입니다!");
            }
            if ((answer2 == 1 && answer3 == 1 && answer4 == 2) || (answer2 == 2 && answer3 == 1 && answer4 == 2)) {
                System.out.println("오늘의 점심은 볶음밥입니다!");
            }
            if ((answer2 == 1 && answer3 == 2 && answer4 == 2) || (answer2 == 2 && answer3 == 2 && answer4 == 2)) {
                System.out.println("오늘의 점심은 잡채밥입니다!");
            }
        }

        //일식
        if (answer1 == 2) {
            System.out.println("1.스시 vs 2.덴뿌라");
            int answer2 = scanner.nextInt();
            System.out.println("1.우동 vs 2.돈까스");
            int answer3 = scanner.nextInt();
            if (answer2 == 1 && answer3 == 1) {
                System.out.println("1.스시 vs 2.우동");
            }
            if (answer2 == 2 && answer3 == 1) {
                System.out.println("1.덴뿌라 vs 2.우동");
            }
            if (answer2 == 1 && answer3 == 2) {
                System.out.println("1.스시 vs 2.돈까스");
            }
            if (answer2 == 2 && answer3 == 2) {
                System.out.println("1.덴뿌라 vs 2.돈까스");
            }
            int answer4 = scanner.nextInt();

            //점심 결정!!
            if ((answer2 == 1 && answer3 == 1 && answer4 == 1) || (answer2 == 1 && answer3 == 2 && answer4 == 1)) {
                System.out.println("오늘의 점심은 스시입니다!");
            }
            if ((answer2 == 2 && answer3 == 1 && answer4 == 1) || (answer2 == 2 && answer3 == 2 && answer4 == 1)) {
                System.out.println("오늘의 점심은 덴뿌라입니다!");
            }
            if ((answer2 == 1 && answer3 == 1 && answer4 == 2) || (answer2 == 2 && answer3 == 1 && answer4 == 2)) {
                System.out.println("오늘의 점심은 우동입니다!");
            }
            if ((answer2 == 1 && answer3 == 2 && answer4 == 2) || (answer2 == 2 && answer3 == 2 && answer4 == 2)) {
                System.out.println("오늘의 점심은 돈까스입니다!");
            }
        }

        //한식
        if (answer1 == 3){

            //한식은 제육볶음!!
            System.out.println("한식은 선택지가 없습니다!\n오늘의 점심은 제육볶음입니다!");
        }

        //양식
        if (answer1 == 4) {
            System.out.println("1.파스타 vs 2.리조또");
            int answer2 = scanner.nextInt();
            System.out.println("1.스테이크 vs 2.피자");
            int answer3 = scanner.nextInt();
            if (answer2 == 1 && answer3 == 1) {
                System.out.println("1.파스타 vs 2.스테이크");
            }
            if (answer2 == 2 && answer3 == 1) {
                System.out.println("1.리조또 vs 2.스테이크");
            }
            if (answer2 == 1 && answer3 == 2) {
                System.out.println("1.파스타 vs 2.피자");
            }
            if (answer2 == 2 && answer3 == 2) {
                System.out.println("1.리조또 vs 2.피자");
            }
            int answer4 = scanner.nextInt();

            //점심 결정!!
            if ((answer2 == 1 && answer3 == 1 && answer4 == 1) || (answer2 == 1 && answer3 == 2 && answer4 == 1)) {
                System.out.println("오늘의 점심은 파스타입니다!");
            }
            if ((answer2 == 2 && answer3 == 1 && answer4 == 1) || (answer2 == 2 && answer3 == 2 && answer4 == 1)) {
                System.out.println("오늘의 점심은 리조또입니다!");
            }
            if ((answer2 == 1 && answer3 == 1 && answer4 == 2) || (answer2 == 2 && answer3 == 1 && answer4 == 2)) {
                System.out.println("오늘의 점심은 스테이크입니다!");
            }
            if ((answer2 == 1 && answer3 == 2 && answer4 == 2) || (answer2 == 2 && answer3 == 2 && answer4 == 2)) {
                System.out.println("오늘의 점심은 피자입니다!");
            }
        }
    }
}
