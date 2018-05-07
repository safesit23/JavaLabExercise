package warmupkustudent;
public class UniversityStudent extends Student{
    private double educationSupportFee;
    private boolean scholarship;
    private boolean alumni;

    public UniversityStudent(double educationSupportFee, boolean scholarship, boolean alumni, long studentId, String studentName, double tuition) {
        super(studentId, studentName, tuition);
        this.educationSupportFee = educationSupportFee;
        this.scholarship = scholarship;
        this.alumni = alumni;
    }

    @Override
    public double expensePerSemester(){
        double tuitionFee=this.tuition;
        if(this.scholarship){
            tuitionFee=tuitionFee-((10*tuitionFee)/100);
        }
        if(this.alumni){
            tuitionFee=tuitionFee-((5*tuitionFee)/100);
        }
        double total=tuitionFee+this.educationSupportFee;
        return total;
    }
    
    @Override
    public String toString() {
        return "UniversityStudent{" + super.toString()+"educationSupportFee=" + educationSupportFee + ", scholarship=" + scholarship + ", alumni=" + alumni + '}';
    }
    
}
