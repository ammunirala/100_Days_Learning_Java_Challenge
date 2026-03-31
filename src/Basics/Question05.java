package Basics;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number 1");
        int x = sc.nextInt();
        System.out.println("Enter  Number 2");
        int y = sc.nextInt();
        System.out.println("sum of numbers");
        int sum = x +  y;
        System.out.println(sum);
        sc.close();


    }
}
