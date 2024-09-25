package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        // GST 18.45%

        int course = 100;
        float GST = 18.45f;

        //int total_price = course + GST; // Narrowing - implicit - invalid casting - JVM
        //float total_price = course + GST; // Narrowing - implicit - invalid casting - JVM
        //System.out.println(total_price);

        int total_price = course + (int)GST; // Narrowing - explicit casting >> Loss of data
        System.out.println(total_price);

    }
}
