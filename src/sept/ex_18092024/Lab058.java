package sept.ex_18092024;

public class Lab058 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a); //11 + 12 = 23
        System.out.println(a); //12

        System.out.println(++a + --a); //13 + (13-1) = 25
        System.out.println(a); // 12

        // A  -> ++a ->  Exp1 -> 11 , a = 11
        //  +
        // B- > ++a  ->  a = 12 , Exp2 = 12
        // 23 , 12

    }
}
