package self.model;

public class MemberCustomer extends Customer {
    private double points;
    private static double discountRate=0.2;

    public MemberCustomer(double points) {
        this.points = points;
    }

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;
    }
    
    @Override
    public double getDiscountRate(){
        return discountRate;
    }
    @Override
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    
    @Override
    public double redeemPoint2Cash(int usePoints){
        double cash=0;
        if(usePoints<800||usePoints>points){
            System.out.println("Your points are not enough!");
            cash=-1;
        }
        else{
            int use=(int)usePoints/800;
            cash=use*100;
            points = points-(use*800);
        }
        return cash;
    }
    
    
    @Override
    public void addPointFromBuyingTotalPrice(double buyinglPrice){
        int newpoints = (int)(buyinglPrice/25);
        points=points+newpoints;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString()+"MemberCustomer{" + "points=" + points + '}';
    }
}
