package sept.ex_20092024;

public class Lab071 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;   // value of 'a' is false

        if (2 + 2 < 4) { // JVM will not enter in the loop
            System.out.println("Inside the loop"); // not execute
//            This will never execute because there is no else statement for false condition
        }
        System.out.println("Outside -> " + a);
    }
}
