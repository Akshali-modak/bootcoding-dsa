package leetcode.quetions;

public class EvenNoOFDigist {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int digits;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                 digits = nums[i] / 10;
                count ++;
                nums[i] = digits;
            }
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
