package Revision.ForLoop;

import java.util.Scanner;

public class PrintTableOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want a table");
        int num = sc.nextInt();
        int result = 0 ;

        for (int i = 1; i<=10; i++){
            result = num * i;
            System.out.println(result);
        }

    }
}
