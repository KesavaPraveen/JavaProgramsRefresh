package JavaInterviewPrep.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElementsInArray {
    public static void main(String[] args) {
        /*
        Frequency Count of Elements in Array
         */
        int[] arr2={1,2,3,1,3,5,1,4,3,7,4};
        Map<Integer,Integer> countMap=new HashMap<>();
        for(int num: arr2)
        {
            if(countMap.containsKey(num))
            {
                countMap.put(num,countMap.get(num)+1);
            }
            else {
                countMap.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:countMap.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
