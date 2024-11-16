package Nov.ex_04112024.Generics;

public class Lab216 {
    public static void main(String[] args) {
       temp1(65, "Reshma");
       temp1("sharad", 45);

    }
    public static <Temp> void temp1(Temp age, Temp name){
        System.out.println(age);
        System.out.println(name);
    }
}
