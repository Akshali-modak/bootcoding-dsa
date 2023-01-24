package leetcode.quetions;

public class FindEvenNo {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
      }
    public static int findNumbers(int[] nums) {
     int result=0;
     for (int i=0;i<nums.length;i++){
         int digitCount=0;
         while (nums[i]>0){
             nums[i]=nums[i]/10;
             digitCount++;
         }
         if (digitCount % 2 == 0){
             result++;
         }
     }
     return result;
    }

}
