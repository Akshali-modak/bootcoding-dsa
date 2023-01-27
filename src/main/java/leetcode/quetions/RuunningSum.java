package leetcode.quetions;

public class RuunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        getRunningSum(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println( );
    }
    public static int[] getRunningSum(int[] nums) {
        for(int i=1; i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
