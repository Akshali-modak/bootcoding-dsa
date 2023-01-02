package Recursion;

public class MoveAllXEnd {
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str,0,0,"");

    }
    public static void moveAllX(String str , int indx,int count, String newString){
        if (indx == str.length()){
            for (int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);
        if (currChar == 'x'){
            count++;
            moveAllX(str,indx+1,count,newString);
        }
        else {
            newString += currChar; // newString = NewString + currChar
            moveAllX(str,indx+1,count,newString);
        }
    }
}//Time Complexity O(n)
// String is Big O of n
