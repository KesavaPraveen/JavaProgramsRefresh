package JavaInterviewPrep.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {
    public static void main(String[] args) {
        /*
        Manual Logic to sort in Ascending order
         */
        List<String> list= Arrays.asList("java","python","javascript","ruby","bash","shell");
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=0;j<list.size()-1-i;j++)
            {
                if(list.get(j).compareTo(list.get(j+1)) > 0)
                {
                    String temp= list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println("Ascending: " +list);
        /*
        Manual logic to sort in Descending order
         */
        List<String> list1= Arrays.asList("java","python","javascript","ruby","bash","shell");
        for(int i=0;i<list1.size()-1;i++)
        {
            for(int j=0;j<list1.size()-1-i;j++)
            {
                if(list1.get(j).compareTo(list1.get(j+1)) < 0)
                {
                    String temp= list1.get(j);
                    list1.set(j,list1.get(j+1));
                    list1.set(j+1,temp);
                }
            }
        }
        System.out.println("Descending: " +list1);

        /*
        Built in Logic
         */
        List<String> list2= Arrays.asList("java","python","javascript","ruby","bash","shell");
        Collections.sort(list2);
        System.out.println("Built in Ascending: " +list2);
        List<String> list3= Arrays.asList("java","python","javascript","ruby","bash","shell");
        Collections.sort(list3,Collections.reverseOrder());
        System.out.println("Built in Descending: " +list3);

        /*
        Streams
         */
        List<String> list4= Arrays.asList("java","python","javascript","ruby","bash","shell");
        List<String> streamList=list4.stream().sorted().collect(Collectors.toList());
        System.out.println("Streams Ascending: " +streamList);
        List<String> list5= Arrays.asList("java","python","javascript","ruby","bash","shell");
        List<String> streamsList1=list5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Streams Descending: " +streamsList1);
    }
}
