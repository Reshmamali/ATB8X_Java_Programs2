package oct.ex_11102014_Encap.Encapsulation;

public class GoodVMOlogin {
    private String username;
    private String password;

    GoodVMOlogin(String username, String Password){
        this.username = username;
       password = Password;
        this.password = password;
    }
// In getter method we can see the function type is RTNA (Return type with no argument)
    public String getUsername(){
        return username;

    }
// In setter methos we can see the function type is NRWA (No return type but have the argument)
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword (){
        return password;
    }

    public void setPassword(String password, boolean isAdmin){
        if (isAdmin){
            this.password = password;

        }else {
            System.out.println("Not allowed");
        }

    }
}
