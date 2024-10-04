package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        //  1.Without Parameters and Without Return Type
        functioneName1();

        // 2.Without Parameters but With Return Type
        String name=functionName2();
        System.out.println(name);

        // 3.With Parameters and Without Return Type
        functionName3(65);

        // 4. With Parameters and With Return Type
        double addition=functionName4(3,5);
        System.out.println(addition);
    }
    public static void functioneName1(){
        System.out.println("Without Parameters and Without Return Type");
    }

    public static String functionName2(){
        System.out.println("Without Parameters but With Return Type");
        return "Pramod";
    }

    public static void functionName3(int age){
        System.out.println("With Parameters and Without Return Type");
        System.out.println("You have shared ->" + age);
    }

    public static double functionName4(int a, double b){
        System.out.println("With Parameters and With Return Type");
        return a+b;
    }
}
