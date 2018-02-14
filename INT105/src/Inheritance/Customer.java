package Inheritance;

public class Customer {
private int memberID;
private String name;
protected int expense;
protected double point;

    public Customer() {
    }

    public Customer(int memberID, String name, int expense) {
        this.memberID = memberID;
        this.name = name;
        this.point = point;
        this.expense = expense;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }
    
    
    public double collectPoint(){
        point=expense/100;
        return point;
    }

    @Override
    public String toString() {
        return "Customer{" + "memberID=" + memberID + ", name=" + name + ", point=" + point + '}';
    }

}