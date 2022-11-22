package DsaProgram;
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
public class LenghtOfString {
    public static void main(String[] args) {
  lengthOfLastWord(" Hello world");
    }
    public static int lengthOfLastWord(String inputString) {

        String[] words = inputString.split(" ");
        int i = words.length - 1;
        System.out.println(words[i]);
        String word = words[i];
        int length = word.length();
        System.out.println(length);


        return length;
    }
}
