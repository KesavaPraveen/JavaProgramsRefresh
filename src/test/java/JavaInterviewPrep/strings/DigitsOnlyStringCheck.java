package JavaInterviewPrep.strings;

public class DigitsOnlyStringCheck {
    public static void main(String[] args) {
        /*
        Without Built in
         */
        String s="12345";
        boolean onlyDigit=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!(ch>='0' && ch<='9'))
            {
                onlyDigit=false;
                break;
            }
        }
        System.out.println("Only Digits: " +onlyDigit);

        /*
        With built in
         */
        boolean isDigit=s.matches("\\d+");
        System.out.println("Built in - Only Digits: " +isDigit);
    }
}
