package Nov.ex_04112024.Generics;

public class Lab216_Generics_created {
    public static void main(String[] args) {
        temp(12);
        temp(true);
        temp("Pramod");
        // T - Ref - It can be anything.
    }
    public static <T> void temp(T a) {
        System.out.println(a);
    }
}
