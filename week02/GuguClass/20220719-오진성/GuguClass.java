public class GuguClass {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i += 3) {
            System.out.println("\n");
            for (int j = 1; j < 10; j += 1) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
                System.out.print((i + 1) + " * " + j + " = " + ((i + 1) * j) + "\t");
                if (i == 8) {
                    System.out.println("");
                    continue;
                }
                System.out.println((i + 2) + " * " + j + " = " + ((i + 2) * j) + "\t");
            }
        }
    }
}
