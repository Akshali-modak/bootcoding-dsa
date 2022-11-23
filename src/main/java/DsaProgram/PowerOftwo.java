package DsaProgram;
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//Example 1:
//Input: n = 1
//Output: true
//Explanation: 20 = 1
public class PowerOftwo {
    public static void main(String[] args) {
       isPowerOfTwo(16);
    }
    public static boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        if (n % 2 ==1)
            return false;
        System.out.println("Power of two is : "+n/2);
        return  true;
    }
}
