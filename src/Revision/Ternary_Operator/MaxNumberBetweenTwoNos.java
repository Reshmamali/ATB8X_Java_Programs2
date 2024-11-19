package Revision.Ternary_Operator;

public class MaxNumberBetweenTwoNos {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        int max = a>b? a:b;
        System.out.println("Max number is " + max);
        int min = a<b? a:b;
        System.out.println("min number is " + min);
    }
}
