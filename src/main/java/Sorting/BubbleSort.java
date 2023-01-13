package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {4, 5, 7,23, 3};
        for (int i = 0; i < a.length; i++) {
            printBubble(a);
            System.out.print(a[i]+" ");
        }
    }

    public static void printBubble(int a[]){
        for(int i=0; i < a.length-1; i++){
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

