package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab199_List_ArrayList {
    public static void main(String[] args) {
        // List list  = new List();
        List list = new ArrayList();
        list.add("bread");   //0
        list.add("milk");    //1
        list.add("butter");  //2
        list.add("paneer");  //3
        list.add("paneer");     //4
        list.add("cheeze");  //5

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());   // false
        System.out.println(list.contains("cheese"));  //false
        System.out.println(list.contains("milk"));   //
        System.out.println(list.indexOf("paneer")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("paneer")); //find the first occ of element in list
    }
}
