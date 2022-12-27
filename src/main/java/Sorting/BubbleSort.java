package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {4, 1, 7, 10, 3};
        for (int i = 0; i < a.length; i++) {
            printBubble(a);
            System.out.println(a[i]+" ");
        }
    }

    public static void printBubble(int a[]){
        for(int i=0; i < a.length; i++){
            for(int j=1; j < (a.length-i); j++){
                if(a[j-1] > a[j]){
                    //swap elements
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
}

