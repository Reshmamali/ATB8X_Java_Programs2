package Task;

public class Person_4th_Oct {
    // Attribute
    String first_name;
    String last_name;
    long phone_no;
    String email;
    String address;
    int rollno;
    String eye_color;
    int age;
    String aadhar_number;
    String gender;


    // Default constructor
    Person_4th_Oct(){
        System.out.println("I am DC");
    }


    //Parameterized constructor
    Person_4th_Oct(String first_name, String last_name, int age  ){
        System.out.println("I am PC1");
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }


    Person_4th_Oct(String first_name, String last_name){
        System.out.println("I am PC2");
        this.first_name = first_name;
        this.last_name = last_name;
    }




    // Behavior / > Methods (function within the class)
    void walk() {

    }

    void talk(String tone) {
        System.out.println("sometimes my tone is little high");
    }

    int sleep(int sleep_hour) {
        System.out.println("I am sleeping for 8 hours");
        return 8;
    }

    String read() {
        System.out.println("I like to read the historical books");
        return "my favorite writer is Melisa Anelli";
    }

    void eat(){

    }
}
