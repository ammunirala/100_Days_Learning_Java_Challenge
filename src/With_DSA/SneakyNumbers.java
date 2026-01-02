package With_DSA;
import java.util.Arrays;

public class SneakyNumbers {

    // same logic as LeetCode
    public static int[] getSneakyNumbers(int[] numbs) {

        int n = numbs.length;
        int[] count = new int[n];
        int[] result = new int[2];

        int index = 0;

        for (int num : numbs) {
            count[num]++;
            if (count[num] == 2) {
                result[index++] = num;
            }
        }

        return result;
    }

    // IntelliJ entry point
    public static void main(String[] args) {

        int[] numbs = {0, 3, 2, 1, 3, 2};

        int[] ans = getSneakyNumbers(numbs);

        System.out.println(Arrays.toString(ans));
    }
}
