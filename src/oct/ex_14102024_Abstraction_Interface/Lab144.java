package oct.ex_14102024_Abstraction_Interface;

public class Lab144 {
    public static void main(String[] args) {
        CHROMETc chrometc = new CHROMETc();
        chrometc.openBrowser("Chrome");
        chrometc.closeBrowser("Chrome");
        chrometc.takeScreenshot();

        FIREFOXTc firefox = new FIREFOXTc();
        firefox.openBrowser("FireFox");
        firefox.closeBrowser("FireFox");
        firefox.takeScreenshot();
    }
}
