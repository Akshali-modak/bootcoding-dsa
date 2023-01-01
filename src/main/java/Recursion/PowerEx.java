package Recursion;

public class PowerEx {
    public static void main(String[] args) {
        int x = 2 , n =5;
        int ans = printPower(x,n);
        System.out.println(ans);
    }
    public static int printPower(int x, int n){
        if (n ==0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        // if n is even
        if (n % 2 == 0){
            return printPower(x,n/2) * printPower(x,n/2);
        }
        else { // n is odd
            return printPower(x,n/2) * printPower(x,n/2) *x;
        }

    }
}
