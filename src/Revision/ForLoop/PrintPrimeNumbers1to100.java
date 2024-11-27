package Revision.ForLoop;

public class PrintPrimeNumbers1to100 {
    public static void main(String[] args) {
        //Print prime numbers from 1 to 100
        for (int i = 2; i<=100 ; i++){
            int count = 0;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    count = count + 1;
                }
            }

            if (count == 0 ){
                System.out.print(i + " ");
            }
        }
    }
}
