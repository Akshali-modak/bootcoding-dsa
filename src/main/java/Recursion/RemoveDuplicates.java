package Recursion;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int indx, String newString){
        if (indx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true){
            removeDuplicate(str,indx+1,newString);
        }else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str,indx+1,newString);
        }
    }
    public static void main(String[] args) {
     String str = "abbccda";
     removeDuplicate(str,0,"");
    }
}//Time Complexity O(n)
