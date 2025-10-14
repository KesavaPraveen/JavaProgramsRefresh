package JavaInterviewPrep.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatedProgram {
    public static void main(String[] args) {
    /*
    First Non Repeated Character In String
     */
        String s = "propoaigramming";
        Map<Character, Integer> cmap = new LinkedHashMap<>();
        for (char ch : s.toCharArray())
        {
            if(cmap.containsKey(ch))
            {
                cmap.put(ch,cmap.get(ch) + 1);
            }
            else {
                cmap.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: cmap.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("First Non Repeated Character: " +entry.getKey());
                break;
            }
        }
            /*
            First Non Repeated Word In Sentence
            */
        String s1 = "java is the best is the best of the java";
        String[] words=s1.split(" ");
        Map<String, Integer> wmap = new LinkedHashMap<>();
        for (String word : words)
        {
            if(wmap.containsKey(word))
            {
                wmap.put(word,wmap.get(word) + 1);
            }
            else {
                wmap.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry: wmap.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("First Non Repeated Word: " +entry.getKey());
                break;
            }
        }
        /*
        First Non Repeated String and Integer in List
         */
        List<String> list= Arrays.asList("java","python","c","java","python","ruby","c","ruby","go");
        Map<String, Integer> lmap = new LinkedHashMap<>();
        for (String word : list)
        {
            if(lmap.containsKey(word))
            {
                lmap.put(word,lmap.get(word) + 1);
            }
            else {
                lmap.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry: lmap.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("First Non Repeated String in List: " +entry.getKey());
                break;
            }
        }
        List<Integer> list1=Arrays.asList(1,2,3,4,5,1,2,4);
        Map<Integer, Integer> l1map = new LinkedHashMap<>();
        for (int num : list1)
        {
            if(l1map.containsKey(num))
            {
                l1map.put(num,l1map.get(num) + 1);
            }
            else {
                l1map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: l1map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("First Non Repeated Integer in List: " +entry.getKey());
                break;
            }
        }
    }
}
