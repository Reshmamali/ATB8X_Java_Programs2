package sept.ex_18092024;

public class Lab053_Incrmt_dcrmt_oprtr {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operator
        //Pre and Post
        //Ready

        //pre increment - ++operand.
        // Value is incremented first and then stored in the result.
        int a = 10;
        int b = ++a; // a = a + 1;
        //  | a | output (b)
        //    10
        //    11 | 11
        System.out.println(b);
        System.out.println(a);


        // Post increment >> Value will be stored first and then incremented by one
        int a1 = 20;
        System.out.println(a1++);
        System.out.println(a1);
    }
}
