package sept.ex_25092024;
import java.util.Scanner;

public class Lab114_To_take_user_input {
    public static void main(String[] args) {
        // Program to write how to take a use input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("enter a name");
        String name=sc.next();
        System.out.println(name);
        int name1=name.length();
        System.out.println(name1);
    }
}
