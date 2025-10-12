package JavaInterviewPrep.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequencyCount {
    public static void main(String[] args) {
        /*
        Character Frequency Count in String without built in method
         */
        String input="programming";
        Map<Character,Integer> countMap=new LinkedHashMap<>();
        for(char ch: input.toCharArray()) {
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
            System.out.println(entryMap.getKey()+ ":"+entryMap.getValue());
        }
    }
}
