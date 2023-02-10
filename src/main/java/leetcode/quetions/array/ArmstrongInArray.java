package leetcode.quetions.array;

import java.util.Scanner;

public class ArmstrongInArray {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size ");
            int size = sc.nextInt();
            int[] numbers = new int[size];
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter array element " + (i + 1));
                int number = sc.nextInt();
                numbers[i] = number;
            }
            findingArmstrongInArray(numbers);
}

     private static void findingArmstrongInArray(int[] numbers) {
        System.out.println("Armstrong");
        for (int i = 0; i < numbers.length;i++){
            int temp = numbers[i];
            int rem ;
            int sum = 0;
            while (numbers[i] != 0) {
                int div = numbers[i] / 10;
                rem = numbers[i] % 10;
                sum = sum + (rem * rem * rem);
                numbers[i] = div;
            }
            if (sum == temp) {
                System.out.println(sum);
            }
        }
    }
    }

