package Ch4Inheritance;
public class StudentIn {
    private long studentid;
    private String stdName;

    public StudentIn(long studentid, String stdName) {
        this.studentid = studentid;
        this.stdName = stdName;
    }

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    
    public String showPortfolio(){
        String portfolio=""+stdName;
        return portfolio;
    }
    
    @Override
    public String toString() {
        return "StudentIn{" + "studentid=" + studentid + ", stdName=" + stdName + '}';
    }
    
}
