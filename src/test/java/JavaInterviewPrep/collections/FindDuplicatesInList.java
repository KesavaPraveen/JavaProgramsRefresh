package JavaInterviewPrep.collections;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        /*
        Using Set printing duplicates in list
         */
        List<String> list= Arrays.asList("java","python","java","c++","python","c#","c++","javascript");
        Set<String> seen=new HashSet<>();
        Set<String> set=new LinkedHashSet<>();
        for(String s: list)
        {
            if(!seen.add(s))
            {
                set.add(s);
            }
        }
        System.out.println("Using Set: " +set);

        /*
        Using Streams
         */
        Set<String> see=new HashSet<>();

        List<String> list1=list.stream().filter(s -> !see.add(s)).collect(Collectors.toList());
        System.out.println("Streams: " +list1);
    }
}
