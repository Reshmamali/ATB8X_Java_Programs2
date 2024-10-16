package oct.ex_14102024_Abstraction_Interface.RealExample2;

public class Seletos extends Engine {
    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the engine");

    }
}
