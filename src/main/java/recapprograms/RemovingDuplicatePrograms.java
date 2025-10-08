package recapprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemovingDuplicatePrograms {
    public static void main(String[] args) {
         /*
        Removing Duplicate Characters in the String
        */
        String str="KesavaPraveen";
        System.out.println(str);
        StringBuilder strBuild=new StringBuilder();
        Map<Character,Integer> countMap=new LinkedHashMap<>();
        for(char ch: str.toCharArray())
        {
            if(countMap.containsKey(ch))
            {
                countMap.put(ch,countMap.get(ch)+1);
            }
            else
            {
                countMap.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entryMap: countMap.entrySet())
        {
            if(entryMap.getValue()==1)
            {
                strBuild.append(entryMap.getKey());
            }
        }
        System.out.println(strBuild);
        /*
        Removing Duplicate words in the sentence
        */
        String string="best of best is to recap java daily java";
        StringBuilder builder=new StringBuilder();
        System.out.println(string);
        String[] strings=string.split(" ");
        Map<String,Integer> countMaps=new LinkedHashMap<>();
        for(String s: strings)
        {
            if(countMaps.containsKey(s))
            {
                countMaps.put(s,countMaps.get(s)+1);
            }
            else
            {
                countMaps.put(s,1);
            }
        }
        for(Map.Entry<String,Integer> entryMap: countMaps.entrySet())
        {
            if(entryMap.getValue()==1)
            {
                builder.append(entryMap.getKey()).append(" ");
            }
        }
        System.out.println(builder);
         /*
        Removing Duplicates in Array
        */
        int[] arr={1,2,3,4,5,1,1,3,8,2};
        System.out.println(Arrays.toString(arr));
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.print(entry.getKey()+ " ");
            }
        }
    }
}
