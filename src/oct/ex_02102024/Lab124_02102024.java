package oct.ex_02102024;

import oct.ATBStudent_ex_02102024;

public class Lab124_02102024 {
    public static void main(String[] args) {
        // Object Class - is the part of OOPs
        // String Class - Reference
        // Arrays
        // for each
        // 2d nested for loop

        // Class -> Blueprint to create something
        // Objects - Instance of the class - created from the class.

        ATBStudent_ex_02102024 Stud1=new ATBStudent_ex_02102024();
        Stud1.age=24;
        Stud1.name="Reshma";
        Stud1.phone_number=9579408453l;
        Stud1.Address="Bhojgude niwas, Barshi naka, Dharashiv, Maharashtra, 413501";
        Stud1.email="reshmamali76@gmail.com";
        Stud1.occupation="Software engineer";
        Stud1.Sid=200;

        ATBStudent_ex_02102024 Stud2=new ATBStudent_ex_02102024();
        Stud2.age=25;
        Stud2.name="Sharad";
        Stud2.phone_number=9579508453l;
        Stud2.Address="Bhojgude niwas, Barshi naka, Dharashiv, Maharashtra, 413501";
        Stud2.email="sharadmali76@gmail.com";
        Stud2.occupation="Software engineer";
        Stud2.Sid=201;

        System.out.println(Stud1);
        System.out.println(Stud2);

        // Stud1 and Stud2 - Ref VARAIBLE - bYTE, ir bits ->  8, 64, null default
    }
}
