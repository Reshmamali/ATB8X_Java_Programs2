package Revision.SwitchCase;

import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        String ch = sc.next();
        int a = 30 ;
        int b = 7 ;

        switch(ch){
            case "addition" :
                System.out.println(a+b);
                break;
            case "substraction" :
                System.out.println(a-b);
                break;
            case "multiplication" :
                System.out.println(a*b);
                break;
            case "division" :
                System.out.println(a/b);
                break;
            default:
                System.out.println("No such case is there");
        }
    }
}
