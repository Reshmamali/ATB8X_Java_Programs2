package oct.ex_23102024;

public class Lab178_Parent {
    public static void main(String[] args) {
        int b = 0;

        try {
            String ip = args[0];  // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000 / a;     // ArithmeticException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        catch (Object e) { // Can't Use
//            System.out.println(e.getMessage());
//        }


    }
}
