package Task.ex_task_18th_Oct;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Reshma";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println( "reverse string is : " + reverse);

        if (name.equals(reverse)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
