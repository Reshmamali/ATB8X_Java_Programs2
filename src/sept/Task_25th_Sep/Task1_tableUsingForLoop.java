package sept.Task_25th_Sep;

import java.util.Scanner;

public class Task1_tableUsingForLoop {
    public static void main(String[] args) {
        // Print table using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for which you want to print the table =  ");
        int num = sc.nextInt();
        System.out.println("multiplication of table = ");
        for(int i=1; i <= 10; i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}
