package onedimensionalarrays;

public class MaxNumber {
    public static void main(String[] args) {

        int numbers[] = {55,855,455,55,55,55,5,6,55};
        int max = Integer.MIN_VALUE;

        for (int number : numbers){
            if(number > max){
                max = number;
            }

        }
        System.out.println("Maximum number is " +max);


    }
}
