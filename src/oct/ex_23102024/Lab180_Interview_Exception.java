package oct.ex_23102024;

public class Lab180_Interview_Exception {
    public static void main(String[] args){

        try {
            String s1 = "Pramod";
            String a1 = args[0];     // ArrayIndexOutOfBoundsException
            int a = 10 / 0;          // ArithmeticException
            s1 = null;
            System.out.println(s1.trim());    // NullPointerException
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program!");

    }
}
