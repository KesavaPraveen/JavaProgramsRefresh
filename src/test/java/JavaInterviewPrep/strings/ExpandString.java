package JavaInterviewPrep.strings;

public class ExpandString {
    public static void main(String[] args) {

        /*
        Input - a2b3c4
        Output - aabbbcccc
         */
        String s="a1b2c3d4";
        StringBuilder result= new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                int count = Character.getNumericValue(s.charAt(i+1));
                {
                    for (int j = 1; j <= count; j++) {
                        result.append(ch);
                    }
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
