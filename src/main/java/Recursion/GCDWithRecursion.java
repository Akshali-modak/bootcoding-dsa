package Recursion;

import java.util.Arrays;



public class GCDWithRecursion {
    public static void main(String[] args) {
        int[] nums = new int[0];
//        int minNum = nums[0], maxNum = nums[nums.length - 1];
//        System.out.println();
        getGCD(4,9);
    }
    public static int getGCD(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b % a == 0)
            return a;
        return getGCD(a, b % a);
    }
}
