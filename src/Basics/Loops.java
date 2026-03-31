//for loop,while loop , do while loop
package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for(initialisation;condition;update
//        for(int count = 0; count <11; count++){
//            System.out.println(count);
//        }
//        for(int i = 0; i < 11; i++){
//            System.out.println(i);
//        }

        //while loops

//        int i = 0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }
        //do while loop

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while(i < 11);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i =0; i<=n; i++ ){
            sum = sum + i;
        }
        System.out.println(sum);
            sc.close();


    }
}
