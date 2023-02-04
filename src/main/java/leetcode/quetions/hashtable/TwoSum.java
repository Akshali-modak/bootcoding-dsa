package leetcode.quetions.hashtable;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,17,15};
        int[] indx = twoSum(nums,9);
        for (int i = 0; i < indx.length; i++ ){
            System.out.println(indx[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        HashMap<Integer,Integer> index = new  HashMap<>();
        for (int i = 0; i < nums.length;i++ ){
            if (index.containsKey(target-nums[i])){
                a[0] = index.get(target-nums[i]);
                a[1] = i;
                return a;
            }
            else {
                index.put(nums[i],i);
            }
        }

        return a;
    }
}
