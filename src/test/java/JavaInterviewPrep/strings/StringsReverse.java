package JavaInterviewPrep.strings;

public class StringsReverse {
    public static void main(String[] args) {
        /*
        String reverse without built in method
         */
        String input="hello";
        StringBuilder reverse= new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            reverse.append(input.charAt(i));
        }
        System.out.println("Manual Reverse: " +reverse);

        /*
        String reverse with built in method
         */
        String s="hello";
        String reversed= new StringBuilder(s).reverse().toString();
        System.out.println("Built-In Reverse: " +reversed);
    }
}
