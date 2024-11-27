package Revision.SwitchCase;

import java.util.Scanner;

public class ChoiceOfDays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice of day");
        int days = sc.nextInt();

        switch(days){
            case 1 :
                System.out.println("Monday");

            case 2 :
                System.out.println("Tuesday");

            case 3 :
                System.out.println("Wednesday");

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("There is no such day");
                break;
        }
    }
}
