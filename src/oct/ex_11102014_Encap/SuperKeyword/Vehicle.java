package oct.ex_11102014_Encap.SuperKeyword;

public class Vehicle {
    public int maxspeed = 111;

    void display(){
        System.out.println("Parent");
    }

    Vehicle(){
        System.out.println("DC vehicle");
    }

    Vehicle(int maxspeed){
        System.out.println("PC Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }

    void message (int a, int b){
        System.out.println("Hiiiiiiiiiiiii Vehicle");
    }
}
