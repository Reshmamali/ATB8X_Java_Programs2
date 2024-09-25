package sept.ex_18092024;

public class Lab061 {
    public static void main(String[] args) {
        int a = 10;
        //int result = a--;
        int result = --a;
        System.out.println(a);
        System.out.println(result);

        System.out.println(--a + ++a + a-- ); //8 + 9 + 9 = 26
        System.out.println(a); // 8
    }
}
