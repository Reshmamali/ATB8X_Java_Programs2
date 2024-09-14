package sept.ex_06092024;
//Program to overload main method
public class Lab005 {
    public static void main(String[] args) {
        System.out.println("Hello, Reshma");
        main("reshma");
    }

    public static void main(String args) {
        System.out.println("Hello world!");
    }

    public void main(int reshma) {
        System.out.println(20);

    }
}