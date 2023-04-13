package leetcode.quetions;

public class NumbersOfGoodPairs {
    public static void main(String[] args) {
        int[]  nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int x = 0;
        for (int i =0;i< nums.length;i++){
            for (int j = i; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j){
                    x++;
                }
            }
        }
        return x;
    }
}
