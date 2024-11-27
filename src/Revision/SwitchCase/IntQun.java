package Revision.SwitchCase;

public class IntQun {
    public static void main(String[] args) {
        char c = 'A';

        switch(c){
            case 'A' :
                System.out.println("A");
                break;
//            case 65 :
//                System.out.println("65");  // Compiler will throw the error duplicate label
        }
    }
}
