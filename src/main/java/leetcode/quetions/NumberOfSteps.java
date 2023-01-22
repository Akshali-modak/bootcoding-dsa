package leetcode.quetions;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(printNumberOfSteps(14));
    }
    public static int printNumberOfSteps(int num) {
      int steps = 0;
      while (num != 0){
          if (num % 2 == 0){
              num = num /2;
              steps++;
          }
          else {
              num= num - 1;
              steps ++;
          }
      }
      return steps;
    }
}
