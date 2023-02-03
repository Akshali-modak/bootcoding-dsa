package Recursion;

public class StringRevers {
    public static void main(String[] args) {
       String str = "pavan";
       printRev(str,str.length()-1);
    }
    public static void printRev(String str, int indx){
        if (indx == 0){
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printRev(str,indx-1);

    }
}
