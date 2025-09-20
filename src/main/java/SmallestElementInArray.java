import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Elements in the array: " + Arrays.toString(arr));
        int minValue=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] < minValue)
            {
                minValue=arr[i];
            }
        }
        System.out.println("Smallest Element in the array: " +minValue);
    }
}
