package leetcode.quetions;

import java.util.HashSet;

public class DistinctEchoSubstrings {
    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(removeDuplicateLetters(s));
        System.out.println(removeDuplicateLetters("bcdbc"));
    }
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set =new HashSet<>();

        for (int i = 0; i < s.length(); i++) set.add(s.charAt(i));

        for (char ch: set) sb.append(ch);

        return sb.toString();
    }
}
