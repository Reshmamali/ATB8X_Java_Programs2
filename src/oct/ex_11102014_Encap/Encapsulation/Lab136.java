package oct.ex_11102014_Encap.Encapsulation;

import java.sql.SQLOutput;

public class Lab136 {
    // Bad example
    public static void main(String[] args) {
        VMOlogin vmo = new VMOlogin("Admin", "Password123");
        System.out.println(vmo.password);
        vmo.password = "hacker";
        System.out.println(vmo.password);

    }
}
