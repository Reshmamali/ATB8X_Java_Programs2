package oct.ex_23102024.Custom_exception;

public class Lab183 {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 200);
        Bank HDFC = new Bank("INR", 300);
        Bank icici = new Bank("USD", 200);

        System.out.println(sbi.add(HDFC));
        System.out.println(sbi.add(icici));
    }
}
