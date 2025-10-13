package JavaInterviewPrep.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Reverse an Array without built in
         */
        String[] s={"java","python","c++","c#","goloang","bash","shell"};
        int left=0,right=s.length-1;
        while(left<right)
        {
            String temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));

    }
}
