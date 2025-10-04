import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=scanner.nextLine();

        String s1=covertToCamelCase(s);
        System.out.println("Camel Case: " +s1);

        String s2=covertToPascalCase(s);
        System.out.println("Pascal Case: " +s2);
    }

    public static String covertToCamelCase(String s) {
        String[] words=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(String word: words) {
            if (!s.isEmpty()) {
                stringBuilder.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static String covertToPascalCase(String s)
    {
        String[] words=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(String word: words) {
            if (!s.isEmpty()) {
                stringBuilder.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
        }
        return stringBuilder.toString().trim();
    }

}
