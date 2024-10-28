package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        // Iterator
        Iterator<String> list = mylist.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }
}
