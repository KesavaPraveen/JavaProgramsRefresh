package JavaInterviewPrep.strings;

public class VowelsAndConsonantsCount {
    public static void main(String[] args) {
        /*
        Count of Vowels and Consonants in String without built in method
        Checking only for alphabets and excluding if there are numbers or characters
         */
        String s="Kesava123#Praveen#123";
        s=s.toLowerCase();
        char[] ch=s.toCharArray();
        int vowels=0,consonants=0;
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))
            {
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
                {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels Count: " +vowels);
        System.out.println("Consonants Count: " +consonants);

        /*
        Counting Vowels and Consonants using built in methods
        Using Streams
         */
        String input="ShreeKr124i!@8shna".toLowerCase();
        long vowel= input
                .chars()
                .filter(chs -> "aeiou".indexOf(chs) != -1)
                .count();
        long consonant= input
                .chars()
                .filter(Character::isLetter)
                .filter(chs -> "aeiou".indexOf(chs) == -1)
                .count();
        System.out.println("Vowel Count with Streams: " +vowel);
        System.out.println("Consonant Count with Streams: " +consonant);
    }
}
