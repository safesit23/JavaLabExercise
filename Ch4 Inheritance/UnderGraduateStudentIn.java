package Ch4Inheritance;
public class UnderGraduateStudentIn extends StudentIn{
    private String project;

    public UnderGraduateStudentIn() {
    System.out.println("UnderGraduateStudent Constructor Working");
    }
    

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
    
    @Override
    public String showPortfolio() {
        return "\n"+project; 
    }

    @Override
    public String toString() {
        return "UnderGraduateStudentIn{" + "project=" + project + '}';
    }
    
}
