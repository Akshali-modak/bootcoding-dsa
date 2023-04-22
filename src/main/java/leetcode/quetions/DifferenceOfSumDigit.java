package leetcode.quetions;

public class DifferenceOfSumDigit {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {

        int total_sum = 0;
        int total_digit= 0;
        int difference = 0;
        int div;
        for (int i =0 ; i<nums.length;i++){
            total_sum = total_sum + nums[i];
        }
        for (int j = 0; j<nums.length;j++){
            int rem=0;
            int n = nums[j];
            while (n!=0){
                div = n/10;
                rem = rem + n%10;
                n=div;
            }
            total_digit = total_digit + rem;
        }

         difference = total_sum - total_digit;

          return difference;
    }
}
