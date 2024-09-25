package sept.ex_23092024;

public class Lab090_intQ {
    public static void main(String[] args) {
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("A");
                break;
//            case 65:
//                System.out.println("65");
//                break;
        } // 'A' and 65 is always same for JVM >> JVM will throw the error in this case
        // i.e.duplicate case label
    }
}
