import java.util.Scanner;

public class Rectangle {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter the length of the rectangle :");
           double length = sc.nextDouble();
           System.out.println("Enter the breadth of the rectangle :");
           double breadth = sc.nextDouble();
           double area = length * breadth;
           double perimeter = 2 * (length + breadth);
           System.out.println("Area of rectangle is : " + area);
           System.out.println("Perimeter of rectangle is : " + perimeter);
       }
      
  }
  
 }
