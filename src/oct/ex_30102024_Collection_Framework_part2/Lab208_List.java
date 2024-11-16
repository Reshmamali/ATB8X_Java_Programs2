package oct.ex_30102024_Collection_Framework_part2;

import java.util.ArrayList;
import java.util.List;

public class Lab208_List{
    public static void main(String[] args) {
        Student a = new Student("Reshma",1);
        Student b = new Student("Sharad", 2);
        Student c = new Student("Reewa",3);
        List<Student> Mylist = new ArrayList();
        Mylist.add(a);
        Mylist.add(b);
        Mylist.add(c);
        System.out.println(Mylist);

        System.out.println("**********");

        System.out.println(a.printDetails());
        System.out.println(b.printDetails());
        System.out.println(c.printDetails());
    }
}
class Student{
    String name;
    int roll_no;

    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public String printDetails() {
        return "Student{" +
                "name=' " + name + '\'' +
                ",roll_no = " + roll_no +
                '}';
    }

@Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_No=" + roll_no +
                '}';
       }
    }
