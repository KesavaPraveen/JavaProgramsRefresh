package JavaInterviewPrep.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        /*
        Removing Duplicates in String without built in method
         */
        String s="programming";
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(result.indexOf(ch) == -1)
            {
              result =result+ch;
            }
        }
        System.out.println(result);

        /*
        Removing Duplicate Characters in String with built in method
         */
        String input="KesavaPraveen";
        Set<Character> characterSet=new LinkedHashSet<>();
        for(char ch:input.toCharArray())
        {
            characterSet.add(ch);
        }
        StringBuilder s1=new StringBuilder();
        for(char ch: characterSet)
        {
            s1.append(ch);
        }
        System.out.println("Using Set after removing duplicates: " +s1);
    }
}
