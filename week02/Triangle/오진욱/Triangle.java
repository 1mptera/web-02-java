import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        //준비
        Scanner scanner = new Scanner(System.in);
        String star = "";

//        마지막 단 : 2n -1
//        줄마다 빈칸 : n - 1 (양옆)
//        n = height
//        * 수 : 2n -1
//        n시작 되는곳 : 높이 - (n-1)


        while(true){
            //입력
            System.out.println("삼각형의 높이를 입력해주세요(2 이상 20 미만)");
            int triangleHeight = scanner.nextInt();
            int triangleBase = 2 * triangleHeight - 1;

            //처리
            if (triangleHeight < 2 || triangleHeight >= 20){
                System.out.println("다시 입력해주세요");
                continue;
            }

            for (int i = 1; i <= triangleHeight; i += 1){
                for (int j = 1; j<= triangleBase ; j +=1){
                    if (j >= triangleHeight - i + 1 && j <= triangleHeight +i -1 ){
                        star += "*";
                        continue;
                    }
                    star += " ";
                }
                star += "\n";
            }

            //출력
            System.out.println(star);
            return;
        }
    }
}
