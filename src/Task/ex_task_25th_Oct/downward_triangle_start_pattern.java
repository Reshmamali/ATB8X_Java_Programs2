package Task.ex_task_25th_Oct;

public class downward_triangle_start_pattern {
    public static void main(String[] args) {
        //Downward Triangle Star Pattern
//    * * * * * * *
//    * * * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
        int[] rows=new int[7];
        for (int i= rows.length-1; i>=0 ; i--){       //outer loop
            for (int j=0; j<=i; j++){          // inner loop
                System.out.print("*" + " ");    //prints star and space
            }
            System.out.println();           // //throws the cursor in the next line after printing each line
        }
    }
}
