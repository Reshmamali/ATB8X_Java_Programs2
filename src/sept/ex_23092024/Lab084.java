package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        // new syntax of switch case >> available in greater than version JDK>13

        int itemCode = 001; // JDK  >13
        // Here by using arrow i.e. '->' u can basically eliminating the keyword break.
        // Same functionality just replacing the keyword with arrow
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Hello!");
        }
    }
}
