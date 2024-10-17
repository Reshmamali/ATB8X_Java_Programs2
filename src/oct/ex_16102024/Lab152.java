package oct.ex_16102024;

public class Lab152{
    public static void main(String[] args) {
        A a1 = new A("Reshma");
        A b1 = new A("Sharad");
//        a1.stud_Name = "Reshma";
        System.out.println(a1.stud_Name);

//        b1.stud_Name = "Sharad";
        System.out.println(b1.stud_Name);

//        A.clg_name= "Sai college";
//        System.out.println(A.clg_name);


    }
}

class A {
    String stud_Name;
    int id;
    static String clg_name;

    public A(String stud_Name) {
        this.stud_Name = stud_Name;
    }

    static void abc(){
//        this.id = id;
        clg_name = "Sai collage of computers";
    }

}



