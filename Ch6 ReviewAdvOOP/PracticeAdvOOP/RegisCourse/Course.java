package sit.model;

public class Course  {

    private String courseName;
    private RegisStudent[] students;
    private int numberOfStudents;

    public Course(String courseName, int numOfStudentCanRegis) {
        this.courseName=courseName;
        this.students= new RegisStudent[numOfStudentCanRegis];
        this.numberOfStudents=0;
    }

    public RegisStudent[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        String course = "----" + courseName + "----\n";
        for (RegisStudent rs : students) {
            course += rs + "\n";
        }
        return course;

    }
}
