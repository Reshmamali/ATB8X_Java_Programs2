package oct.ex_30102024_Collection_Framework_part2.CF_SET;

import java.util.*;

public class Lab209_SET {
    public static void main(String[] args) {
        // List - > Duplicate Allows
        // Set -> Doesn't allow Duplicate

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("pramod");
        hs.add("dramod");
        System.out.println(hs);
        System.out.println(hs.isEmpty());  //false
        System.out.println(hs.contains("reshma")); //false
        System.out.println(hs.add("Sharad"));
        System.out.println(hs);

        lhs.add("Pramod");
        lhs.add("Pramod");
        lhs.add("pramod");
        lhs.add("dramod");
//        System.out.println(lhs);

        System.out.println(hs.equals(lhs));

        ts.add(123);
//        System.out.println(ts);

    }
}

