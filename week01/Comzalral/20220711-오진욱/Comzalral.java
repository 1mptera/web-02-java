import java.util.Scanner;

public class Comzalral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctCounter = 0;

        String modelAnswer1 = "central processing unit";
        String modelAnswer2 = "random access memory";
        String modelAnswer3 = "solid state disk";
        String modelAnswer4 = "hard disk drive";
        String modelAnswer5 = "application programming interface";
        String modelAnswer6 = "pull request";
        String modelAnswer7 = "classpath";
        String modelAnswer8 = "directory";
        String modelAnswer9 = "megabyte";
        String modelAnswer10 = "java virtual machine";


        System.out.println("컴잘알 테스트!!");





        System.out.println("------------ 문제 1 -------------");
        System.out.println("CPU는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer1 = scanner.nextLine();


        if (yourAnswer1.replaceAll(" ","").equalsIgnoreCase(modelAnswer1.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }


        if (!yourAnswer1.replaceAll(" ","").equalsIgnoreCase(modelAnswer1.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer1);
        }

        System.out.println("------------ 문제 2 -------------");
        System.out.println("RAM는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer2 = scanner.nextLine();
        if (yourAnswer2.replaceAll(" ","").equalsIgnoreCase(modelAnswer2.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer2.replaceAll(" ","").equalsIgnoreCase(modelAnswer2.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer2);
        }

        System.out.println("------------ 문제 3 -------------");
        System.out.println("SSD는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer3 = scanner.nextLine();
        if (yourAnswer3.replaceAll(" ","").equalsIgnoreCase(modelAnswer3.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer3.replaceAll(" ","").equalsIgnoreCase(modelAnswer3.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer3);
        }

        System.out.println("------------ 문제 4 -------------");
        System.out.println("HDD는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer4 = scanner.nextLine();
        if (yourAnswer4.replaceAll(" ","").equalsIgnoreCase(modelAnswer4.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer4.replaceAll(" ","").equalsIgnoreCase(modelAnswer4.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer4);
        }

        System.out.println("------------ 문제 5 -------------");
        System.out.println("API는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer5 = scanner.nextLine();
        if (yourAnswer5.replaceAll(" ","").equalsIgnoreCase(modelAnswer5.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer5.replaceAll(" ","").equalsIgnoreCase(modelAnswer5.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer5);
        }

        System.out.println("------------ 문제 6 -------------");
        System.out.println("PR는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer6 = scanner.nextLine();
        if (yourAnswer6.replaceAll(" ","").equalsIgnoreCase(modelAnswer6.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer6.replaceAll(" ","").equalsIgnoreCase(modelAnswer6.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer6);
        }

        System.out.println("------------ 문제 7 -------------");
        System.out.println("-cp는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer7 = scanner.nextLine();
        if (yourAnswer7.replaceAll(" ","").equalsIgnoreCase(modelAnswer7.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer7.replaceAll(" ","").equalsIgnoreCase(modelAnswer7.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer7);
        }

        System.out.println("------------ 문제 8 -------------");
        System.out.println("dir는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer8 = scanner.nextLine();
        if (yourAnswer8.replaceAll(" ","").equalsIgnoreCase(modelAnswer8.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer8.replaceAll(" ","").equalsIgnoreCase(modelAnswer8.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer8);
        }

        System.out.println("------------ 문제 9 -------------");
        System.out.println("MB는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer9 = scanner.nextLine();
        if (yourAnswer9.replaceAll(" ","").equalsIgnoreCase(modelAnswer9.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer9.replaceAll(" ","").equalsIgnoreCase(modelAnswer9.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer9);
        }

        System.out.println("------------ 문제 10 -------------");
        System.out.println("JVM는 무엇의 줄임말 일까요?");
        System.out.print("정답 입력:");
        String yourAnswer10 = scanner.nextLine();
        if (yourAnswer10.replaceAll(" ","").equalsIgnoreCase(modelAnswer10.replaceAll(" ",""))) {
            correctCounter = correctCounter + 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (!yourAnswer10.replaceAll(" ","").equalsIgnoreCase(modelAnswer10.replaceAll(" ",""))) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer10);
        }

        System.out.println("최종점수 : " + correctCounter + "점");


        if( correctCounter >= 9){
            System.out.println("컴잘알 이시군요. 완벽해요!");
        }
        if( correctCounter >= 6 && correctCounter <= 8){
            System.out.println("잘하고 있어요!");
        }
        if( correctCounter >= 3 && correctCounter <= 5){
            System.out.println("조금만 더 노력해주세요!");
        }
        if( correctCounter <= 2){
            System.out.println("컴알못이네요. 분발해주세요!");
        }

    }
}
