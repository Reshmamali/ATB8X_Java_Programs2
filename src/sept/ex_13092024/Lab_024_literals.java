package sept.ex_13092024;

public class Lab_024_literals {
    public static void main(String[] args) {
        //✅ Literals

        // Char Literal
        // Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char literals
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char car_r='\r';

        System.out.println("Reshma" + new_line + "Mali");
        System.out.println("Reshma" + tab_line + "Mali");
        System.out.println("Reshma" + "\t" + "sharad" + "\t" + "Mali");
        System.out.println("Reshma" + back_space + "Mali");
        System.out.println("Reshma" + car_r + "Mali");

        // unicode char literals
        char c11= '\u1F60';
        System.out.println(c11);

        //Scientific and exponent N literals >> floating literals
        float f = 129.8763e2F;
        double d1 = 129.8763e+2;
        double d2 = 12987.63e-2;
        System.out.println(f);
        System.out.println(d1);
        System.out.println(d2);


    }
}
