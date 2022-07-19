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
    public static void main(String[] args){
        //준비
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        String shortDash = "---------------";
        String longDash = "---------------------------------";

       while(exit){
           //입력
           System.out.println(shortDash);
           System.out.println("딜리버리 타이쿤 게임");
           System.out.println(shortDash);

           System.out.println("메뉴를 선택해주세요");
           System.out.println("1. 게임시작");
           System.out.println("2. 게임종료");

           int onOff = scanner.nextInt();

           if (onOff == 2){
               exit = false;
           }




           //처리
           //출력
       }
    }
}
