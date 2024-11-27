package Revision.ForLoop;

import java.util.Scanner;

public class FactorialOfnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number for which you want a factorial");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
