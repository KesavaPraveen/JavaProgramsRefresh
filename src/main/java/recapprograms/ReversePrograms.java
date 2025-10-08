package recapprograms;

import java.util.Arrays;

public class ReversePrograms {
    public static void main(String[] args) {
        /*
        Practiced the below programs in Java Online Compiler
         */
         /*
        Reverse a String
        */
        String str="KesavaPraveen";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i)+"");
        }
        System.out.println();
        /*
        Reverse a number
        */
        int num=1234;
        int reverse=0;
        while(num!=0)
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println(reverse);
        /*
        Reverse an Array
        */
        int[] arr={12,23,34,45,56};
        int[] rev=new int[arr.length];
        int index=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            rev[index]=arr[i];
            index++;
        }
        System.out.println();
        System.out.println(Arrays.toString(rev));
    }
}
