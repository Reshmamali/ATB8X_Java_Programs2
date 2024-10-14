package oct.ex_11102014_Encap.SuperKeyword;

public class Car extends Vehicle {
    public int maxspeed = 222;

    void display(){
        System.out.println("child");
    }

    Car(){
        super(10);

        System.out.println("DC Car");
        this.maxspeed = maxspeed ;

        super.display();
        this.display();

        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);

    }
}
