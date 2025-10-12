package JavaInterviewPrep.strings;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        /*
        Removing White Spaces in String without built in method
         */
        String s="  K e  s  a vaP   rav    een   ";
        String result="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                s1.append(s.charAt(i));
            }
        }
        System.out.println("String Builder: " +s1);

        /*
        Removing spaces with built in replaceAll method
         */
        String s2=s.replaceAll("\\s","");
        System.out.println(s2);
    }
}
