package JavaInterviewPrep.arrays;

import java.util.Arrays;

public class SecondLargestAndSecondSmallestElementInArray {
    public static void main(String[] args) {
        /*
        Find Min and Max with sorting and without built in
         */
        System.out.println("Without Built in:");
        int[] arr={1,2,700,3,18,-1,89,-2,90};
        sorting(arr);
        int firstMax=arr[arr.length-1];
        int secondMax=arr[arr.length-2];
        int firstMin=arr[0];
        int secondMin=arr[1];
        System.out.println(Arrays.toString(arr));
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(firstMin);
        System.out.println(secondMin);

        /*
        Find Min and Max without sorting and without built in
         */
        int[] arr1={1,2,700,3,18,-1,89,-2,90};
        int max=Integer.MIN_VALUE;
        int secondMaximum=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondMinimum=Integer.MAX_VALUE;
        for(int num:arr1)
        {
            if(num > max)
            {
                secondMaximum=max;
                max=num;
            } else if (num >secondMaximum && num!=max) {
                secondMaximum=num;
            }
            if(num < min)
            {
                secondMinimum=min;
                min=num;
            } else if (num < secondMinimum && num!=min) {
                secondMinimum=num;
            }
        }
        System.out.println(max);
        System.out.println(secondMaximum);
        System.out.println(min);
        System.out.println(secondMinimum);

        /*
        With Built in method
         */
        System.out.println("With Built In:");
        int[] arr2={1,2,700,3,18,-1,89,-2,90};
        Arrays.sort(arr2);
        int maximum=arr[arr.length-1];
        int secMax=arr[arr.length-2];
        int minimum=arr[0];
        int secMin=arr[1];
        System.out.println(Arrays.toString(arr2));
        System.out.println(maximum);
        System.out.println(secMax);
        System.out.println(minimum);
        System.out.println(secMin);
    }
    public static void sorting(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
