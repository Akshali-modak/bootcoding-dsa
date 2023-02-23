package leetcode.quetions.array;

public class EqualsTwoArray {
    public static void main(String[] args) {
     int[] array1 = {3,4,5,8,2};
     int[] array2 = {3,4,7,8,2};
        boolean twoArray = returnEqualsArray(array1, array2);
        System.out.println(twoArray);
    }

    public static boolean returnEqualsArray(int[] array1, int[] array2){
        int lenght1 = array1.length;
        int lenght2 = array2.length;
        if (lenght1 != lenght2){
            return false;
        }
        for (int i=0;i<array1.length;i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
