package demo1;

public class Phonec extends Phone{
    @Override
    void buyPhone() {
        super.buyPhone();
        System.out.println("version-2 is released");
    }
    void snap()
    {
        System.out.println("get a snap with "+phoneName);
    }

    public static void main(String[] args) {
        Phonec ph=new Phonec();
        ph.phoneName="ASUS";
        ph.phoneId=1231;
        ph.phoneModel="M2XPRO";
        ph.snap();
        ph.buyPhone();
        ph.replacePhone();

    }
}
