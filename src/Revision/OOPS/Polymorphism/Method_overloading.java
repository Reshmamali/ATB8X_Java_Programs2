package Revision.OOPS.Polymorphism;

public class Method_overloading {
    public static void main(String[] args) {
        int result = add(20,30);
        int result2 = add(20,30, 40);
        System.out.println(result);
        System.out.println(result2);

    }

    public static void main(String name) {

    }
        public static int add(int a, int b){
            System.out.println("Addition of 2 numbers ");
            return a + b;
        }
        public static int add ( int a, int b, int c){
            System.out.println("Addition of 3 numbers ");
            return a + b + c;
        }

}
