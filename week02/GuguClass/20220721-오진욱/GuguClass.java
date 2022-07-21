public class GuguClass {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i += 3) {
            for (int j = 1; j < 10; j += 1) {
                int x = i;
                System.out.print(x + " * " + j + " = " + x * j);

                System.out.print("\t");

                x +=1;

                System.out.print(x + " * " + j + " = " + x * j);

                System.out.print("\t");

                x +=1;

                if(x == 10){
                    System.out.println();

                    continue;
                }

                System.out.print(x + " * " + j + " = " + x * j);

                System.out.println();
            }

            if (i + 2 == 10){

                break;
            }

            System.out.println();
            System.out.println();
        }
    }
}
