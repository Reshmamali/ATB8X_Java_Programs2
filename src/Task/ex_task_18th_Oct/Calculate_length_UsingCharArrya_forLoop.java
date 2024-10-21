package Task.ex_task_18th_Oct;

public class Calculate_length_UsingCharArrya_forLoop {
    public static void main(String[] args) {
        //Calculate the length of the String - without using the length() function.
        // String name =”Pramod”; →  6 , CharArray, for loop

        String str = "Reshma";
        int length = 0;

        for (char a:str.toCharArray()) {
            length++;
        }
        System.out.println(" length of the string is " + length);
    }
}