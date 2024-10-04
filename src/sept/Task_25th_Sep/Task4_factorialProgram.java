package sept.Task_25th_Sep;

import java.util.Scanner;

public class Task4_factorialProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number = ");
        int num = sc.nextInt();
        int fact = 1;

//        for(int i=5; i>=1; i--){
//            fact = fact*i;
//        }
//        System.out.println(fact);

        //fact =1     i = 5
        //      5         4
        //      20        3
        //      60        2
        //      120       1
        //          120

        for (int i= 1; i<=num; i++) {
            fact = fact * i ;
        }
        System.out.println("Factorial of num = " + fact);



    }
}
