package day1;

public class SwapNumberWithoutTemp {
    public static void main(String[] args) {
        int a=100, b=121;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
