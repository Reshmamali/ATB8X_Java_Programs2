package oct.ex_23102024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab184 {
    public static void main(String[] args)throws FileNotFoundException,ArrayIndexOutOfBoundsException {
        extracted();
    }

    private static void extracted() throws FileNotFoundException {
        FileInputStream fileinputstream = new FileInputStream("C:file.txt");
    }
}
