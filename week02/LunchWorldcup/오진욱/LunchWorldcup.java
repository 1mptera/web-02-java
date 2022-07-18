import java.util.Scanner;

public class LunchWorldcup {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        String[] foodDB = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥", "라멘", "쌀국수", "곰탕", "국밥", "파타이", "텐동", "제육볶음", "쭈꾸미", "볶음", "부대찌개", "김치찌개", "우동", "냉면", "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

        int selectFood = 0;

        System.out.println("-----------------");
        System.out.println("점심 메뉴 월드컵 16강");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("선호하는 메뉴를 번호로 선택해주세요");
        System.out.println("");

        for (int i = 0; i < foodDB.length; i += 1) {
            for (int j = 0; j < 2; j += 1) {
                selectFood = scanner.nextInt();

            }
        }
        //입력
        //처리
        //출력
    }
}
