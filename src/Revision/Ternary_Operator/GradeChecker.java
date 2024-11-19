package Revision.Ternary_Operator;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage -");
        float score = sc.nextInt();

        String grade = (score>=90)? "A" :(score>=80)? "B" : (score>=70)? "C": "Fail";
        System.out.println("My grade is " + grade);
    }
}
