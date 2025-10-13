package JavaInterviewPrep.collections;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        /*
        Manual Logic
         */
        List<String> list= Arrays.asList("java","python","java","c++","python","c#","c++","javascript");
        List<String> newList=new ArrayList<>();
        for(String s:list)
        {
            if(!newList.contains(s))
            {
                newList.add(s);
            }
        }
        System.out.println(newList);
        /*
        Built in Logic
         */
        Set<String> set=new LinkedHashSet<>(list);
        System.out.println("Built in: " +set);

        /*
        Streams
         */
        List<String> listStream=list.stream().distinct().collect(Collectors.toList());
        System.out.println("Stream: " +listStream);
    }
}
