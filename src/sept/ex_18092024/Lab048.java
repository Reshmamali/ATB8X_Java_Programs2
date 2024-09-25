package sept.ex_18092024;

public class Lab048 {
    public static void main(String[] args) {
        System.out.println('A');
        System.out.println('B');
        // Here JVM will print the original value i.e A and B its not taking ASCII values
        System.out.println('A' + 'B');
        // When we are doing concatenation then it will calculate the ASCII values
    }
}
