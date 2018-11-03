/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membercard;

/**
 *
 * @author Student
 */
public class MemberCard {
    public static final int POINTS2CASH100 = 800;
    public static final int BATH2POINTS = 25;
    private long memberId;
    private double totalPurchaseAmount;
    private int totalPoints;
    private int numberOfRedeem;
    private int usagePoints;

    public MemberCard(long idCard) {
        this.memberId = idCard;
    }
    
    private void addPoint(double purchaseAmount){
        int point = (int)(purchaseAmount/BATH2POINTS);
        this.totalPoints = this.totalPoints+point;
    }
    
    public void buy(double purchaseAmount){
        this.totalPurchaseAmount=this.totalPurchaseAmount+purchaseAmount;
        addPoint(purchaseAmount);
    }
    
    public int redeem(){
        if(totalPoints>=POINTS2CASH100){
            usagePoints=usagePoints+POINTS2CASH100;
            numberOfRedeem=numberOfRedeem+1;
            return 100;
        }else{
            return 0;
        }
    }
    
    
    public int getRemainingPointing(){
        return totalPoints-usagePoints;
    }
    
    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getUsagePoints() {
        return usagePoints;
    }

    public int getNumberOfRedeem() {
        return numberOfRedeem;
    }

    
    public long getMemberId() {
        return memberId;
    }

    
    @Override
    public String toString() {
        return "MemberCard{" + "memberId=" + memberId + ", totalPurchaseAmount=" + totalPurchaseAmount + 
                ", totalPoints=" + totalPoints + "\n, numberOfRedeem=" + numberOfRedeem + ", usagePoints=" + usagePoints +
                ",remaingPoints = "+getRemainingPointing()+'}';
    }
    
    
    
}
