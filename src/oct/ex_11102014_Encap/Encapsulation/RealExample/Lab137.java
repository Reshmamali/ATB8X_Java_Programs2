package oct.ex_11102014_Encap.Encapsulation.RealExample;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank reshma = new ICICIBank("Reshma", 50000);
        //reshma.bal = 2000000; can't set the value for private data member directly

        // this should be allowed to only admin

        // write a code to connect with MySQL
        // Admin

        boolean r_u_admin = true;
        ICICIBank Admin = new ICICIBank("Admin", 200);
        Admin.setBal(100000, r_u_admin);
        System.out.println(Admin.getBal(r_u_admin));
    }
}
