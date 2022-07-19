import java.util.Scanner;

public class LunchWorldcup {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        String[] round16 = new String[]{"피자", "햄버거", "돈까스", "카레", "짜장면", "탄탄면", "떡볶이", "파스타", "연어덮밥", "초밥",
                "라멘", "쌀국수", "곰탕", "국밥", "파타이", "텐동", "제육볶음", "쭈꾸미 볶음", "부대찌개", "김치찌개", "우동", "냉면",
                "냉모밀", "국수", "생선구이", "육회비빔밥", "물회국수", "뼈해장국", "닭갈비", "마라탕", "샌드위치", "타코"};

        String[] round8 = new String[16];
        String[] round4 = new String[8];
        String[] semiFinalRound = new String[4];
        String[] finalRound = new String[2];
        String winner = "";

        int[] roundLength = new int[]{round16.length, round8.length, round4.length, semiFinalRound.length, finalRound.length};

        boolean firstOption = true;
        boolean secondOption = true;
        boolean isNot1or2 = false;

        int selectFood = 0;

        for (int i = 0; i < roundLength.length; i += 1) {
            String[] round = new String[roundLength[i]];
            String[] nextRound = new String[roundLength[i] / 2];

            for (int j = 0; j < round.length; j += 1) {
                if (i == 0) {
                    round[j] = round16[j];
                }
                if (i == 1) {
                    round[j] = round8[j];
                }
                if (i == 2) {
                    round[j] = round4[j];
                }
                if (i == 3) {
                    round[j] = semiFinalRound[j];
                }
                if (i == 4) {
                    round[j] = finalRound[j];
                }
            }

            System.out.println("");
            System.out.println("-----------------");
            System.out.println("점심 메뉴 월드컵 " + roundLength[i] + "강");
            System.out.println("-----------------");
            System.out.println("");
            System.out.println("선호하는 메뉴를 번호로 선택해주세요");
            System.out.println("");

            for (int j = 0; j < roundLength[i]; j += 2) {
                for (int k = 0; k < 2; k += 1) {
                    System.out.println((k + 1) + ". " + round[j + k]);
                }

                selectFood = scanner.nextInt();
                firstOption = selectFood == 1;
                secondOption = selectFood == 2;

                if (!firstOption && !secondOption) {
                    System.out.println("1번과 2번중에 입력해주세요!");

                    isNot1or2 = true;

                    j -= 2;
                    continue;
                }

                if (firstOption) {
                    nextRound[j / 2] = round[j];
                }

                if (secondOption) {
                    nextRound[j / 2] = round[j + 1];
                }
                winner = nextRound[0];
            }

            for (int j = 0; j < nextRound.length; j +=1){
                if (i == 0){
                    round8[j] = nextRound[j];
                }
                if (i == 1){
                    round4[j] = nextRound[j];
                }
                if (i == 2){
                    semiFinalRound[j] = nextRound[j];
                }
                if (i == 3){
                    finalRound[j] = nextRound[j];
                }
                if (i ==4 ){
                    winner = nextRound[j];
                }
            }
        }

        System.out.println("오늘의 점심은 " + winner + " 입니다.");
    }
}
