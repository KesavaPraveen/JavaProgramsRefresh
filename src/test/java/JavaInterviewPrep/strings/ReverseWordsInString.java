package JavaInterviewPrep.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        /*
        Reverse Words In String without changing the order without built in method
         */
        String s="Hello World Java";
        String[] strings=s.split(" ");
        for(int i=0;i< strings.length;i++)
        {
            System.out.print(revString(strings[i]+ " "));
        }
        System.out.println();
        /*
        Reverse Words in String with String Builder built in reverse method
         */
        String input="Kesava Praveen Saravanan";
        String[] inputs=input.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: inputs)
        {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
    public static String revString(String s1)
    {
        String revString="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            revString=revString+s1.charAt(i);
        }
        return revString;
    }

}
