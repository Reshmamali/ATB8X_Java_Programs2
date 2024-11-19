package Revision.InterviewPrograms;

public class PalindromeCheckerByConvertingCase {
    public static void main(String[] args) {
        String str = "Madam";
        str=str.toLowerCase();
        String Rev = "";

        for (int i = str.length()-1; i>=0; i--){
            Rev = Rev + str.charAt(i);
        }
        System.out.print("Reverse string is " + Rev);
        System.out.println();

        if(str.equals(Rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
}
