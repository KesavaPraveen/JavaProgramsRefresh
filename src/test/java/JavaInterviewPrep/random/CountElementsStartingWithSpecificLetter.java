package JavaInterviewPrep.random;

import java.util.Arrays;
import java.util.List;

public class CountElementsStartingWithSpecificLetter {
    public static void main(String[] args) {
        /*
        Count of Elements Starting with Specific Letter
         */
        List<String> list= Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
        int count=0;
        for(String s: list)
        {
            if(s.toLowerCase().startsWith("a"))
            {
                count++;
            }
        }
        System.out.println("Count of Letter starts with a: " +count);

        /*
        Using Streams
         */
        long counter=list.stream().filter(s-> s.toLowerCase().startsWith("a")).count();
        System.out.println("Count of Letters starts with a using streams: " +counter);
    }
}
