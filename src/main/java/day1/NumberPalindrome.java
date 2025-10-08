package day1;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num=12121;
        int temp=num;
        int reverse=0;
        while(num !=0)
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(reverse==temp)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
    }
}
