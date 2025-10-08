package recapprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCountPrograms {
    public static void main(String[] args) {
        /*
       Frequency of Characters in String
       */
        String str="KesavaPraveen";
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
            System.out.println(entryMap.getKey()+ " : " +entryMap.getValue());
        }

       /*
       Frequency of Words in a Sentence
       */
        String string="best of best is to recap java daily java";
        String[] strings=string.split(" ");
        Map<String,Integer> countMaps=new HashMap<>();
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
            System.out.println(entryMap.getKey() + " : " +entryMap.getValue());
        }
    }
}
