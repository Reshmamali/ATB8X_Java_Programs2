package Revision.Function_OR_Method;

public class Funtion_Types {
    public static void main(String[] args) {
//      No return type no argument
        test();
//      "With return type but no argument"
        int age = test2();
        System.out.println(age);

//     "Without return type but with argument" // ex - main method
        test3("Reshma");

//      "With return type and with argument"
        int result = test4(30,50);
        System.out.println(result);


    }

    public static void test(){
        System.out.println("No return type no argument");
    }

    public static int test2(){
        System.out.println("With return type but no argument");
        return 65;
    }

    public static void test3(String name) {
        System.out.println("Without return type but with argument");
        System.out.println("You have shared ur name -> "+ name);
    }

    public static int test4(int a, int b){
        System.out.println("With return type and with argument");
        return a+b;
        }
}
