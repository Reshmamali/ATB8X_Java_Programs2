package oct.ex_23102024;

public class Lab186 {
    public static void main(String[] args) {
        try {
            int c =  10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
