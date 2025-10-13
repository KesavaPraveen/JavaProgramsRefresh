package JavaInterviewPrep.strings;

public class CountWordsInString {
    public static void main(String[] args) {
        /*
        Count Words in String without built in method
         */
        String s="   Kesava   Praveen  is a QA  Engineer";
        boolean inWord=false;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            }else {
                    inWord = false;
                }
            }
        System.out.println("Word Count: " +count);

        /*
        Count Words in String with built in method
         */
        s=s.trim();
        String[] words=s.split("\\s+");
        System.out.println("Built in - Words Count: " +words.length);
    }
}
