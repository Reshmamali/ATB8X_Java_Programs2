package Task.ex_task_18th_Oct;

public class Reverse_string_withoutChangingItsPosition {
    public static void main(String[] args) {
        String str = "Test the product";
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}

