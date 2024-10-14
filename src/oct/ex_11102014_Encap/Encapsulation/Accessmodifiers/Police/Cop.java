package oct.ex_11102014_Encap.Encapsulation.Accessmodifiers.Police;

public class Cop {
    protected int gun;
    protected String idCard;

    public Cop (int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes u can!!!");
    }
}
