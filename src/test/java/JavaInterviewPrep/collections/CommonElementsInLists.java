package JavaInterviewPrep.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInLists {
    public static void main(String[] args) {
        /*
        Finding common elements in two lists
         */
        List<String> list= Arrays.asList("java","python","c++","ruby");
        List<String> list1=Arrays.asList("python","ruby","go","java");
        List<String> commonList=new ArrayList<>();
        for(String s: list)
        {
            if(list1.contains(s))
            {
                commonList.add(s);
            }
        }
        System.out.println("Common Elements: " +commonList);
    }
}
