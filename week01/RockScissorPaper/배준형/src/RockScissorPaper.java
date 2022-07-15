import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new  Random();

        System.out.println("가위바위보!");
        System.out.print("나: ");
        String me = scanner.nextLine();

        int num = random.nextInt(3);

        //바위
        if (num == 0){

            System.out.println("상대: 바위" );

            if (me.equals("바위")){

                System.out.println("비겼다!");
            }

            if (me.equals("가위")){

                System.out.println("졌다!");
            }

            if (me.equals("보")){

                System.out.println("이겼다!");
            }
        }

        //가위
        if (num == 1){

            System.out.println("상대: 가위" );

            if (me.equals("가위")){

                System.out.println("비겼다!");
            }

            if (me.equals("보")){

                System.out.println("졌다!");
            }

            if (me.equals("바위")){

                System.out.println("이겼다!");
            }
        }

        //보
        if (num == 2){

            System.out.println("상대: 보" );

            if (me.equals("보")){

                System.out.println("비겼다!");
            }

            if (me.equals("바위")){

                System.out.println("졌다!");
            }

            if (me.equals("가위")){

                System.out.println("이겼다!");
            }
        }
    }
}
