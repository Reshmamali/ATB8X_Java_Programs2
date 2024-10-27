package oct.ex_23102024;

public class Lab_practice {
    public static void main(String[] args) {
        Lab_practice c = new Lab_practice();
        int result = c.add(20,30);
        System.out.println(result);

        int result1 = c.sub(90,30);
        System.out.println(result1);

        int result2 = c.mul(10,9);
        System.out.println(result2);

    }

    public int add(int a, int b){
        System.out.println("Additon of two numbers is = " );
        return a + b ;

    } public int sub(int a, int b){
        System.out.println("Substraction of two numbers is = ");
        return a - b ;

    }  public int mul(int a, int b){
        System.out.println("Multiplication of two numbers is = ");
        return a * b ;

    }
}



