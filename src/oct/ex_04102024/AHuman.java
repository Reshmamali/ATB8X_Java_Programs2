package oct.ex_04102024;

public class AHuman {
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhar_card_number;


    // Default constructor
    AHuman(){
        System.out.println(" I will called when object is created ");
    }

    // Parameterized Constructors
    AHuman(String name){
        System.out.println("Hi, I am Param Constructors");
        this.name=name;

    }






    //NRNA
    void walk(){

    }
    //RTNA
    String talk(){
        System.out.println("Talking");
        return "I am talking";
    }
    //RTWA
    String eat(int sid){
        System.out.println("Eating");
        return  "I am eating";
    }
    //NRWA
    void learn(String core_Java){
        System.out.println("We are learning constructor");
    }
}
