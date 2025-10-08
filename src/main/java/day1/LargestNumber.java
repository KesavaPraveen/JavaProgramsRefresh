package day1;

public class LargestNumber {
    public static void main(String[] args) {
        int a=13,b=11,c=89;
        if(a>b && a>c)
        {
            System.out.println("A is greatest");
        } else if (b>c) {
            System.out.println("B is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
    }
}
