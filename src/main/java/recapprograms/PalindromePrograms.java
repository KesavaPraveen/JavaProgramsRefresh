package recapprograms;

public class PalindromePrograms {
    public static void main(String[] args) {
        /*
        Practiced the below in Java Online Compiler
         */
        /*
       String Palindrome Validation
       */
        String str="aMadama";
        str=str.toLowerCase();
        int left=0,right=str.length()-1;
        boolean isPalindrome=false;
        while(left<right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                isPalindrome=true;
            }
            else{
                isPalindrome=false;
            }
            left++;
            right--;
        }
        System.out.println("Given String is Palindrome: " +isPalindrome);

        /*
        Number Palindrome Validation
        */
        int num=1221;
        int original=num;
        int rev=0;
        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==original)
        {
            System.out.println("Given number is a palindrome number");
        }
        else
        {
            System.out.println("Given number is not a palindrome number");
        }

    }
}
