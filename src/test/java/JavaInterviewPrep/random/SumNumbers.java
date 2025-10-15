package JavaInterviewPrep.random;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {
        /*
        Sum of Elements in the list
         */
        List<Integer> list= Arrays.asList(10,5,22,45,7);
        int sum=0;
        for(int num:list)
        {
            sum=sum+num;
        }
        System.out.println("Sum of Elements: " +sum);

        /*
        Using Streams
         */
        long totalSum=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Streams: "+totalSum);
    }
}
