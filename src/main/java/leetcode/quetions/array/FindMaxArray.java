package leetcode.quetions.array;

public class FindMaxArray {
    public static void main(String[] args) {
        int[] array = {3,4,6,9,5};
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum array is "+ max);
    }
}
