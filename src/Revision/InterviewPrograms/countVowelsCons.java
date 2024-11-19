package Revision.InterviewPrograms;

public class countVowelsCons {
    public static void main(String[] args) {
        String str = "Reshmasharadmali";
        int vCount = 0;
        int cCount = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cCount++;
            }
        }
        System.out.println(vCount );
        System.out.println(cCount );
    }
}
