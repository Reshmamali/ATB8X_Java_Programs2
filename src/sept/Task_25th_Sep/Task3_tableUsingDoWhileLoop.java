package sept.Task_25th_Sep;

import java.util.Scanner;

public class Task3_tableUsingDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number = ");
        int num = sc.nextInt();
        int i = 1;

        do{
            System.out.println(num*i);
            i++;
        }while(i<=10);
    }
}
