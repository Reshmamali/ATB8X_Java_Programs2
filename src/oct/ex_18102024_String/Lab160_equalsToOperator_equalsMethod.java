package oct.ex_18102024_String;

public class Lab160_equalsToOperator_equalsMethod {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); // Object Area
        String s4 = "Hello"; // SCP
        String s5 = new String("hello");

        // ==  This is checking the ref locations

//        System.out.println(s1==s2); // false
//        System.out.println(s2==s3); // false
//        System.out.println(s3==s4); // false
//        System.out.println(s1==s4); // true
//        System.out.println(s1==s5); // false


        // .equals method checks the value for the variable not the memory locatio
        System.out.println(s1.equals(s2)); // True
        System.out.println(s1.equals(s3)); // True
        System.out.println(s1.equals(s4)); // True
        System.out.println(s1.equals(s5)); // false
        System.out.println(s2.equals(s3)); // True
        System.out.println(s2.equals(s4)); // True
        System.out.println(s2.equals(s5)); // false
        System.out.println(s3.equals(s4)); // True
        System.out.println(s3.equals(s5)); // false
        System.out.println(s4.equals(s5)); // false

    }
}
