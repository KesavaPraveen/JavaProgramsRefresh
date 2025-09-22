import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicatesInArray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the elements for the array: ");
    int[] arr = new int[5];
    for(int i = 0;i<arr.length;i++)
    {
        arr[i] = scanner.nextInt();
    }
    System.out.println("Elements in the array: "+Arrays.toString(arr));
    int n=arr.length;
    int[] temp = new int[n];
    int j=0;
    boolean isDuplicate;
    for(int i=0;i<n;i++)
    {
        isDuplicate=false;
        for(int k=0;k<j;k++)
        {
            if(arr[i]==temp[k]) {
                isDuplicate = true;
                break;
            }
        }
        if(!isDuplicate)
        {
            temp[j] = arr[i];
            j++;
        }
    }
        System.out.print("Elements in the array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
}
}
