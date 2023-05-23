package leetcode.quetions;

import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary={1000,2000,3000};
        double res = average(salary);
        System.out.println(res);
    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        double count=0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum = sum + salary[i];
            count++;
        }
        return sum/count;

    }
}
