import java.util.Scanner;

public class LaunchWorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점심 월드컵!");
        System.out.println("-------카테고리 선택-------");
        System.out.println("1. 중식\n2. 일식\n3. 한식\n4. 양식");

        int option = scanner.nextInt();
        //중식
        if (option == 1) {
            System.out.println("1. 짜장 vs 2. 짬뽕");

            int option1 = scanner.nextInt();

            System.out.println("1. 볶음밥 vs 2. 잡채밥");

            int option2 = scanner.nextInt();

            if (option1 == 1 && option2 == 1) {
                System.out.println("1. 짜장 vs 2. 볶음밥");
                int result1 = scanner.nextInt();

                if (result1 == 1) {
                    System.out.println("오늘의 점심은 짜장입니다!");
                }
                if (result1 == 2) {
                    System.out.println("오늘의 점심은 볶음밥입니다!");
                }
            }
            if (option1 == 1 && option2 == 2) {
                System.out.println("1. 짜장 vs 2. 잡채밥");
                int result2 = scanner.nextInt();

                if (result2 == 1) {
                    System.out.println("오늘의 점심은 짜장입니다!");
                }
                if (result2 == 2) {
                    System.out.println("오늘의 점심은 잡채밥입니다!");
                }
            }
            if (option1 == 2 && option2 == 1) {
                System.out.println("1. 짬뽕 vs 2. 볶음밥");
                int result3 = scanner.nextInt();

                if (result3 == 1) {
                    System.out.println("오늘의 점심은 짬뽕입니다!");
                }
                if (result3 == 2) {
                    System.out.println("오늘의 점심은 볶음밥입니다!");
                }
            }
            if (option1 == 2 && option2 == 2) {
                System.out.println("1. 짬뽕 vs 2. 잡채밥");
                int result4 = scanner.nextInt();

                if (result4 == 1) {
                    System.out.println("오늘의 점심은 짬뽕입니다!");
                }
                if (result4 == 2) {
                    System.out.println("오늘의 점심은 잡채밥입니다!");
                }
            }
        }

        //일식
        if (option == 2) {
            System.out.println("1. 스시 vs 2. 덴뿌라");

            int option1 = scanner.nextInt();

            System.out.println("1. 우동 vs 2. 돈까스");

            int option2 = scanner.nextInt();

            if (option1 == 1 && option2 == 1) {
                System.out.println("1. 스시 vs 2. 우동");
                int result1 = scanner.nextInt();

                if (result1 == 1) {
                    System.out.println("오늘의 점심은 스시입니다!");
                }
                if (result1 == 2) {
                    System.out.println("오늘의 점심은 우동입니다!");
                }
            }
            if (option1 == 1 && option2 == 2) {
                System.out.println("1. 스시 vs 2. 돈까스");
                int result2 = scanner.nextInt();

                if (result2 == 1) {
                    System.out.println("오늘의 점심은 스시입니다!");
                }
                if (result2 == 2) {
                    System.out.println("오늘의 점심은 돈까스입니다!");
                }
            }
            if (option1 == 2 && option2 == 1) {
                System.out.println("1. 덴뿌라 vs 2. 우동");
                int result3 = scanner.nextInt();

                if (result3 == 1) {
                    System.out.println("오늘의 점심은 덴뿌라입니다!");
                }
                if (result3 == 2) {
                    System.out.println("오늘의 점심은 우동입니다!");
                }
            }
            if (option1 == 2 && option2 == 2) {
                System.out.println("1. 덴뿌라 vs 2. 돈까스");
                int result4 = scanner.nextInt();

                if (result4 == 1) {
                    System.out.println("오늘의 점심은 덴뿌라입니다!");
                }
                if (result4 == 2) {
                    System.out.println("오늘의 점심은 돈까스입니다!");
                }
            }
        }
        //양식
        if (option == 4) {
            System.out.println("1. 파스타 vs 2. 리조또");

            int option1 = scanner.nextInt();

            System.out.println("1. 스테이크 vs 2. 피자");

            int option2 = scanner.nextInt();

            if (option1 == 1 && option2 == 1) {
                System.out.println("1. 파스타 vs 2. 스테이크");
                int result1 = scanner.nextInt();

                if (result1 == 1) {
                    System.out.println("오늘의 점심은 파스타입니다!");
                }
                if (result1 == 2) {
                    System.out.println("오늘의 점심은 스테이크입니다!");
                }
            }
            if (option1 == 1 && option2 == 2) {
                System.out.println("1. 파스타 vs 2. 파자");
                int result2 = scanner.nextInt();

                if (result2 == 1) {
                    System.out.println("오늘의 점심은 파스타입니다!");
                }
                if (result2 == 2) {
                    System.out.println("오늘의 점심은 파자입니다!");
                }
            }
            if (option1 == 2 && option2 == 1) {
                System.out.println("1. 리조또 vs 2. 스테이크");
                int result3 = scanner.nextInt();

                if (result3 == 1) {
                    System.out.println("오늘의 점심은 리조또입니다!");
                }
                if (result3 == 2) {
                    System.out.println("오늘의 점심은 스테이크입니다!");
                }
            }
            if (option1 == 2 && option2 == 2) {
                System.out.println("1. 리조또 vs 2. 파자");
                int result4 = scanner.nextInt();

                if (result4 == 1) {
                    System.out.println("오늘의 점심은 리조또입니다!");
                }
                if (result4 == 2) {
                    System.out.println("오늘의 점심은 파자입니다!");
                }
            }
        }
        //한식
        if (option == 3) {
            System.out.println("한식은 선택지가 없습니다.\n 오늘의 점심은 제욱볶음입니다.");
        }

    }
}
