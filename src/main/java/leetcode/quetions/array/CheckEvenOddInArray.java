package leetcode.quetions.array;

public class CheckEvenOddInArray {
    public static void main(String[] args) {
        int [] a = {6,2,7,17,5,22,30,46};
        System.out.println("odd no");
        for (int i=0;i<a.length;i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
            System.out.println("even no");
            for (int i=0;i<a.length;i++){
                if (a[i] % 2==0){
                    System.out.println(a[i]);
                }
            }
    }
}
