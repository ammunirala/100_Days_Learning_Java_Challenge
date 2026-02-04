package With_DSA;

import java.util.Scanner;

public class SumWithReverse {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a numbers: ");
       int n = sc.nextInt();
       int temp = n;
       int rev = 0;
       while(n!=0){
           int lastDigit = n % 10;
           rev = rev * 10 + lastDigit;
           n = n / 10;

       }
       int sum = temp + rev;
       System.out.println("Reverse = " +rev);
       System.out.println("Sum of number and its reverse = " + sum);

    }
}
