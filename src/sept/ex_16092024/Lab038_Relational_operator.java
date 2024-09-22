package sept.ex_16092024;

public class Lab038_Relational_operator {
    public static void main(String[] args) {
        //✅ Relational operators
        // Relational operators are basically who gives us relation and they always returns boolean value
        // > <, >=, <=, ==, !=, >> true or false
        int a = 10;
        int b = 20;
        boolean c = a > b;
        System.out.println(c);


        int reshma_age, sharad_age;
        reshma_age = 30;
        sharad_age = 30;

        boolean result = reshma_age > sharad_age;
        System.out.println(result);

        boolean second_result = reshma_age >= sharad_age;
        System.out.println(second_result);

        boolean third_result = reshma_age < sharad_age;
        System.out.println(third_result);



    }
}
