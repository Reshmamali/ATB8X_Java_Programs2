package oct.ex_18102024_String;

public class Lab162_string_immutable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = str1.concat(" World");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        str1 = str1.concat(" world");
        System.out.println(str1);

    }
}
