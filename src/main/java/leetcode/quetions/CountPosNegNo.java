package leetcode.quetions;

public class CountPosNegNo {
    public static void main(String[] args) {
    int [] nums = {-3,-5,2,8,7};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos++;
            }
            else if(nums[i]<0){
                neg++;
            }
        }
        if(pos<neg){
            return neg;
        }
        return pos;
    }
}
