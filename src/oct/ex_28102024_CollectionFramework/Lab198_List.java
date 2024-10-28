package oct.ex_28102024_CollectionFramework;

import java.util.List;

public class Lab198_List {
    public static void main(String[] args) {
//        List list = new List<>();    // Can't create object because this is a interface

        List list =List.of("Banana", "Apple", "Orange","pear");
//        list.add("coconut");     // Unsupported bcz add function is incomplete in list
        System.out.println(list);

    }
}
