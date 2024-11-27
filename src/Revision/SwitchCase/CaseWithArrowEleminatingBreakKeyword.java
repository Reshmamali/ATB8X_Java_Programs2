package Revision.SwitchCase;

public class CaseWithArrowEleminatingBreakKeyword {
    public static void main(String[] args) {

        int itemcode = 002 ;

        switch(itemcode){
            case 001 -> System.out.println("It's a laptop");
            case 002 -> System.out.println("It's a desktop");
            case 003 -> System.out.println("It's a mobile phone");
            default -> System.out.println("Hello, good morning");
        }
    }
}
