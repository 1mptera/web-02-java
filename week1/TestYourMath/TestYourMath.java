import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        System.out.print("Input 2 numbers: ");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + " + " + y + "?");

        int answer = scanner.nextInt();

        System.out.println(x + " * " + y + " ?");

        int answer2 = scanner.nextInt();

        boolean results = answer == (x + y);

        boolean results2 = answer2 == (x*y);

     if (results && results2){
         System.out.println("Gunius!");}

        if ((results && !results2) || (!results && results2)){
            System.out.println("Muggle!");}
        if (!results && !results2){
            System.out.println("Stupid!");}





    }




    }
