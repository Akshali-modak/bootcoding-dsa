package leetcode.quetions;

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        getBuildArray(nums);
        for (int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println( );
    }
    public static int[] getBuildArray(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n;i++){
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }
        for (int i=0;i<n;i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}
