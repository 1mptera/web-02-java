public class GuguClass {
    public static void main(String[] args) {
        //준비
        for (int i = 2; i < 10; i += 3) {
            for (int j = 1; j < 10; j += 1) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");

                if (i + 1 < 10) {
                    System.out.print((i + 1) + " * " + j + " = " + (i + 1) * j + "\t");
                }

                if (i + 2 < 10) {
                    System.out.print((i + 2) + " * " + j + " = " + (i + 2) * j + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
        }

        //입력
        //처리
        //출력
    }
}
