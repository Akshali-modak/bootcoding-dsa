package Recursion;

public class PrintNoWithoutLoop {
    public static void main(String[] args) {
     printNumber(1);
    }
    public static void printNumber(int num){
        if (num <= 100){
            System.out.println(num);
            num++;
            printNumber(num);

        }
    }
}
