package JavaInterviewPrep.arrays;

import java.util.Arrays;

public class SumAndAvgInArray {
    public static void main(String[] args) {
        /*
        Without built in method
         */
        int[] arr={1,2,700,3,18,-1,89,-2,90};
        int sum=0;
        for(int num:arr)
        {
            sum=sum+num;
        }
        int count=arr.length;
        double avg=sum/count;
        System.out.println("sum of the elements in array: " +sum);
        System.out.println("avg of the elements in array: " +avg);

        /*
        With built in
         */
        int totalSum= Arrays.stream(arr).sum();
        double totalAvg=Arrays.stream(arr).average().getAsDouble();
        System.out.println(totalSum);
        System.out.println(totalAvg);

    }
}
