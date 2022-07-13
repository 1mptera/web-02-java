import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(3);
        int x = num;
        //가위바위보!
        System.out.print("가위바위보!\n나: ");

        //이얍!
        String answer = scanner.nextLine();

        //상대방
        if (x == 0){
            System.out.println("상대편: 바위");
            if(answer.equals("바위")){
                System.out.println("비겼다!");
            }
            if(answer.equals("가위")){
                System.out.println("졌다!");
            }
            if(answer.equals("보")){
                System.out.println("이겼다!");
            }
        }
        if (x == 1){
            System.out.println("상대편: 가위");
            if(answer.equals("바위")){
                System.out.println("이겼다!");
            }
            if(answer.equals("가위")){
                System.out.println("비겼다!");
            }
            if(answer.equals("보")){
                System.out.println("졌다!");
            }
        }
        if (x == 2){
            System.out.println("상대편: 보");
            if(answer.equals("바위")){
                System.out.println("졌다!");
            }
            if(answer.equals("가위")){
                System.out.println("이겼다!");
            }
            if(answer.equals("보")){
                System.out.println("비겼다!");
            }
        }
    }
}
