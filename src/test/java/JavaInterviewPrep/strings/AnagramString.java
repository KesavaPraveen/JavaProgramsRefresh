package JavaInterviewPrep.strings;

import java.util.Arrays;
import java.util.Collections;

public class AnagramString {
    public static void main(String[] args) {
        /*
        Anagram String without built in method
         */
        String s1 = "aSilent";
        String s2 = "listena";
        boolean areAnagrams = true;
        if (s1.length() != s2.length()) {
            areAnagrams = false;
        } else {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            sorting(ch1);
            sorting(ch2);
            if (!Arrays.equals(ch1, ch2)) {
                areAnagrams = false;
            }
        }
        if (areAnagrams) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        /*
        Anagram String with built in method
         */
        String s3 = "heartf";
        String s4 = "eartha";
        if (s3.length() != s4.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] ch3 = s3.toLowerCase().toCharArray();
        char[] ch4 = s4.toLowerCase().toCharArray();
        Arrays.sort(ch3);
        Arrays.sort(ch4);
        if (Arrays.equals(ch3, ch4)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
            }
    }

    public static void sorting(char[] ch)
    {
        for(int i=0;i<ch.length-1;i++)
        {
            for(int j=0;j<ch.length-1-i;j++)
            {
                if(ch[j]>ch[j+1]) {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
    }
}
