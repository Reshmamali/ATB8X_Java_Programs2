package sept.ex_16092024;

public class Lab034_QnA_concatenate_or_math {
    public static void main(String[] args) {
        // //✅ Concatenation operator
        // + -> int + int  -> math
        // + -> String -> combine -> concat
        String first_name = "Reshma";
        String last_name = "Mali";
        int a=10 ;
        int b=10;

        // Whenever we have first string /previous one is string then
        // it will concatenate with the all of the
        System.out.println(first_name + last_name + a + b);

        // but if the first one is integer then till there it will be math
        // and after that it will concatenate
        System.out.println( a + b + first_name + last_name );

        // solution for all of the concatenation
        System.out.println( first_name + last_name + (a + b) );

    }
}
