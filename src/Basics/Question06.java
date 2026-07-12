package Basics;

import java.util.Scanner;

public class Question06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor : ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.println("The reminder when "+a+" is divided by  "+b+" is "+r);
        sc.close();


    }

    }

