package oct.ex_09102024_Inheritance.HasA_Aggregation_concept;

public class Car {
    // Car Has-A Engine, Tyre
// Car Has-A Engine, Tyre
    protected void startCar(){
        new EngineofCar().start();
        new TyreofCar().rolling();
    }
}
