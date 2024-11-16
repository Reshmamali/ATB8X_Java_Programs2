package Revision.Constructor;

public class Parameterized_constructor {
    String name;
    int roll_no;

    Parameterized_constructor(){
        System.out.println("I am DC");
    }

    Parameterized_constructor(String name, int roll_no){
        this.name = name ;
        this.roll_no = roll_no;
        System.out.println("I am parameterized constructor");
    }
}
