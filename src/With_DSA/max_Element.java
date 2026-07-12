package With_DSA;

public class max_Element {
    static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 3};
        int max = arr[0]; // assume first element is max

        for ( int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximun element: " + max);
    }
}
