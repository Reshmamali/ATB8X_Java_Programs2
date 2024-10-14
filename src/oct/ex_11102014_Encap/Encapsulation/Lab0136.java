package oct.ex_11102014_Encap.Encapsulation;

public class Lab0136 {
    public static void main(String[] args) {
        // Good example of encapsulation

        GoodVMOlogin vmo2  = new GoodVMOlogin("goodadmin","admin123");
        // System.out.println(vwoLogin1.password);
        // vwoLogin1.password = "pass123";>?
        System.out.println(vmo2.getPassword());

        // Checking Admin
        boolean isAdmin = false;

        // vwoLogin1.setYourKey("admin");

        vmo2.setPassword("newpassword",isAdmin);
        System.out.println(vmo2.getPassword());
    }
}
