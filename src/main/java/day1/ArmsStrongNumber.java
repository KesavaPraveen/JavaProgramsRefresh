package day1;

public class ArmsStrongNumber {
    public static void main(String[] args) {
        int num=9474;
        int temp=num;
        double result=0;
        int digits=String.valueOf(num).length();
        while (num != 0)
        {
            int digit=num %  10;
            result=result + Math.pow(digit,digits);
            num= num / 10;
        }
        if(result==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not armstrong number");
        }
    }

}
