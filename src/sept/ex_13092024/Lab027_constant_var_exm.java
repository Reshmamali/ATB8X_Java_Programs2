package sept.ex_13092024;

public class Lab027_constant_var_exm {
    public static void main(String[] args) {
        // constant variable example
        final float pie;
        pie = 1.298f; // Valid because we are assigning value first time
//        pie = 3.14f;  invalid
        System.out.println(pie);
    }
}
