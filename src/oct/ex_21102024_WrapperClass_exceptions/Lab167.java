package oct.ex_21102024_WrapperClass_exceptions;

public class Lab167 {
    public static void main(String[] args) {
        // Primitive to Wrapper class
        int a = 10;
        Integer b = a; // Boxing - int -> Integer
        Integer c = Integer.valueOf(a);
        System.out.println(c);
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int d = c; // unboxing
        System.out.println(d);

        Integer a2 = 42;
        int value = a2; // Unboxing  - Integer -> int
        System.out.println(value);

    }
}
