package oct.ex_16102024_Static_Enum_keyword;

public class Lab153_Static_var_meth_block {
    public static void main(String[] args) {
        Student s1 = new Student(30);
        Student s2 = new Student(40);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);

    }
}

class Student {
    int age; // Instance Variable (Non Static)
    static String school_name = "ABC"; // Static Variable

    Student (int age){
         this.age=age;
    }
    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when Object is created");
        System.out.println("Read a MySQL db()");
    }

    static {
        int b = 20;
        System.out.println("SIB");
        System.out.println("Loaded Once, When Class is Laoded.");

    }
    public void student() {
        school_name = "vbg";
    }
}
