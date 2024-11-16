package Nov.ex_04112024;

import java.util.ArrayList;
import java.util.HashSet;

public class Lab210_Set_part2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("pineapple");
        System.out.println("Set element -> " + set);

        set.remove("pineapple");
        System.out.println("Set element -> " + set);

        set.add("Pineapple");
        System.out.println(set);

        ArrayList list = new ArrayList();
//        list.add(1);      // index ? -> array index to store the element
        // add, replace, contains , remove
    }
}
