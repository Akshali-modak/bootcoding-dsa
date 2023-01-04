package Recursion;

public class SubsequencesString {
    public static void main(String[] args) {
      String str = "abc";
      printSubsequences(str,0,"");
    }
    public static void printSubsequences(String str , int indx , String newString){
        if (indx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);
        //to be
        printSubsequences(str,indx+1,newString+currChar);

        // or not to be
        printSubsequences(str,indx+1,newString);
    }
}
