package JavaInterviewPrep.arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        /*
        Array Sorting in Ascending and Descending without built in methods
         */
        int[] arr={1,2,700,3,18,-1,89,-2,90};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Ascending: " + Arrays.toString(arr));
        int[] arr1={1,2,700,3,18,-1,89,-2,90};
        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=0;j<arr1.length-1-i;j++)
            {
                if(arr1[j] < arr1[j+1])
                {
                    int temp= arr1[j];
                    arr1[j]= arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.println("Descending: " +Arrays.toString(arr1));

        /*
        With built in and for Descending Streams
         */
        int[] arr2={1,2,700,3,18,-1,89,-2,90};
        Arrays.sort(arr2);
        System.out.println("Built in Ascending: " +Arrays.toString(arr2));
        int[] desc=Arrays.stream(arr2)
                .boxed()
                .sorted((a,b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Built  in Descending: " +Arrays.toString(desc));

    }

}
