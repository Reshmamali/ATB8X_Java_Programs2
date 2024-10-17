package Task.ex_task_14th_Oct;

import javax.xml.namespace.QName;

public class PrintMyBook extends Book {

    PrintMyBook(){
        super("reshma","Sharad", 120);
    }
//    PrintMyBook(String name, String authorName, int Price) {
//        super(name, authorName, Price);
//    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(authorName);
        System.out.println(Price);
    }
}

