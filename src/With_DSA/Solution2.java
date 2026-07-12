package With_DSA;
import java.util.*;

class Solution2 {

    public int countCompleteSubarrays(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int totalDistinct = set.size();

        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (freq.size() == totalDistinct) {
                count += nums.length - right;

                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) freq.remove(nums[left]);
                left++;
            }
        }
        return count;
    }

    // 👇 MAIN METHOD (for local testing)
    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        int[] nums1 = {1, 3, 1, 2, 2};
        System.out.println(sol.countCompleteSubarrays(nums1)); // 4

        int[] nums2 = {5, 5, 5, 5};
        System.out.println(sol.countCompleteSubarrays(nums2)); // 10
    }
}
