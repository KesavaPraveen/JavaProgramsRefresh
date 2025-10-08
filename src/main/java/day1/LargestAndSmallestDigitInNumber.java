package day1;

public class LargestAndSmallestDigitInNumber {
    public static void main(String[] args) {
        int num=5672;
        int largest=0;
        int smallest=9;
        while(num!=0)
        {
            int digit=num%10;
            if(digit>largest)
            {
                largest=digit;
            }
            if(digit<smallest)
            {
                smallest=digit;
            }
            num=num/10;
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
