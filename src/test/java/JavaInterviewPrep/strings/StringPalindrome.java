package JavaInterviewPrep.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        /*
        String Palindrome without using built in method
         */
        String input="hello";
        int left=0,right=input.length()-1;
        boolean isPalindrome=true;
        while(left<right)
        {
            if(input.charAt(left)!=input.charAt(right))
            {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

        /*
        String Palindrome check with built in method
         */
        String string="lisil";
        String reversed=new StringBuilder(string).reverse().toString();
        if(string.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }


    }
}
