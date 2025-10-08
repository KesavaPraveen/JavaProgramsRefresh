package day1;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);
        int subtraction = calculator.sub(20, 30);
        int multiplication = calculator.sub(10, 10);
        int division = calculator.divide(20, 2);
        System.out.println("Addition: " +addition);
        System.out.println("Subtraction: " +subtraction);
        System.out.println("Multiplication: " +multiplication);
        System.out.println("Division: " +division);
    }
    public int add(int a ,int b)
    {
        return a+b;
    }

    public int sub(int a ,int b)
    {
        return a-b;
    }
    public int multiply(int a ,int b)
    {
        return a*b;
    }
    public int divide(int a ,int b)
    {
        return a/b;
    }
}
