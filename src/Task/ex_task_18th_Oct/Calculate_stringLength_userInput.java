package Task.ex_task_18th_Oct;

import java.util.Scanner;

public class Calculate_stringLength_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.next();

        int length = 0 ;

        for (char a:input.toCharArray()){
            length++;
        }
        System.out.println("Length of string is : " + length);
    }
}
