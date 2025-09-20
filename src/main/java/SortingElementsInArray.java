import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsInArray {
    public static void main(String[] args) {

        /*
        Using Bubble Sort
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Elements in the array before sorting: " + Arrays.toString(arr));
        int [] sortedArray=bubbleSort(arr);
        System.out.println("Elements in the array after sorting: " +Arrays.toString(sortedArray));

    }

    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
