package With_DSA;

public class SortColors {

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else { // nums[mid] == 2
                // swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.print("Before Sorting: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        sc.sortColors(nums);

        System.out.print("\nAfter Sorting:  ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
