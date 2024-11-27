package Revision.WhileAndDoWhileLoop;

public class PrintFirst5evenNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while(count<5){
            System.out.println(number);
            number += 2 ;
            count++;
        }

        System.out.println("******************************************");

        int count1 = 0 ;
        int num1 = 2 ;
        do{
            System.out.println(num1);
            num1 += 2;
            count1 ++ ;
        }while(count1<5);
    }
}
