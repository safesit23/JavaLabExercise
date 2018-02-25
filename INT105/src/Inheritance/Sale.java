package Inheritance;

public class Sale extends Employee{
    private double commission;

    public Sale(double commission) {
        this.commission = commission;
    }

    public Sale(double commission, int employeeId, String name, double salary) {
        super(employeeId, name, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    @Override
    public double getSalary() {
        return super.getSalary()+commission;
    }

    @Override
    public String toString() {
        return "Sale{" + "commission=" + commission + '}';
    }
    
    public boolean Equals(Object obj){
        Sale temp=null;
        if(obj !=null&&obj instanceof Sale){
            temp = (Sale)obj;
            if(super.getEmployeeId()==temp.getEmployeeId()){
                if(super.getName().equals(temp.getName())){
                    return true;
                }
            }
        }
        return false;
    }
    
}
