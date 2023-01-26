package leetcode.quetions;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args) {
      int  nums[] = {2,5,6,9,10};
      int gcd = findGCD(nums);
        System.out.println(gcd);
    }
    public static int findGCD(int[] nums) {
        int mn = 0;
        int mx = 0;

        for(int i=0; i<nums.length; i++)
        {
            mn = min(mn, nums[i]);
            mx = max(mx, nums[i]);
        }

        int ans = 0;
        for(int i=1; i<=mx; i++)
        {
            if(mx%i == 0 && mn%i == 0)
            {
                ans= i;
            }
        }
        return ans;
    }
}
