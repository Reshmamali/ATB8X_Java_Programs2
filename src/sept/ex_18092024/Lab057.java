package sept.ex_18092024;

public class Lab057 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); // (10 + 1) + ( 1 + 10)
        System.out.println(a); // 12
        System.out.println(a++ + ++a + --a); // 12 + 14 + 13 = 39
        System.out.println(a); // 13

        // A -> a++ -> 10 , a= 11
        // + -> operator
        // B -> ++a  -> a= 12 exp -> 12

        // Line no | a  |  Exp
        // 5   | 10 | NA
        // 6  | 12 | 10 + 12
    }
}
