package oct.ex_11102014_Encap.SuperKeyword.RealtimeInheritance;

public class BaseClass {

    private String browser;

    BaseClass(){
        System.out.println("DC - BaseClass");
    }

    BaseClass(String b){
        System.out.println("PC - BaseClass");
    }

    public String getBrowser(){
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin){
        if (isAdmin){
            this.browser = browser;
           // System.out.println("Allow to set the browser");
        }else{
            System.out.println("Sorry !!! you are not admin");
        }
    }

    void openbrowser(){
        System.out.println("Opening Browser");
    }

    void openbrowser(String browsername){
        System.out.println("opening browser !! -> " + browsername);
    }

    void closebrowser(){
        System.out.println("Closing browser");
    }

}
