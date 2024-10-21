package oct.ex_16102024_Static_Enum_keyword;

public class Lab154_IIB_SIB {
    public static void main(String[] args) {
        A1 a = new A1();
        A1 a1 = new A1();
        new A1();
        A1 a2;
    }
}

class A1{
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
}
