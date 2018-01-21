package OOP.model;
public class SitShop {
    private String name;
    private double shopLength, shopLong;
    private double area;
    private char type;
    private static int countShop;
    
    public SitShop(){
        countShop++;
    }
    
    public SitShop(String name, double shopLength, double shopLong){
        this();
        this.name = name;
        this.shopLength = shopLength;
        this.shopLong = shopLong;
        area = this.shopLength*this.shopLong ;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getname(){
        return name;
    }

    public double getShopLength() {
        return shopLength;
    }

    public void setShopLength(double shopLength) {
        this.shopLength = shopLength;
    }

    public double getShopLong() {
        return shopLong;
    }

    public void setShopLong(double shopLong) {
        this.shopLong = shopLong;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setArea(){
        this.area = this.shopLength*this.shopLong;
    }
    
    public static int getCountShop() {
        return countShop;
    }
    
    
    @Override
    public String toString(){
        return "SIT Shop: "+name+"\nArea : "+area+" m^2";
    }
    
}
