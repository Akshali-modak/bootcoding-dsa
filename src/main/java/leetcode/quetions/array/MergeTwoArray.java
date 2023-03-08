package leetcode.quetions.array;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a1 = {2,4,5,6,7};
        int[] a2 = {3,4,1,0,4};
        mergeTwoArrray(a1,a2);
    }

    private static void mergeTwoArrray(int[] a1, int[] a2) {
        int len1 = a1.length;
        int len2 = a2.length;
        int[] result = new int[len1+len2];
        int i=0;
        int j=0;
        int k=0;
        while (i< len1 && j<len2){
            if (a1[i] < a2[j]){
                result[k++] = a1[i++];
            }else {
                result [k++] = a2[j++];
            }
        }
        while (i< len1){
            result[k++] = a1[i++];
        }
        while (j < len2){
            result [k++]= a2[j++];
        }
    }
}
