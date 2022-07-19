import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Radius = scanner.nextInt();
        int Diameter = 2*Radius +1;

        for (int i = 0; i < Diameter; i += 1) {
            for (int j = 0; j < Diameter; j += 1) {
              if(Math.pow(j-Radius,2)<=Math.pow(Radius,2)-Math.pow(i-Radius,2)){
              System.out.print("*");
              continue;
              }
              System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
