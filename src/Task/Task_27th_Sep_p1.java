package Task;

public class Task_27th_Sep_p1 {
    public static void main(String[] args) {
        // Print the First 5 Even Numbers
        int count = 1;
        int num = 2;

        while (count <= 5){
            if(num % 2 == 0){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
