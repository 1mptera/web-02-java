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

        String Question1 = "CPU는 무엇의 줄임말 일까요?";
        String Question2 = "RAM는 무엇의 줄임말 일까요?";
        String Question3 = "SSD는 무엇의 줄임말 일까요?";
        String Question4 = "HDD는 무엇의 줄임말 일까요?";
        String Question5 = "API는 무엇의 줄임말 일까요?";
        String Question6 = "PR는 무엇의 줄임말 일까요?";
        String Question7 = "-cp는 무엇의 줄임말 일까요?";
        String Question8 = "dir는 무엇의 줄임말 일까요?";
        String Question9 = "MB는 무엇의 줄임말 일까요?";
        String Question10 = "JVM는 무엇의 줄임말 일까요?";

        boolean isCorrect = false;
        boolean isIncorrect = false;

        System.out.println("컴잘알 테스트!!");

        System.out.println("------------ 문제 1 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question1);
        String yourAnswer1 = scanner.nextLine();

        isCorrect = yourAnswer1.replaceAll(" ", "").equalsIgnoreCase(modelAnswer1.replaceAll(" ", ""));
        isIncorrect = !yourAnswer1.replaceAll(" ", "").equalsIgnoreCase(modelAnswer1.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer1);
        }

        System.out.println("------------ 문제 2 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question2);
        String yourAnswer2 = scanner.nextLine();

        isCorrect = yourAnswer2.replaceAll(" ", "").equalsIgnoreCase(modelAnswer2.replaceAll(" ", ""));
        isIncorrect = !yourAnswer2.replaceAll(" ", "").equalsIgnoreCase(modelAnswer2.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer2);
        }

        System.out.println("------------ 문제 3 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question3);
        String yourAnswer3 = scanner.nextLine();

        isCorrect = yourAnswer3.replaceAll(" ", "").equalsIgnoreCase(modelAnswer3.replaceAll(" ", ""));
        isIncorrect = !yourAnswer3.replaceAll(" ", "").equalsIgnoreCase(modelAnswer3.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer3);
        }

        System.out.println("------------ 문제 4 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question4);
        String yourAnswer4 = scanner.nextLine();

        isCorrect = yourAnswer4.replaceAll(" ", "").equalsIgnoreCase(modelAnswer4.replaceAll(" ", ""));
        isIncorrect = !yourAnswer4.replaceAll(" ", "").equalsIgnoreCase(modelAnswer4.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer4);
        }

        System.out.println("------------ 문제 5 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question5);
        String yourAnswer5 = scanner.nextLine();

        isCorrect = yourAnswer5.replaceAll(" ", "").equalsIgnoreCase(modelAnswer5.replaceAll(" ", ""));
        isIncorrect = !yourAnswer5.replaceAll(" ", "").equalsIgnoreCase(modelAnswer5.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer5);
        }

        System.out.println("------------ 문제 6 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question6);
        String yourAnswer6 = scanner.nextLine();

        isCorrect = yourAnswer6.replaceAll(" ", "").equalsIgnoreCase(modelAnswer6.replaceAll(" ", ""));
        isIncorrect = !yourAnswer6.replaceAll(" ", "").equalsIgnoreCase(modelAnswer6.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer6);
        }

        System.out.println("------------ 문제 7 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question7);
        String yourAnswer7 = scanner.nextLine();

        isCorrect = yourAnswer7.replaceAll(" ", "").equalsIgnoreCase(modelAnswer7.replaceAll(" ", ""));
        isIncorrect = !yourAnswer7.replaceAll(" ", "").equalsIgnoreCase(modelAnswer7.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer7);
        }

        System.out.println("------------ 문제 8 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question8);
        String yourAnswer8 = scanner.nextLine();

        isCorrect = yourAnswer8.replaceAll(" ", "").equalsIgnoreCase(modelAnswer8.replaceAll(" ", ""));
        isIncorrect = !yourAnswer8.replaceAll(" ", "").equalsIgnoreCase(modelAnswer8.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer8);
        }

        System.out.println("------------ 문제 9 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question9);
        String yourAnswer9 = scanner.nextLine();

        isCorrect = yourAnswer9.replaceAll(" ", "").equalsIgnoreCase(modelAnswer9.replaceAll(" ", ""));
        isIncorrect = !yourAnswer9.replaceAll(" ", "").equalsIgnoreCase(modelAnswer9.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer9);
        }

        System.out.println("------------ 문제 10 -------------");
        System.out.println();
        System.out.print("정답 입력:" + Question10);
        String yourAnswer10 = scanner.nextLine();

        isCorrect = yourAnswer10.replaceAll(" ", "").equalsIgnoreCase(modelAnswer10.replaceAll(" ", ""));
        isIncorrect = !yourAnswer10.replaceAll(" ", "").equalsIgnoreCase(modelAnswer10.replaceAll(" ", ""));

        if (isCorrect) {
            correctCounter += 1;
            System.out.println("정답입니다. 점수 : " + correctCounter + "점");
        }

        if (isIncorrect) {
            System.out.println("틀렸습니다. 정답 : " + modelAnswer10);
        }

        System.out.println("최종점수 : " + correctCounter + "점");

        if (correctCounter >= 9) {
            System.out.println("컴잘알 이시군요. 완벽해요!");
        }

        if (correctCounter >= 6 && correctCounter <= 8) {
            System.out.println("잘하고 있어요!");
        }

        if (correctCounter >= 3 && correctCounter <= 5) {
            System.out.println("조금만 더 노력해주세요!");
        }

        if (correctCounter <= 2) {
            System.out.println("컴알못이네요. 분발해주세요!");
        }
    }
}
