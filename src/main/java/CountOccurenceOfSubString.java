import java.util.Scanner;

public class CountOccurenceOfSubString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=scanner.nextLine();
        System.out.println("Enter the Sub String: ");
        String sub=scanner.nextLine();
        int count= getSubStringCount(s,sub);
        System.out.println("Count of " +sub+ " :" +count);
    }

    public static int getSubStringCount(String s, String sub) {
        int index=0,count=0;
        while((index=s.indexOf(sub,index)) != -1)
        {
            count++;
            index=index+sub.length();
        }
        return count;
    }
}
