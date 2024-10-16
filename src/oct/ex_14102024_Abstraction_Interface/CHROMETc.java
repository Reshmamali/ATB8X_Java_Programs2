package oct.ex_14102024_Abstraction_Interface;

public class CHROMETc extends BaseClass {

    @Override
    void openBrowser(String Browser) {
        System.out.println("Opening a chrome");
    }

    @Override
    void closeBrowser(String Browser) {
        System.out.println("Closing a chrome");
    }
}
