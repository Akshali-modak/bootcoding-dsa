package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2,55,7,20,8};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
            insertion(array);
        }
    }
    public static void insertion(int array[]){
        for (int i=0;i<array.length;i++){
            int current  = array[i];
            int j = i-1;
            while (j>= 0 && current <= array[j]){
                array[j+1] = array[j];
                j--;
            }
            // For place
            array[j+1] = current;
        }
    }
}
