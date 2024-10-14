package oct.ex_11102014_Encap.SuperKeyword.RealtimeInheritance;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass tc1 = new TestCase1();  // dynamic dispatch
        tc1.openbrowser("edge");
        tc1.closebrowser();
    }

}
