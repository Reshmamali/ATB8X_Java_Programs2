package oct.ex_04102024;

public class Lab125 {
    public static void main(String[] args) {
        AHuman sharad=new AHuman();  // null value
        AHuman reshma=new AHuman("Reshma");
        AHuman reeva=new AHuman("Reeva");

//        sharad.name="Sharad";  // no use of this >>> this will not work
//        reshma.name="Reshma";

        System.out.println(sharad.name);
        System.out.println(reshma.name);
        System.out.println(reeva.name);

        System.out.println(sharad.planet);
        System.out.println(reshma.planet);

    }
}
