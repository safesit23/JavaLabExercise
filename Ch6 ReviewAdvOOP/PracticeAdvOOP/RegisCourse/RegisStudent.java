package sit.model;

public class RegisStudent {

    private int studentId;
    private String studentName;

    public RegisStudent(int stdId, String stdName) {
        studentId = stdId;
        studentName = stdName;

    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof RegisStudent) {
            RegisStudent s = (RegisStudent) o;
            if (studentId == s.studentId) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String result;

        result = "student Id : " + studentId + ", Name : " + studentName;
        return result;
    }

}
