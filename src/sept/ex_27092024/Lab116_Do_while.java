package sept.ex_27092024;

public class Lab116_Do_while {
    public static void main(String[] args) {
        //  While -> int -> condition -> body -> increment / decrement
        // Do while  -> // int -> body -> condition -> incre / drement

        int a = 0; // Initialization
        do{
            System.out.println("Print"+a); // Body
            a++; // Increment / Decrement
        }while (a<=10); // Condition
    }
}
