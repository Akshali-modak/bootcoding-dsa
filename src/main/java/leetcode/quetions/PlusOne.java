package leetcode.quetions;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        getPlusOne(digits);
        for (int i=0;i<digits.length;i++){
            System.out.println(digits[i]);
        }
        System.out.println( );
    }

    public static int[] getPlusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
