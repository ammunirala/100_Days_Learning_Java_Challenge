package With_DSA;

import java.util.Arrays;

public class LeftRight {

    public static void main(String[] args) {
        int[] nums1 = {10, 4, 8, 3};
        int[] nums2 = {1};

        System.out.println("Output 1: " + Arrays.toString(leftRightDifference(nums1)));
        System.out.println("Output 2: " + Arrays.toString(leftRightDifference(nums2)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return answer;
    }
}

