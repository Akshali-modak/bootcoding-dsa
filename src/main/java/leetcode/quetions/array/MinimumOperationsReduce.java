package leetcode.quetions.array;

public class MinimumOperationsReduce {
    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 2, 3};
        System.out.println(minOperations(nums, 5));
    }

    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = 0;
        //finding the total sum
        for (int num : nums) {
            totalSum += num;
        }
        int targetSum = totalSum - x;
        if (targetSum < 0) {
            return -1;
        }
        //creating two pointer
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int minOperation = Integer.MIN_VALUE;
        while (right < n) {
            currentSum += nums[right];
            right++;
            //if the current sum becomes greater than the
            //target sum, we move the left pointer to the right
            while (left < right && currentSum > targetSum) {
                currentSum -= nums[left];
                left++;
            }
            // if it is equal calculator the number of operations
            // && removing the remaining element
            if (currentSum == targetSum) {
                int operation = (n - right) + left;
                minOperation = Math.min(minOperation,operation);
            }
        }
        // take minimum of all such operations
        return minOperation == Integer.MIN_VALUE? -1: minOperation;
    }
}