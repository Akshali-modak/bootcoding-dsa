package DsaProgram;

public class FindIndex {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 6};
        FindIndex findIndex = new FindIndex();
        int result = findIndex.searchInsert(arr,4);
        System.out.println(result);
    }
    public int searchInsert(int[] nums, int target) {
        for (int i =0; i < nums.length; i++){
            if (target == nums[i] || target < nums[i]){
                return i;
            }

        }
        return nums.length;
    }


}
