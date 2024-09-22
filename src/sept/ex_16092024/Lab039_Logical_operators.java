package sept.ex_16092024;

public class Lab039_Logical_operators {
    public static void main(String[] args) {
        // ✅ Logical operators
        // !, &&, ||
        boolean a, b,c;
        a = true;
        b = true;
        c = true && false;
        //c = true && true; >> o/p : true
        System.out.println(c);

        c = true || false;
        System.out.println(c);
        System.out.println(!b);
        System.out.println(!a);


    }
}
