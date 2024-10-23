package oct.ex_21102024_WrapperClass_exceptions;

public class Practice {
    public static void main(String[] args) {
        try {
            String str1 = "Reshma";
            Integer i1 = Integer.parseInt(str1);  // NumberFormatException
            int a = i1;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
            //throw new RuntimeException(e);
        }

        try {
            String str2 = "Sharad";
            int b = Integer.valueOf(str2); // NumberFormatException
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
           // throw new RuntimeException(e);
        }

        int c = 10;
        String d = String.valueOf(c);
        String e = d;
        System.out.println(e);

        char f = 'A';
        String g = String.valueOf(f);
        System.out.println(g);

        short h = 100;
        int i = h ;  // widening >> Implicit casting >> lossless
        System.out.println(i);

        int j = 400;
        byte k = (byte)j;
        System.out.println(k); // narrowing >> Explicit casting >> Loss of data



    }
}
