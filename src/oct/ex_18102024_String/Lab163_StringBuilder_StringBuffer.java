package oct.ex_18102024_String;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {
//        String name = "Pramod";

//        final class StringBuffer   >> mutable >> tread safe >> slow performance
        StringBuffer str1 = new StringBuffer("Pramod");
        StringBuffer str2 = new StringBuffer("Dutta");
        str1.append(" Dutta");
        str2.append(" Pramod");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.insert(3 , " fff "));
        System.out.println(str1.delete(3,8));
        System.out.println(str1.reverse());

    // C1, C2 -> Toy
    //  C1 - Toy 2 -> C2 Toy ->2 - Syn - Thread Safty - Slow


//      final class StringBuilder >> mutable >> not tread safe >> fast performance
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append(" World")); // Outputs: Hello World
        System.out.println(sb.insert(5, ",")); // Outputs: Hello, World
        System.out.println(sb.delete(5, 6)); // Outputs: Hello World
        System.out.println(sb.reverse()); // Outputs: dlroW olleH/

    }
}
