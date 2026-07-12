public class SwapWithoutThird {
  public static void main(String[] args) {
      int a = 5, b = 10;
      System.out.println("Before wap a = " + a + ", b = " + b);
      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println("After swap a = " + a + ", b = " + b);

    
  }}

