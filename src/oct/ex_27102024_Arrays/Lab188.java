package oct.ex_27102024_Arrays;

public class Lab188 {
    public static void main(String[] args) {

        int[] marks = {51, 100, 91, 87, 90};
        // 0 ,1, ,2, 3, 4
        System.out.println(marks.length); // 1
        System.out.println(marks[0]); //  - Index = 0
        System.out.println(marks[1]); //  - Index = 1
//        System.out.println(marks[5]); //  - Index = 5 // .ArrayIndexOutOfBoundsException

        System.out.println("***********************");


        int[] marks_2 = new int[5];
        marks_2[0]= 76;
        marks_2[1]= 90;
        marks_2[2]= 65;
        marks_2[3]= 100;
        marks_2[4]= 89;
//        marks_2[5]= 200;         // ArrayIndexOutOfBoundsException

        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[2]);
        System.out.println(marks_2[3]);
        System.out.println(marks_2[4]);

    }
}
