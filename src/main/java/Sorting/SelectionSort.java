package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,5,9,2,4};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            printSelectionSort(arr);
        }
    }
    public static void printSelectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int smallest = i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[j] < arr[smallest]){
                    smallest =j;

                    int temp = arr[i];
                    arr[i] =arr[smallest];
                    arr[smallest] = temp;
                }
            }

        }
    }
}
