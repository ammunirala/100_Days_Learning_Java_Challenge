//if,else , else if,switch,break
package Basics;

import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args) {
        // System.out.println("Enter your age");
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        //
        // if(age > 18){
        // System.out.println("Adult");
        //
        // }else
        // System.out.println("Not Adult");

        try (Scanner sc = new Scanner(System.in)) {
            // System.out.println("Enter a val:");
            // int val = sc.nextInt();
            // if(val % 2 == 0){
            // System.out.println("Even");
            // } else {
            // System.out.println("Odd");
            // }

            //
            // System.out.println("Enter a value of a:");
            // int a = sc.nextInt();
            // System.out.println("Enter a value of b:");
            // int b = sc.nextInt();
            // if(a == b) {
            // System.out.println("equal");
            // }else {
            // if(a>b){
            // System.out.println("a is greater");
            // } else {
            // System.out.println("a is lesser");
            // }
            //
            // }
            System.out.println("Enter a number of button:");

            int button = sc.nextInt();
            if (button == 1) {
                System.out.println("Hello");
            } else if (button == 2) {
                System.out.println("Namaste");

            } else {
                System.out.println("Bonjour");
            }
        }

    }

}
