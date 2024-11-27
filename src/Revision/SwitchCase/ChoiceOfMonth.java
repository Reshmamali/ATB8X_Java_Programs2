package Revision.SwitchCase;

import java.util.Scanner;

public class ChoiceOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice between 1 to 12");
        int ch = sc.nextInt();

        switch (ch){
            case 1 -> System.out.println("My favourite month is January ");
            case 2 -> System.out.println("My favourite month is Feb");
            case 3 -> System.out.println("My favourite month is March");
            case 4 -> System.out.println("My favourite month is April");
            case 5 -> System.out.println("My favourite month is May");
            case 6 -> System.out.println("My favourite month is June");
            case 7 -> System.out.println("My favourite month is July");
            case 8 -> System.out.println("My favourite month is August");
            case 9 -> System.out.println("My favourite month is September");
            case 10 -> System.out.println("My favourite month is October");
            case 11 -> System.out.println("My favourite month is November");
            case 12 -> System.out.println("My favourite month is December");
        }
    }
}
