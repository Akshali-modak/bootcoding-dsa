package Recursion;

public class SumOfNaturalNo {
    public static void main(String[] args) {
     printNaturalNumbers(1,5,0);
    }
    public static void printNaturalNumbers(int a, int n, int sum){
        if (a ==n){
            sum+= a;
            System.out.println(sum);
            return;
        }
        sum +=a;
        printNaturalNumbers(a+1,n,sum);

    }
}
