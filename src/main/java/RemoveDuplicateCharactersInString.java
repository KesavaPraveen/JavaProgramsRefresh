import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        String s="KesavaPraveen";
        Set<Character> characters=new LinkedHashSet<>();
        for (char ch: s.toCharArray())
        {
            characters.add(ch);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(char ch:characters)
        {
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
        }
}
