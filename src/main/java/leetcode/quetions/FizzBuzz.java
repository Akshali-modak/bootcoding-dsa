package leetcode.quetions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(getFizzBuzz(3));
    }
    public static List<String> getFizzBuzz(int n) {
        ArrayList<String> strings = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i% 3 == 0 && i% 5 == 0){
                strings.add("FizzBuzz");
            } else if (i % 3 == 0) {
                strings.add("Fizz");
            } else if (i % 5 == 0) {
                strings.add("Buzz");
            }
            else {
               strings.add(String.valueOf(i));
            }
        }
        return strings;
    }
}
