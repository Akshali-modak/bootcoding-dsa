package leetcode.quetions.array;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a1 = {2,4,5,6,7};
        int[] a2 = {3,4,1,0,4};
        int k=0;

        int[] array = new int[10];
        for (int i=0;i<a1.length;i++){
            array[k] = a1[i];
            k++;
        }
        for (int i=0;i<a2.length;i++){
            array[k] = a2[i];
            k++;
        }
        Arrays.sort(array);
        for (int x: array){
            System.out.print(x);
        }
    }
}
