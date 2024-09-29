package sept.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.print(i);
            System.out.printf("\t");
        }
        System.out.println(" -- ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.printf("\t");
        }
        System.out.println();
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
            if (i == 'P') {
                break;
            }
        }
    }
}
