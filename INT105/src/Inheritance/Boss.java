package Inheritance;
public class Boss extends Employee{
    private double rate;

    public Boss(double rate) {
        this.rate = rate;
    }

    public Boss(double rate, int employeeId, String name, double salary) {
        super(employeeId, name, salary);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public double getSalary() {
        return super.getSalary()+((0.75/100)*super.getSalary());
    }
    
    @Override
    public boolean equals(Object obj){
    Boss temp=null;
    if(obj!=null&&obj instanceof Boss){
        temp = (Boss)obj;
        if(super.getEmployeeId()==temp.getEmployeeId()){
            if(super.getName().equals(temp.getName())){
                    return true;
                }
        }
    }
    return false;
    }

    @Override
    public String toString() {
        return "Boss{" + "rate=" + rate + '}';
    }
}
