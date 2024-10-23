package oct.ex_21102024_WrapperClass_exceptions;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        Integer a = Integer.valueOf(num);
        System.out.println(a);

        // valueOf >>  int to Integer or String to Integer
        Integer b = Integer.valueOf(num);  // boxing
        System.out.println(b);
        int a2 = b; // Unboxing

        // String to Primitive?
        int a3 = Integer.parseInt(num);

        // int a = 10; -> these are not class or object
        // Integer -> Collection Framework (You can use Class and Object)

    }
}
