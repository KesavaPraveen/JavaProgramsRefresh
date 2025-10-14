package JavaInterviewPrep.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsInSets {
    public static void main(String[] args) {
        /*
        Manual Logic to find common elements in two sets
         */
        Set<String> set1=new HashSet<>(Arrays.asList("java","python","c++","ruby"));
        Set<String> set2=new HashSet<>(Arrays.asList("python","ruby","go","java"));
        Set<String> common=new HashSet<>();
        for(String s:set1)
        {
            if(set2.contains(s))
            {
                common.add(s);
            }
        }
        System.out.println("Manual Common Elements in Set: " +common);

        /*
        Built in Logic to find common elements
         */
        Set<String> set3=new HashSet<>(Arrays.asList("java","python","c++","ruby"));
        Set<String> set4=new HashSet<>(Arrays.asList("python","ruby","go","java"));
        set3.retainAll(set4);
        System.out.println("Built in Common Elements: " +set3);

        /*
        Streams to find common elements
         */
        Set<String> set5=new HashSet<>(Arrays.asList("java","python","c++","ruby"));
        Set<String> set6=new HashSet<>(Arrays.asList("python","ruby","go","java"));
        Set<String> set7=set5.stream().filter(set6::contains).collect(Collectors.toSet());
        System.out.println("Streams Common Elements: " +set7);
    }
}
