import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[8];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Elements in the array: " + Arrays.toString(arr));
        int maxvalue=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                maxvalue=arr[i];
            }
        }
        System.out.println("Largest Element in the array: " +maxvalue);
    }
}
