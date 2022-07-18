import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tap = "";
        String countstar = "";

        while (true) {
            System.out.println("삼각형의 높이를 입력해 주세요(2 이상 20 미만)");
            int height = scanner.nextInt();
            int base = 2 * height - 1;
            if ((height < 2) || (height >= 20)) {
                System.out.println("다시 입력해 주세요.");
                continue;
            }

            for (int i = 1; i <= height; i += 1) {
                for (int j = 1; j <= base; j += 1) {
                    if (j >= height - i + 1 && j <= height + i - 1) {
                        countstar += "*";
                        continue;
                    }
                    countstar += " ";
                }
                countstar += "\n";
            }

            System.out.println(countstar);
        }

    }
}
