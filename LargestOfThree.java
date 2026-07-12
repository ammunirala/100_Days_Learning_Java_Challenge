
import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter three numbers: ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      if (a == b && b == c) {
        System.out.println("All three numbers are equal.");
      } else if (a >= b && a >= c) {
        System.out.println(a + " is largest");
      } else if (b >= a && b >= c) {
        System.out.println(b + " is largest");
      } else {
        System.out.println(c + " is largest");
      }

    }

  }

}
