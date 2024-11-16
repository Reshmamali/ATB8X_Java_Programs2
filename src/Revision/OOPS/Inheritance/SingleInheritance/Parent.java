package Revision.OOPS.Inheritance.SingleInheritance;

public class Parent {
    String name;
    int roll_no;

    Parent(){
        System.out.println("Parent DC");
    }
    Parent(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public void home_1bhk(){
        System.out.println("Parent home 1bhk");
    }
}
