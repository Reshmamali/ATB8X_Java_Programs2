package Revision.IfElseStatement;

import java.util.Scanner;

public class MaxNoBetweenThreeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int first_num = sc.nextInt();
        System.out.println("Enter second number ");
        int second_num = sc.nextInt();
        System.out.println("Enter third number ");
        int third_num = sc.nextInt();

        if (first_num>second_num && first_num>third_num){
            System.out.println("First number is greater");
        } else if (second_num>first_num && second_num>third_num){
            System.out.println("Second number is greater");
        }else {
            System.out.println("Third number is greater");
        }
    }
}
