import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Elements in the array: " + Arrays.toString(arr));
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        for(int num: arr)
        {
            if(num>largest)
            {
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;
            }
        }
        System.out.println("Second largest element in the array: " +secondLargest);
    }
}
