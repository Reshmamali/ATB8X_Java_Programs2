package oct.ex_09102024_Polymorphism.MethodOverloading;

public class MathOperations {
    // Method Overloading
    int add(int a,int b){
        return a+b;
    }

    String add(String a,String b){
        return a+b;
    }

    double add(int a, int b, int c) {
        System.out.println("Hello");
        return a + b + c ;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }
}
