public class GuguClass {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i += 3) {
            for (int j = 1; j < 10; j += 1) {
                for (int k = i; k < i + 3; k += 1) {
                    if (k == 10) {
                        continue;
                    }
                    System.out.print(k + " * " + j + " = " + k * j);
                    System.out.print("\t");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
}
