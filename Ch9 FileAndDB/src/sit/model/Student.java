package sit.model;
public class Student {
    private int stdId;
    private String stdFirstName;
    private String stdLastName;

    public Student() {
    }

    public Student(int stdId, String stdFirstName, String stdLastName) {
        this.stdId = stdId;
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdFirstName=" + stdFirstName + ", stdLastName=" + stdLastName + '}';
    }
    
}
