import java.util.Scanner;

public class Comzalral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("컴잘알 테스트!!");
        //문제1
        System.out.println("\n------------ 문제 1 ------------");
        System.out.println("cpu 는 무엇의 줄임날 일까요?");
        System.out.println("정답 입력: ");

        String input1 = scanner.nextLine();
        String answer1 = "centralprocessingunit";

        if (input1.replaceAll(" ", "").equalsIgnoreCase(answer1)) {

            count = count + 1;

            System.out.println("정답입니다. 점수: " + count + "점");
        }
        if (input1.replaceAll(" ", "").equalsIgnoreCase(answer1)) {

            System.out.println("틀렸습니다. 정답: " + answer1);
        }
        //문제2
        System.out.println("\n------------ 문제 2 ------------");
        System.out.println("RAM 는 무엇의 줄임말 일까요?");
        System.out.println("정답 입력: ");

        String input2 = scanner.nextLine();
        String answer2 = "randomaccessmemory";

        if (input2.replaceAll(" ", "").equalsIgnoreCase(answer2)) {

            count = count + 1;

            System.out.println("정답입니다. 점수: " + count + "점");
        }
        if (!input2.replaceAll(" ", "").equalsIgnoreCase(answer2)) {

            System.out.println("틀렸습니다. 정답: " + answer2);
        }
        //문제3
        System.out.println("\n------------ 문제 3 ------------");
        System.out.println("SSD 는 무엇의 줄임날 일까요?");
        System.out.println("정답 입력: ");

        String input3 = scanner.nextLine();
        String answer3 = "solidstatedisk";

        if ((input3.replaceAll(" ", "").equalsIgnoreCase(answer3))) {

            count = count + 1;

            System.out.println("정답입니다. 점수: " + count + "점");

        }
        if ((!input3.replaceAll(" ", "").equalsIgnoreCase(answer3))) {

            System.out.println("틀렸습니다. 정답: " + answer3);

        }
        //문제4
        System.out.println("\n------------ 문제 4 ------------");
        System.out.println("HDD 는 무엇의 줄임날 일까요?");
        System.out.println("정답 입력: ");

        String input4 = scanner.nextLine();
        String answer4 = "harddiskdrive";

        if ((input4.replaceAll(" ", "").equalsIgnoreCase(answer4))) {

            count = count + 1;

            System.out.println("정답입니다. 점수: " + count + "점");

        }
        if ((!input4.replaceAll(" ", "").equalsIgnoreCase(answer4))) {

            System.out.println("틀렸습니다. 정답: " + answer4);

        }
        //문제5
        System.out.println("\n------------ 문제 5 ------------");
        System.out.println("API 는 무엇의 줄임날 일까요?");
        System.out.println("정답 입력: ");

        String input5 = scanner.nextLine();
        String answer5 = "applicationprogramminginterface";

        if ((input5.replaceAll(" ", "").equalsIgnoreCase(answer5))) {

            count = count + 1;

            System.out.println("정답입니다. 점수: " + count + "점");

        }
        if ((!input5.replaceAll(" ", "").equalsIgnoreCase(answer5))) {
            //문제6
            System.out.println("\n------------ 문제 6 ------------");
            System.out.println("GitHub에서 사용하는 PR 무엇의 줄임날 일까요?");
            System.out.println("정답 입력: ");

            String input6 = scanner.nextLine();
            String answer6 = "pullrequest";

            if ((input6.replaceAll(" ", "").equalsIgnoreCase(answer6))) {

                count = count + 1;

                System.out.println("정답입니다. 점수: " + count + "점");

            }
            if ((!input6.replaceAll(" ", "").equalsIgnoreCase(answer6))) {

                System.out.println("틀렸습니다. 정답: " + answer6);

            }
            //문제7
            System.out.println("\n------------ 문제 7 ------------");
            System.out.println("java -cp 명령어세서 cp 는 무엇의 줄임날 일까요?");
            System.out.println("정답 입력: ");

            String input7 = scanner.nextLine();
            String answer7 = "classpath";

            if ((input7.replaceAll(" ", "").equalsIgnoreCase(answer7))) {

                count = count + 1;

                System.out.println("정답입니다. 점수: " + count + "점");

            }
            if ((!input7.replaceAll(" ", "").equalsIgnoreCase(answer7))) {

                System.out.println("틀렸습니다. 정답: " + answer7);

            }
            //문제8
            System.out.println("\n------------ 문제 8 ------------");
            System.out.println("javac -d 명령어세서 d 는 무엇의 줄임날 일까요?");
            System.out.println("정답 입력: ");

            String input8 = scanner.nextLine();
            String answer8 = "directory";

            if ((input8.replaceAll(" ", "").equalsIgnoreCase(answer8))) {

                count = count + 1;

                System.out.println("정답입니다. 점수: " + count + "점");

            }
            if ((!input8.replaceAll(" ", "").equalsIgnoreCase(answer8))) {

                System.out.println("틀렸습니다. 정답: " + answer8);

            }
            //문제9
            System.out.println("\n------------ 문제 9 ------------");
            System.out.println("저장장치의 단위인 MB 는 무엇의 줄임날 일까요?");
            System.out.println("정답 입력: ");

            String input9 = scanner.nextLine();
            String answer9 = "megabyte";

            if ((input9.replaceAll(" ", "").equalsIgnoreCase(answer9))) {

                count = count + 1;

                System.out.println("정답입니다. 점수: " + count + "점");

            }
            if ((!input9.replaceAll(" ", "").equalsIgnoreCase(answer9))) {

                System.out.println("틀렸습니다. 정답: " + answer9);

            }
            //문제10
            System.out.println("\n------------ 문제 10 ------------");
            System.out.println("JVM 은 무엇의 줄임날 일까요?");
            System.out.println("정답 입력: ");

            String input10 = scanner.nextLine();
            String answer10 = "javavirtualmachine";

            if ((input10.replaceAll(" ", "").equalsIgnoreCase(answer10))) {

                count = count + 1;

                System.out.println("정답입니다. 점수: " + count + "점");

            }
            if ((!input10.replaceAll(" ", "").equalsIgnoreCase(answer10))) {

                System.out.println("틀렸습니다. 정답: " + answer10);

            }

            //총 점수
            System.out.println("\n------------ 최종 결과 ------------");
            System.out.println("최종 점수: " + count + "점");

            if (8 < count) {
                System.out.println("컴잘알 이시군요. 완벽해요!");
            }
            if (5 < count && count < 9) {
                System.out.println("잘하고 있어요!");
            }
            if (2 < count && count < 6) {
                System.out.println("조금만 더 노력해주세요!");
            }
            if (count < 3) {
                System.out.println("컴알못이네요. 분발해주세요!");
            }


        }
    }
}