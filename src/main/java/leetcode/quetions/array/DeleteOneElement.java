package leetcode.quetions.array;

public class DeleteOneElement {
    public static void main(String[] args) {
        int[] arr = {10,40,30,20,80};
        deleteElement(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void deleteElement(int[] arr) {
       int count = 0;
       int delete = 40;
       for (int i=0;i<arr.length;i++){
           if (delete == arr[i]){
               for (int j=i;j<arr.length-1;j++){
                   arr[j] = arr[j+1];
                   count++;
               }
           }
       }
    }
}
