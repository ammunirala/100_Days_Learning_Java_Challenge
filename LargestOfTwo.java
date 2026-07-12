import java.util.Scanner;
public class LargestOfTwo {
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter two Numbers:");
          double a = sc.nextDouble();
          double b = sc.nextDouble();
          if ( a>b){
              System.out.println("a is largest");
          } else if(b > a ){
              System.out.println("b is largest");
          } else {
              System.out.println("both are equal");
          }
      }



  }}





  



