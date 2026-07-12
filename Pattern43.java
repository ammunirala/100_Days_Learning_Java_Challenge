public class Pattern43 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // print stars (2i - 1 stars per row)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}