package JavaInterviewPrep.arrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        /*
        Merging arrays without built in
         */
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] merged=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            merged[i]=arr1[i];
        }
        System.out.println(Arrays.toString(merged));
        for(int j=0;j<arr2.length;j++)
        {
            merged[arr1.length + j]=arr2[j];
        }
        System.out.println(Arrays.toString(merged));

        /*
        With built in
         */
        int[] merge=Arrays.copyOf(arr1,arr1.length+arr2.length);
        System.out.println(Arrays.toString(merge));
        System.arraycopy(arr2,0,merge,arr1.length,arr2.length);
        System.out.println(Arrays.toString(merge));
    }
}
