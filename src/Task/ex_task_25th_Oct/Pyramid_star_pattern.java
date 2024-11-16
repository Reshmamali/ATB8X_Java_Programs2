package Task.ex_task_25th_Oct;

public class Pyramid_star_pattern {
    public static void main(String[] args) {
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
        int i, j, row = 6;

        for (i = 0; i < row; i++){  //Outer loop for rows
            for (j=row-i; j>1; j--)  {       //inner loop for space
                System.out.print(" ");       //prints space between two stars
            }
            for (j=0; j<=i; j++ ) {    //inner loop for columns
                System.out.print(" * ");    //prints star
            }
            System.out.println();       //throws the cursor in a new line after printing each line
        }
    }
}
