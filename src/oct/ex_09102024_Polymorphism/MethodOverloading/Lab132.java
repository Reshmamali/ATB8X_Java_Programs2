package oct.ex_09102024_Polymorphism.MethodOverloading;

public class Lab132 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result);

        String name = m.add("pramod","dutta");
        System.out.println(name);

        double result2 = m.add(2,4,8);
        System.out.println(result2);


    }
}
