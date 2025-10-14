package JavaInterviewPrep.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionSets {
    public static void main(String[] args) {
        /*
        Union Sets - Manual
         */
        Set<String> set1=new HashSet<>(Arrays.asList("java","python","c++","ruby"));
        Set<String> set2=new HashSet<>(Arrays.asList("python","go","java","scala"));
        Set<String> union=new LinkedHashSet<>();
        for(String s: set1)
        {
            union.add(s);
        }
        for(String s:set2)
        {
            if(!union.contains(s))
            {
                union.add(s);
            }
        }
        System.out.println("Union: " +union);

        /*
        Union - Built in
         */
        Set<String> set3=new HashSet<>(Arrays.asList("java","python","c++","ruby"));
        Set<String> set4=new HashSet<>(Arrays.asList("python","go","java","scala"));
        Set<String> set5=new HashSet<>();
        set5.addAll(set3);
        System.out.println(set5);
        set5.addAll(set4);
        System.out.println(set5);

        /*
        Union - Streams
         */
        Set<String> set6=new HashSet<>(Arrays.asList("java","python","c++","ruby"));
        Set<String> set7=new HashSet<>(Arrays.asList("python","go","java","scala"));
        Set<String> set8= Stream.concat(set6.stream(),set7.stream()).collect(Collectors.toSet());
        System.out.println("Streams Union: " +set8);
    }
}
