package leetcode.quetions;

public class MajorityElements {
    public static void main(String[] args) {
      int [] nums = {2,2,1,1,1,2,2};
      getmajorityElement(nums);
      for (int i=0;i<nums.length;i++){
          System.out.println(nums[i]);
      }
        System.out.println( );
    }
    public static int getmajorityElement(int[] nums) {
     int n = nums.length;
     int majority = nums[0];
     int count = 1;
     for (int i=1;i<n;i++){
         if (nums[i] == majority){
             count ++;
         }else {
             count=1;
             if (count==0){
                 majority = nums[i];
                 count = 1;
             }
         }
     }
     return majority;
    }
}
