package oct.ex_09102024_Polymorphism.MethodOverriding.real;

public class Lab134 {
    public static void main(String[] args) {
        Reshma r1 = new Reshma();
        r1.Home();

        Father f1 = new Father();
        f1.Home();

//        Dynamic dispatch
        Father f2 = new Reshma();
        f2.Home();

        // WebDriver driver = new ChromeDriver();  >> example of dynamic dispatch

        // Not possible
        // Pramod object = new Father();
    }
}
