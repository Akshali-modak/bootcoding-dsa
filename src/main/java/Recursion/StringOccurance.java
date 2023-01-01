package Recursion;

public class StringOccurance {
    public static int first =-1;
    public static int last = -1;

    public static void main(String[] args) {
    String str = "abaacdaefaah";
    findOccurance(str,0, 'a');
    }
    public static void findOccurance(String str, int indx , char element){
        if (indx ==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(indx);
        if (currChar == element){
            if (first == -1){
                first = indx;
            }
            else {
                last = indx;
            }
        }
        findOccurance(str,indx+1,element);

    }//Time Complex o(n)
}
