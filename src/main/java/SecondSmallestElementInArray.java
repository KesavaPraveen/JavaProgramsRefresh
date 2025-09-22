import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Elements in the array: " + Arrays.toString(arr));
        int smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;
        for(int num: arr)
        {
            if(num<smallest)
            {
                secondSmallest=smallest;
                smallest=num;
            } else if (num<secondSmallest && num!=smallest) {
                secondSmallest=num;
            }
        }
        System.out.println("Second smallest element in the array: " +secondSmallest);
    }
}
