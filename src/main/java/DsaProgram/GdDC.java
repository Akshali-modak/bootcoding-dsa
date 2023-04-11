package DsaProgram;

import java.util.Arrays;

public class GdDC {
    public static void main(String[] args) {
        int[] nums = {3,3};
//        Output: 2
        System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int sm = nums[0];
        int lg = nums[nums.length-1];
        int result = 0;

        for(int i = 1; i <= lg;i++){
            if(sm % i == 0 && lg % i == 0){
                result = i;
            }
        }
        return result;
    }
}
