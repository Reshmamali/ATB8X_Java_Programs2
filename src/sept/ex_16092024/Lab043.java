package sept.ex_16092024;

public class Lab043 {
    public static void main(String[] args) {
        //logical operator (! ||) with relational operator (< > )
        int a = 12;
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);
        //!(true) >> false
    }
}
