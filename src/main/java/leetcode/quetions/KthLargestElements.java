package leetcode.quetions;

import java.util.Arrays;

public class KthLargestElements {
    public static void main(String[] args) {
       int[]  nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
    public static int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }
}
