package oct.ex_14102024_Abstraction_Interface.RealExample3;

public class BaseClass extends GrandBaseClass {

    // Web Automation
    // Single
    // Hide the functionality of the open and close browser
    void openBrowser(String Browser){}
    void closeBrowser(String Browser){}

    @Override
    void takeScreenshot() {
        System.out.println("Taking a screenshot");
    }
}
