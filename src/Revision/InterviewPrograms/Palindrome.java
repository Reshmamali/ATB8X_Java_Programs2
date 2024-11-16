package Revision.InterviewPrograms;

public class Palindrome {
    public static void main(String[] args) {
        String a = "121";
        String reverse = "";

        for (int i = a.length()-1 ; i>=0; i--){
            reverse = reverse + a.charAt(i);
        }
        System.out.println("Reverse String is " + reverse);

        if(a.equals(reverse)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
