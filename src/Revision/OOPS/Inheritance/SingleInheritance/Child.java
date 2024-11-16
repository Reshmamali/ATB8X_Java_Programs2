package Revision.OOPS.Inheritance.SingleInheritance;

public class Child extends Parent {

    Child(){
        System.out.println("I am child DC");
    }
    public Child(String name, int roll_no) {
        super.name = name;
        super.roll_no = roll_no;
        System.out.println("I am child PC");
    }

    public void home_2bkh(){
        System.out.println("Child home 2bhk");
    }
}
