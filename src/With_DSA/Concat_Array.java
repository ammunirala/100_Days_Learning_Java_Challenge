package With_DSA;

import java.util.Arrays;

public class Concat_Array {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }


    public static void main(String[] args) {
        Concat_Array obj = new Concat_Array();

        int[] nums = {1, 2, 1};   // test input
        int[] result = obj.getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }
}
