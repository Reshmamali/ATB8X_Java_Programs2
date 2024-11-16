package oct.ex_30102024_Collection_Framework_part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        // Vector, Stack - Legacy -
        // 95% of time we are not going
        // to use it in automation

//        // ArrayList - 95% we are going to use.
//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s); // LIFO
//
//        Stack books = new Stack();
//        books.push("Python");
//        books.push("Java");
//        books.push("C#");
//        System.out.println(books);
////        System.out.println(books.pop());
//        System.out.println(books.peek());
//        System.out.println(books);
//        System.out.println(books.pop());
//        System.out.println(books);

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.add("Amit2");
        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.push("Reshma"));
        System.out.println(s.add("sharad"));
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.contains("sharad"));
        s.contains("sharad");
        s.indexOf("Reshma");
        s.lastIndexOf("Amit");


        System.out.println(s.size());
        System.out.println(" --- ");

        s.add(2,"Reeva");
        System.out.println(s);

        s.remove(1);
        System.out.println(s);

        System.out.println(s.get(0));

//        s.add(0,"Lucky");
        System.out.println(s);
        // s.remove()
        System.out.println(s.get(0));
    }
}
