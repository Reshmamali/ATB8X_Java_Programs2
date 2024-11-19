package Revision.Ternary_Operator;

import java.util.Scanner;

public class VoteEligibiltyChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age =sc.nextInt();

     String result = (age>18)? "can vote" : "can't vote";
        System.out.println("result");
    }
}
