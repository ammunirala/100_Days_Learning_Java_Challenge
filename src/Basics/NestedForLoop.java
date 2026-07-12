package Basics;

public class NestedForLoop {
     public static void main(String[] args) {
         int arr[][] = {{2,5,5},{5,8,3},{5,8,6}};
         for (int i =0; i < 3; i++){
             for(int j = 0; j < 3; j++){
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }

    }
}
