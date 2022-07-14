import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double randomNumber = random.nextDouble(3);

        String computerPick = null;

        System.out.println("가위바위보!");
        System.out.print("나: " );
        String yourPick = scanner.nextLine();

        if(randomNumber <=1){
            computerPick = "가위";
        }
        if(randomNumber >=1 && randomNumber <=2  ){
            computerPick = "바위";
        }
        if(randomNumber >=2 && randomNumber <=3 ){
            computerPick = "보";
        }

        System.out.println("상대: " + computerPick);

        boolean comRock = computerPick.equals("바위");
        boolean comScissor = computerPick.equals("가위");
        boolean comPaper = computerPick.equals("보");

        boolean yourRock = yourPick.equals("바위");
        boolean yourScissor = yourPick.equals("가위");
        boolean yourPaper = yourPick.equals("보");

        if (computerPick.equals(yourPick)){
            System.out.println("비겼다!");
        }

        if((yourRock && comScissor) || (yourScissor && comPaper) || (yourPaper && comRock) ){
            System.out.println("이겼다!");
        }

        if((yourRock && comPaper) || (yourScissor && comRock) || (yourPaper && comScissor) ){
            System.out.println("졌다!");
        }
    }
}