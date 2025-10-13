package JavaInterviewPrep.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        /*
        Find Duplicates in int and string arrays without built in
         */
        int[] arr={1,2,3,1,3,5,1,4,3,7,4};
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==-1)
            {
                continue;
            }
            boolean isDup=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDup=true;
                    arr[j]=-1;
                }
            }
            if (isDup)
            {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
        String[] s={"java","python","c++","java","c#","c++","c#"};
        for(int i=0;i<s.length;i++)
        {
            boolean isVisited=false;

            for(int j=i+1;j<s.length;j++)
            {
                if(s[i].equals(s[j]))
                {
                    isVisited=true;
                }
            }
            if(isVisited)
            {
                System.out.print(s[i] + " ");
            }
        }
        System.out.println();
        /*
        with built in using Set
         */
        int[] arr1={1,2,3,1,3,5,1,4,3,7,4};
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicateInt=new HashSet<>();
        for(int num:arr1)
        {
            if(!seen.add(num))
            {
                duplicateInt.add(num);
            }
        }
        System.out.println(duplicateInt);
        String[] s1={"java","python","c++","java","c#","c++","c#"};
        Set<String> seenString=new HashSet<>();
        Set<String> duplicateString=new HashSet<>();
        for(String word:s1)
        {
            if(!seenString.add(word))
            {
                duplicateString.add(word);
            }
        }
        System.out.println(duplicateString);
        /*
        Built in using Streams
         */
        int[] arr2={1,2,3,1,3,5,1,4,3,7,4};
        Set<Integer> seenInteger=new HashSet<>();
        Set<Integer> dupInt= Arrays.stream(arr2)
                .boxed()
                .filter(i -> !seenInteger.add(i))
                .collect(Collectors.toSet());
        System.out.println("Streams: " +dupInt);

        String[] s2={"java","python","c++","java","c#","c++","c#"};
        Set<String> seenStr=new HashSet<>();
        Set<String> dupStr=Arrays.stream(s2)
                .filter(s4 -> !seenStr.add(s4))
                .collect(Collectors.toSet());
        System.out.println("Streams: " +dupStr);
    }
}
