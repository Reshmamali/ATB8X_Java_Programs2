package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        // Narrowing casting >> use case / practical example
        // long phone no. which is stored in long dt >>
        // jvm will not allow you to save this long phone number in short dt >>

        long phone_no = 9579408453l;
        // short result= phone_no; // Narrowing Implicit Casting >> JVM >> Invalid
        short s1 = (short) phone_no; // Narrowing explicit Casting >> loss
        System.out.println(s1);
    }
}
