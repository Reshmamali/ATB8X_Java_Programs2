package oct.ex_30102024_Collection_Framework_part2;

import java.lang.reflect.Array;

public class Practice {
    public static void main(String[] args) {
        String[] a = new String[5];
        a[0]="Reshma";
        a[1]="Reshma";
        a[2]="Reshma";
        a[3]="Reshma";
        a[4]="Reshma";
        a[5]="sharad";
        System.out.println(a);
        String[] b={"reshma","Sharad","Arohi","Reewa","Reewa"};

        // fixed in size >> What if u try to insert more element than the declared size
        // JVM will throw the runtime error
        // element insertion deletion is hard
        // No built-in support for sorting, searching.

        for (Object o:b) {
            System.out.println(o);
        }
    }
}
