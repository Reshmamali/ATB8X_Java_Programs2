package oct.ex_14102024_Abstraction_Interface;

public class FIREFOXTc extends BaseClass{

    @Override
    void openBrowser(String Browser) {
        System.out.println("Opening a Firefox");
    }

    @Override
    void closeBrowser(String Browser) {
        System.out.println("Closing a Firefox");
    }
}
