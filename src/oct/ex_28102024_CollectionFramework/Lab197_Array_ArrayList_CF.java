package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;

public class Lab197_Array_ArrayList_CF {
    public static void main(String[] args) {
        // Collection - Interface - 10
        // List - Interface - 15 ( 25)
        //  ArrayList, LinkedList, Stack and Vector - Class

        // Shopping - bread,milk, curd, panneer, buttermilk. , butter
        // Collection of items - with same or different data type.
        // Collections of students -

        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Reshma");
        studentList.add("Reshma");           // Duplicate is allowed
        studentList.add("Sharad");
        studentList.add(1234);           // Different data types are allowed
        studentList.add('A');
        studentList.add(true);

        System.out.println(studentList);

    }
}
