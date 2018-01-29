package student.model;
public class RegisteredCourse {
    private int courseId;
    private int courseCredit;
    private int grade;

    public RegisteredCourse(int courseId, int courseCredit, int grade) {
        this.courseId = courseId;
        this.courseCredit = courseCredit;
        this.grade = grade;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "RegisteredCourse{" + "courseId=" + courseId + ", courseCredit=" + courseCredit + ", grade=" + grade + '}';
    }
    
    
}
