package Basics;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor : ");
        int b = sc.nextInt();
        int r = a%b;
        System.out.println("The reminder when "+a+" is divided by  "+b+" is "+r);
        sc.close();

//        int x = 45;
//        int y = 8;
//        int r = x%y;
//        System.out.println(r);



    }
}
