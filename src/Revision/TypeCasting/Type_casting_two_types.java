package Revision.TypeCasting;

public class Type_casting_two_types {
    public static void main(String[] args) {
//        Widning
        int a = 300;
        double b = a;  // implicit widning >> VALID
        double b1 =(double) a;  // Explicit widning >> VALID  // no need

//        Narrowing
        int c = 300;
//        byte d = c;   // implicit type casting
        byte d =(byte) c;  // explicit type casting

    }
}
