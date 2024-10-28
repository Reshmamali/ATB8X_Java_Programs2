package Revision;

public class Print_tables_1To10 {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 1; i<=num ; i ++){
            for (int j = 1; j <= num; j++){
                System.out.printf("%2d", (i*j));
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}
