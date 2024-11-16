package Revision.InterviewPrograms;

public class Palindrome_IntToString {
    public static void main(String[] args) {
        int num = 121 ;
        String name = String.valueOf(num);
        String rev = "";

        for (int i = name.length()-1; i>=0; i--){
           rev = rev + name.charAt(i);
        }
        System.out.println("Reverse string is " + rev);

        if (name.equals(rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
