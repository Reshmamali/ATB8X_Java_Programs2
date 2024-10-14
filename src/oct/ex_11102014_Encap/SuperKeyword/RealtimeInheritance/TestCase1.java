package oct.ex_11102014_Encap.SuperKeyword.RealtimeInheritance;

public class TestCase1 extends BaseClass{

    TestCase1(){
        super();
        this.setBrowser("edge", true);
        //System.out.println("DC TC1");
    }
    @Override
    public void setBrowser(String browser, boolean isAdmin) {
//        System.out.println("Own Logic");
        super.setBrowser(browser,isAdmin);
    }


}
