package JavaInterviewPrep.strings;

public class CountCharactersInString {
    public static void main(String[] args) {
        /*
        Character Count in String without built in method
         */
        String s="Kesava Praveen";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("Count of String excluding spaces: " +count);

        /*
        Character Count in String with built in method
         */
        String input="Kesava Praveen";
        int countChar=input.replace(" ","").length();
        System.out.println("Count of Characters Exclusing spaces: " +countChar);

        /*
        Removing the space with regex
         */
        String input1="Java is Literally Nice";
        int countChars=input1.replaceAll("\\s","").length();
        System.out.println("Count with Replace All method: " +countChars);

    }
}
