package loops;
//Table of 3
import java.util.Scanner;

public class FirstLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n+" * " +i+" = "+i*n);

        }
        sc.close();



    }
}
