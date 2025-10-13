package JavaInterviewPrep.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInArrays {
    public static void main(String[] args) {
        /*
        Find Common elements in two arrays for Integer and String types
         */
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={4,5,6};
        Set<Integer> set1=new HashSet<>();
        for(int num: arr1)
        {
            set1.add(num);
        }
        Set<Integer> set2=new HashSet<>();
        for(int num: arr2)
        {
            set2.add(num);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
