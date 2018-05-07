package warmupkustudent;
public class KinderGartenStudent extends Student{
    private double schoolBusFee;
    private double annualFee;
    private String parentName;

    public KinderGartenStudent(double schoolBusFee, double annualFee, String parentName, long studentId, String studentName, double tuition) {
        super(studentId, studentName, tuition);
        this.schoolBusFee = schoolBusFee;
        this.annualFee = annualFee;
        this.parentName = parentName;
    }
    @Override
    public double expensePerSemester(){
        double total=this.tuition+this.annualFee+this.schoolBusFee;
        return total;
    }

    @Override
    public String toString() {
        return "KinderGartenStudent{" + super.toString()+"schoolBusFee=" + schoolBusFee + ", annualFee=" + annualFee + ", parentName=" + parentName + '}';
    }
    
}
