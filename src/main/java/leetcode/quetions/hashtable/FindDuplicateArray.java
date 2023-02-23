package leetcode.quetions.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {3,5,4,3,2,2,1};
        Hashtable<Integer,Integer> dv = new Hashtable<>();
        for (int no : arr){
            Integer count = dv.get(no);
            if (count ==  null){
                dv.put(no,1);
            }
            else {
                count = count+1;
                dv.put(no,count);
            }
        }
        System.out.println("Duplicate array is ");
        Set<Map.Entry<Integer,Integer>> es = dv.entrySet();
        for (Map.Entry<Integer,Integer> value : es){
            if (value.getValue()>1){
                System.out.println(value.getKey()+" ");
            }
        }
    }

}
