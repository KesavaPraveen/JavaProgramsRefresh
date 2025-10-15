package JavaInterviewPrep.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        /*
        Collecting even numbers - manual logic
         */
        List<Integer> list= Arrays.asList(1,2,3,4,5,10,23,45);
        List<Integer> evenList=new ArrayList<>();
        for(int num: list)
        {
            if(num % 2 == 0)
            {
                evenList.add(num);
            }
        }
        System.out.println("Even Numbers: "+evenList);

        /*
        Using Streams
         */
        List<Integer> streamList=list.stream().filter(num -> num %2==0).collect(Collectors.toList());
        System.out.println("Using Streams Extracting Even Numbers: " +streamList);

    }
}
