package Revision.WhileAndDoWhileLoop;

public class PrintSumOfNumFrom1to100 {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 0;

        while(i<=100){
            sum += i ;
            i++;
        }
        System.out.println(sum);

        System.out.println("********************************");

        int sum1 = 0 ;
        int i1 = 0;

        do {
            sum1 += i1;
            i1++;
        }while(i1<=100);

        System.out.println(sum1);
    }
}
