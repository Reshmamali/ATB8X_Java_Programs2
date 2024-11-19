package Revision.Ternary_Operator;

public class MaxNumberBetweenThreeNos {
    public static void main(String[] args) {
        int a = 4000, b = 220, c = 3000;
        int max_value = a > b? a : b;
        int max2 = max_value > c? max_value : c;
        System.out.println("the max value is "+ max2);


    }
}
