package JavaInterviewPrep.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String s="programming";
        Map<Character,Integer> countMap=new LinkedHashMap<>();
        for(char ch: s.toCharArray()) {
            if (countMap.containsKey(ch))
            {
                countMap.put(ch,countMap.get(ch)+1);
            }
            else {
                countMap.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entryMap: countMap.entrySet())
        {
            if(entryMap.getValue()>1)
            {
                System.out.print(entryMap.getKey());
            }
        }
    }
}
