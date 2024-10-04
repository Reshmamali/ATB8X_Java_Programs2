package sept.ex_30092024;

public class Lab123 {
    public static void main(String[] args) {
        // No return type but with argument
        functionName1(30,"Reshma","Mali");

    }
    // No return type but with argument
    static void functionName1(int age, String name, String lastName){
        System.out.println("Following are the student details");
        System.out.println("You have shared ->>"+ age + name + lastName);
    }
}
