package oct.ex_18102024_String;

public class Lab161_string_functions {
    public static void main(String[] args) {
        String str = " Hello world ";
        String str2 = "hellO WorlD" ;

        // .length >> it will return the length of the string value
        System.out.println("length: " + str.length());

        // .substring >> it will return the new string
        // that is a sub string of original string
        System.out.println("substring: " + str.substring(0,6));

        // .trim >> it will remove the white space from beginning and ending of the string
        System.out.println("trimmed: " + str.trim());

        // .toUpperCase >> it will convert the string to capital letter
        System.out.println(str.toUpperCase());

        //toLowerCase >> it will convert the string to small letter
        System.out.println(str.toLowerCase());

        //charAt >> it will return the character for selected index
        System.out.println(str.charAt(2));

        // .equals >> it will check if the two string are equal or not
        System.out.println(str.equals("Hello")); // false

        //.equalsIsIgnoreCase >> it will compare 2 string values are equals or not
        System.out.println(str.equalsIgnoreCase(str2));  // true

        //.indexOf >> it will return the index of  given character
        System.out.println(str.indexOf("H"));

        // .contains >> it will check if the given char/substring is present
        // in the string or not
        System.out.println(str.contains("ll")); // true
        System.out.println(str.contains("p")); // false

        //.isEmpty >> it will check if the string is empty or not
        System.out.println(str.isEmpty());      // false

        //.split >> splits the string into an array of substrings
        // based on the specified regular expressions
        System.out.println(str.split(" "));

        String name = " P r a m o d D u t t A";
        String name2 = "PramoD";

        //.compareTo >> The comparison is based on the Unicode value of each
        // character in the strings.
        // The result is zero if the strings are equal;
        System.out.println(name.compareTo(name2));  //false

        // CompareTo -> 0 - both of them are same
        // Return Number -> ASCII value diff - between the Strings
        // d -> D - lexicographically comparasion

        //.strip >> same as trim >> remove white spaces from the begining and end of string
        System.out.println(str.strip());


    }
}
