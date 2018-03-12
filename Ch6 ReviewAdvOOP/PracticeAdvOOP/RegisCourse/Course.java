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

    public int addStudent(RegisStudent student) {
        boolean check=true;
        for(int i=0;i<this.numberOfStudents;i++){
            if(student.equals(students[i])){
                check=false; break;
            }
        }
        if(check==true){
            if(numberOfStudents<students.length){
                students[numberOfStudents]=student;
                this.numberOfStudents++;
                return this.numberOfStudents-1;
            }else{
                return -2;
            }
        }else{
            return -1;
        }
    }
    
    public boolean dropStudent(RegisStudent student) {
        boolean check=false;
        int index=0;
        for(int i=0;i<this.numberOfStudents;i++){
            if(student.equals(students[i])){
                index=i;
                check=true; break;
            }
        }
        if(check==true){
            for(int i=index;i<this.numberOfStudents-1;i++){
                students[i]=students[i+1];
            }
            this.numberOfStudents--;
            return true;
        }else{
            return false;
        }
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
