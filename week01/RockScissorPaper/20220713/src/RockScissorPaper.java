import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보!");
        System.out.print("나: ");
        String me = scanner.nextLine();

        //같은걸 냈을 때
        String[] color = {"가위", "바위", "보"};
        double random = Math.random();
        int num = (int)Math.round(random * (color.length-1));

        System.out.println("상대: " + color[num]);

        if (me.equals(color[num])){
            System.out.println("비겼다!");

        //서로 다른걸 냈을 때
        }
        if (me.equals("가위")){
            if (color[1] == color[num]) {
                System.out.println("졌다!");
            }
            if (color[2] == color[num]) {
                System.out.println("이겼다!");
            }
        }
        if (me.equals("바위")){
            if (color[2] == color[num]) {
                System.out.println("졌다!");
            }
            if (color[0] == color[num]) {
                System.out.println("이겼다!");
            }

        }
        if (me.equals("보")){
            if (color[0] == color[num]) {
                System.out.println("졌다!");
            }
            if (color[1] == color[num]) {
                System.out.println("이겼다!");
            }

        }
    }

}

