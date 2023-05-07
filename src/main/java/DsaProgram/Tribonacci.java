package DsaProgram;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(fibMemoization(25));
    }

    // Using Normal recursion
//    public static int fib(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

    // Using Memoization
    public static int fibMemoization(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n;
    }
}
