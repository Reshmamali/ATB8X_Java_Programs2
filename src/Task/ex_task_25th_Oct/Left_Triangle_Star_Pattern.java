package Task.ex_task_25th_Oct;

public class Left_Triangle_Star_Pattern {
    //    *
    //   **
    //  ***
    // ****
    //*****

    public static void main(String[] args) {
        int i, j;
        int[] row = new int[6];

        for (i=0; i<row.length; i++){      //Outer loop work for rows
            for (j=2*(row.length-i); j>=0; j--) {   //inner loop work for space
                System.out.print(" ");     //prints space between two stars
            }
            for (j=0; j<=i; j++) {         //inner loop for columns
                System.out.print("* ");   //prints star
            }
            System.out.println(); //throws the cursor in a new line after printing each line
        }
    }
}
