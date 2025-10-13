package JavaInterviewPrep.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        /*
        Manual Logic to reverse the list
         */
        List<String> list= Arrays.asList("java","python","javascript","ruby","bash","shell");
        int left=0, right=list.size()-1;
        while (left<right)
        {
            String temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println("Manual Reverse: " +list);

        /*
        Built in logic
         */
        List<String> list1= Arrays.asList("java","python","javascript","ruby","bash","shell");
        Collections.reverse(list1);
        System.out.println("Built in Reverse: " +list1);


    }
}
