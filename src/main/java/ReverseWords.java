import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=scanner.nextLine();

        String[] words=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            if(!words[i].isEmpty())
            {
                stringBuilder.append(words[i]).append(" ");
            }
        }
        System.out.println(stringBuilder.toString());

        StringBuilder s2=new StringBuilder();
        for(String word:words) {
            char[] chars = word.toCharArray();
            int left = 0, right = chars.length-1;
            while (left < right) {
                char temp = chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            s2.append(new String(chars)).append(" ");
        }
        System.out.println(s2.toString().trim());
    }
}
