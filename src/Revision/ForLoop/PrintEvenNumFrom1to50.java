package Revision.ForLoop;

public class PrintEvenNumFrom1to50 {
    public static void main(String[] args) {
        for (int i = 1; i<=50; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("Second alternate way to print even numbers");

        for (int i = 1; i<=50; i = i + 2){
            System.out.println(i);
        }
    }
}





