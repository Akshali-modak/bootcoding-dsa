package leetcode.quetions.array;
//Find out the max and min number from the give three int positive number..
public class RepeatElement {
    public static void main(String[] args) {
        int[] array = {1,5,1,5,4,2};
        findRepeatElement(array);
    }
    public static void findRepeatElement(int[] array){
        int temp[] = new int[array.length];
        for (int i=0;i<temp.length;i++){
            if (temp[array[i]]==1){
                System.out.println(array[i]);
            }
            else {
                temp[array[i]]++;
            }
        }

    }
}
