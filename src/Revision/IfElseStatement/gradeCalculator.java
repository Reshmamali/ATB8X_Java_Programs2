package Revision.IfElseStatement;

import java.util.Scanner;

public class gradeCalculator  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        char Grade;

        if(score>=90 && score<=100){
            Grade = 'A';
        }else if(score>=80 && score<=89){
            Grade = 'B';
        } else if (score>=70 && score<=79) {
            Grade = 'C';
        } else if (score>=60 && score<=69) {
            Grade = 'D';
        }else if (score<=0 || score>=100){
            System.out.println("Lol, are you a god!");
            Grade = '0';
        }else{
            Grade = 'F';
        }
        System.out.println("Your grade is "+ Grade);
    }
}
