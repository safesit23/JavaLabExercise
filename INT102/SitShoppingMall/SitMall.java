package OOP.view;
import OOP.model.SitShop;
public class SitMall {
    public static void main(String[] Args){
        SitShop s1 = new SitShop("Safe",3.5,2);
        
        System.out.println(s1);
        System.out.println(SitShop.getCountShop());
        
        
    }
}
