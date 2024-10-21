package Task.ex_task_18th_Oct;

public class Reverse_String_without_function {
    public static void main(String[] args) {
        String name = "Reshma Mali";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println( reverse);
    }
}