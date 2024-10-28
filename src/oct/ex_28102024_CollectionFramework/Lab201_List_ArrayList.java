package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab201_List_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(87);
        marks.add(56);
        marks.add(100);

        System.out.println(marks);

        System.out.println("******* Sorted list ***********");
//      Sorting
        Collections.sort(marks);
        System.out.println(marks);

        System.out.println("******* Reverse order sorted list ***********");

//      Reverse order sorting
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
