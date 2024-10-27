package oct.ex_23102024;

public class Lab176_Exception_handle {
    public static void main(String[] args) {

        int a= 0;

        try {
            int b = 10 / a;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("I will be always executed");
        }

    }
}
