package leetcode.quetions;

public class PresentNo {
    public static void main(String[] args) {
        int arr[] = {3,5,7,1,0,8,3};
        System.out.println(printPresentNo(arr,7));
    }
    public static boolean printPresentNo(int[] arr, int value){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
}
