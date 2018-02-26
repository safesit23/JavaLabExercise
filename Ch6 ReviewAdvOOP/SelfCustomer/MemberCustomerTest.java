import org.junit.Test;
import static org.junit.Assert.*;
import self.model.MemberCustomer;


public class MemberCustomerTest {
    private MemberCustomer mc;
   
  @Test
  public void addBuyingPriceToMemberPoints(){
        mc=new MemberCustomer ("Ann", "LoveShop", 0);
        mc.addPointFromBuyingTotalPrice(20000);
        double expected =800;
        double actual= mc.getPoints();
        assertEquals(expected, actual, 0.01);
     
  }
  
 
  
  @Test
  public void addNoPointBuyingPriceToMemberPoints(){
        mc=new MemberCustomer ("Ann", "LoveShop", 0);
        mc.addPointFromBuyingTotalPrice(20);
        double expected = 0;
        double actual= mc.getPoints();
        assertEquals(expected, actual, 0.01);
     
  }
  
  @Test
  public void get20DiscountForMemberCustomer(){
      mc=new MemberCustomer ("Ann", "LoveShop", 0);
      double expected=0.2;
      double actual = mc.getDiscountRate();
      assertEquals(expected, actual, 0.01);
      
  }
  
  @Test
  public void redeemMoreThanPoints(){
       mc=new MemberCustomer ("Ann", "LoveShop", 200);
       double actual=mc.redeemPoint2Cash(1000);
       double expected=-1;
       assertEquals(expected, actual, 0.01);
       
       
  }
  @Test
  public void redeemEqualsPoints(){
       mc=new MemberCustomer ("Ann", "LoveShop", 800);
       double actual=mc.redeemPoint2Cash(800);
       double expected=100;
       assertEquals(expected, actual, 0.01);
       
       
  }
  
  @Test
  public void redeemLessThanPoints(){
       mc=new MemberCustomer ("Ann", "LoveShop", 20000);
       double actual=mc.redeemPoint2Cash(2000);
       double expected=200;
       assertEquals(expected, actual, 0.01);
       
       
  }
  
  @Test
  public void getPointsAfterRedeemMoreThanPoints(){
       mc=new MemberCustomer ("Ann", "LoveShop", 200);
       mc.redeemPoint2Cash(1000);
       double actual=mc.getPoints();
       double expected=200;
       assertEquals(expected, actual, 0.01);
  }
  
  @Test
  public void getPointsAfterRedeemLessThanPoints(){
       mc=new MemberCustomer ("Ann", "LoveShop", 20000);
       mc.redeemPoint2Cash(2000);   
       double actual=mc.getPoints();
       double expected=18400;
       assertEquals(expected, actual, 0.01);
  }
  
  @Test
  public void getPointsAfterRedeemEqualsPoints(){
       mc=new MemberCustomer ("Ann", "LoveShop", 800);
       mc.redeemPoint2Cash(800);
          
       double actual=mc.getPoints();
       double expected=0;
       assertEquals(expected, actual, 0.01);;
  }
}
