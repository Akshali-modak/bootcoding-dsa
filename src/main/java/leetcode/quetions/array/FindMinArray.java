package leetcode.quetions.array;

public class FindMinArray {
    public static void main(String[] args) {
        int[] array = {5,7,1,4,8};
         int min = array[0];
         for (int i=0;i<array.length;i++){
             if (array[i]<min){
                 min=array[i];
             }
         }
        System.out.println("Minimum array is "+min);
    }
}
