package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        // Type casting
        // widening >> Implicit casting >> lossless
        // narrowing >> Explicit casting >> Loss of data

        // widening
        byte a = 10;
        int b = a; // valid implicit casting >> JVM
        int c = (int) b;
        // explicit casting >> JVM // no use to do the casting explicitly >> useless (int)

        // Narrowing casting
        /* use case / practical example long phone no. which is stored in long dt
        >> jvm will not allow you to save this long phone number in short dt >>
        narrowing implicit casting is not allowed*/

        int val = 300; //byte b = val; Invalid implicit casting >> JVM will not allowed
        byte b1 = (byte)val; // Valid explicit casting >> not done by JVM
        System.out.println(b1);
    }
}
