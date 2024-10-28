package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab202_ArrayList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12245);
//        l.add("reshma");   // Can't insert string elements bcz list dt is Integer

        List<String> l1 = new ArrayList<>();
        l1.add("abcd");
//        l1.add(653);   // Can't insert integer elements bcz list dt is String
    }
}
