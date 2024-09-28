package sept.ex_25092024;

public class Lab097_intQ {
    public static void main(String[] args) {
        final boolean b = true;
      //  b = !true; // final value can't be changed

        for (int a = 0; b ; a++){
            System.out.println("Hello");
        }

        // value of b is always true hence the loop will be infinite
    }
}
