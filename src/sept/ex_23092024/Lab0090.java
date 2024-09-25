package sept.ex_23092024;

public class Lab0090 {
    public static void main(String[] args) {
        //Can we have a concatenation in switch statement like case 'A' + 1 -> YES

        int ch = 'u'; // 66 JVM always takes char as a integer value ASCII

        switch (ch) {
            case 'A' :
                System.out.println("65");
                break;
            case 'A'+1:
                System.out.println("66");
                break;
            case 'B'+2 :
                System.out.println("68");
                break;
            default :
                System.out.println("no such case");


        }
    }
}
