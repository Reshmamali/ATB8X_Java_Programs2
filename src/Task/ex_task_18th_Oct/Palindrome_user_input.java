package Task.ex_task_18th_Oct;

import java.util.Scanner;

public class Palindrome_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input = ");
        String name = sc.next();
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
