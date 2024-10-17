package oct.ex_16102024;

public class Lab157_enum {
    public static void main(String[] args) {
        System.out.println(color.YELLOW);
        System.out.println(color.GREEN.getColor());
        System.out.println(color.PINK + "\t" + color.PINK.getColor());
        System.out.println(color.RED.getColor());
    }
}

enum color {
    RED("#ff3f33"),
    YELLOW("#f3ff33"),
    GREEN("#33ff64"),
    PINK("#fc33ff");

    String hexcode;

    //Parameterised constructor to pass the value to the constants keys
     color(String hexcode){
        this.hexcode = hexcode;
    }

    // Getter method to get the value of constants
    String getColor(){
        return hexcode;
    }
}