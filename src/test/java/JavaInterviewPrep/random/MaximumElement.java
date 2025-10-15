package JavaInterviewPrep.random;

import java.util.Arrays;
import java.util.List;

public class MaximumElement {
    public static void main(String[] args) {

        /*
        Max element in list
         */
        List<Integer> list= Arrays.asList(10,5,22,45,7);
        int max=list.get(0);
        for(int num:list)
        {
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Max number in the list: " +max);

        /*
        Using Streams
         */
        long maximum=list.stream().max(Integer::compare).get();
        System.out.println("Streams: " +maximum);

    }
}
