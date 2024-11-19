package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab190_ToSort_array_elements {
    public static void main(String[] args) {
        int[] marks = {67, 97, 100, 92, 88};
        int[] marks1 = {67, 97, 100, 92, 88,70};

        System.out.println("Lenght of array is = " + marks.length);
        System.out.println("Marks for 10th grade = ");

        Arrays.sort(marks);  // Sorts the specified array into ascending numerical order

        for (int i = 0 ; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        int item = Arrays.binarySearch(marks, 100); // return the index of mentioned value in array
        System.out.println(item);

    }
}
