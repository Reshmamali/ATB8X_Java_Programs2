package oct.ex_16102024_Static_Enum_keyword;

public class Practice1 {
    public static void main(String[] args) {
        person p1 = new person(30);
        System.out.println(person.School_name);
        person.School_name = "XYZ";
        System.out.println(p1.School_name);

        System.out.println(person.School_name);

        person.b();

    }
}


class person{
    int age;    // instance variable (non - static)
    static String School_name = "ABC";   // static variable

    public person(int age) {
        this.age = age;
    }

    static void b (){
        System.out.println("static method");
    }
}