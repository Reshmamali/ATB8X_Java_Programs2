package Revision.InterviewPrograms;

import java.util.Scanner;

public class CheckEvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number - ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
