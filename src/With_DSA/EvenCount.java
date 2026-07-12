package With_DSA;

class EvenCount {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 9, 10};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Total even numbers: " + count);
    }
}
