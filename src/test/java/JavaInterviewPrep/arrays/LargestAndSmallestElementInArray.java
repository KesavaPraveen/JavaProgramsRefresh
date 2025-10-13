package JavaInterviewPrep.arrays;

import java.util.Arrays;

public class LargestAndSmallestElementInArray {
    public static void main(String[] args) {
        /*
        Finding Maximum element in array without built in method
         */
        int[] arr={1,2,700,3,18,-1,89,-2,90};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum Element: " +max);
        System.out.println("Minimum Element: " +min);

        /*
        With built in method
         */
        int maximum=Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum built in: " +maximum);
        int minimum=Arrays.stream(arr).min().getAsInt();
        System.out.println("Minimum Built in: " +minimum);
    }
}
