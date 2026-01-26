package onedimensionalarrays;

public class problemOnArrays {
    public static void main(String[] args) {
        //sum of arrays (for each)
//        int numbers[] = {85,85,22,55,55,885,55};
//        int sum = 0;
//        for (int number: numbers){
//            sum = sum + number;
//        }
//        System.out.println("sum is " +sum);

        // sum of arrays for loops
//        int[] arr = {10,55,55,96,2,55,85,55,5852,55};
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum = sum + arr[i];
//
//        }
//        System.out.println("Array ka sum = " +sum);
        //find minimum numbers
        int numbers[] = {55,56,96,856,855,855};
        int min = Integer.MAX_VALUE;
        for (int number : numbers){
            if(number < min){
                min = number;
            }


        }
        System.out.println("minimum is " + min);





    }
}
