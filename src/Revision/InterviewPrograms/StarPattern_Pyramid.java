package Revision.InterviewPrograms;

public class StarPattern_Pyramid {
    public static void main(String[] args) {
//       *
//     *  *
//    *  *  *
//   *  *  *  *
//  *  *  *  *  *
// *  *  *  *  *  *

        int row = 6;
        int i, j;

        for ( i = 0 ; i < row ; i++){
            for (j = row-i ; j>1 ; j--){ // 6-0 = 6   j=6>1
                System.out.print(" ");
            }
            for (j = 0; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
