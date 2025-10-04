import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=scanner.nextLine();
        int vowelCount=0, consonantCount=0;
        s=s.toLowerCase();
        for(char ch: s.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels Count: " +vowelCount);
        System.out.println("Consonants Count: " +consonantCount);

    }
}
