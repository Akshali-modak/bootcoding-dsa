package Recursion;

public class CalculatePower {
    public static void main(String[] args) {
       int x = 2 , n =5;
       int ans = calcPower(x,n);
        System.out.println(ans);
    }
    public static int calcPower(int x, int n){
        if (n == 0){   //base case 1
            return 1;
        }
        if (x == 0){ //base case 2
            return 0;
        }
        int xPow1 = calcPower(x,n-1);  //work
        int xPown = x * xPow1;
        return xPown;
    }
}
