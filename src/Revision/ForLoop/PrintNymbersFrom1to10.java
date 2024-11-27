package Revision.ForLoop;

public class PrintNymbersFrom1to10 {
    public static void main(String[] args) {
        for (int i = 10; i>=0; i--){
            if (i==4){
                System.out.println("My lucky number is 4");
            }else if(i==8){
                System.out.println("My lucky number is 8");
            }else{
                System.out.println(i);
            }
        }
    }
}
