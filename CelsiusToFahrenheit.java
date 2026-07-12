import java.util.Scanner;
public class CelsiusToFahrenheit {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter temperature in celsius:");
      double celsius = sc.nextDouble();
      double fahrenheit = (celsius * 9/5) + 32;
      System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " degree fahrenheit.");
      sc.close();
  }
  
}
