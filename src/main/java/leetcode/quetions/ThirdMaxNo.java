package leetcode.quetions;

import java.util.Arrays;

public class ThirdMaxNo {
    public static void main(String[] args) {
        int[] nums={19, -10, 20, 14, 2, 16, 10};
        int result = thirdMax(nums);
        System.out.println(result);
    }
    private static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-3];
    }
}
