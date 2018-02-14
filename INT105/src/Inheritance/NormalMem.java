package Inheritance;

public class NormalMem extends Customer {

    public NormalMem() {
    }

    public NormalMem(int memberID, String name, int expense) {
        super(memberID, name, expense);
    }
    
    
    @Override
    public double collectPoint(){
        point=expense/50;
        return point;
    }
    
    public double discount(){
        double payment;
        payment = expense-(expense*10/100);
        return payment;
    }
    
}