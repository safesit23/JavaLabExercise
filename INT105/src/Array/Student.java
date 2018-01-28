package Array;
public class Student {
    private int studentId;
    private String name;
    private double scores;
    private char grades;
    private static int countStudent;

    public Student() {
        countStudent++;
        this.studentId = 600+countStudent++;
    }

    public Student(String name, double scores) {
        countStudent++;
        this.studentId = 600+countStudent++;
        this.name = name;
        this.scores = scores;
        setGrades();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public char getGrades() {
        return grades;
    }

    public void setGrades() {
        if(scores>=80){
            this.grades = 'A';
        }else if(scores>=70){
           this.grades = 'B';
        }else if(scores>=60){
            this.grades = 'C';
        }else if(scores>=50){
            this.grades = 'D';
        }else{
            this.grades = 'F';
        }  
    }
    
    public static int getCountStudent() {
        return countStudent;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name=" + name + " | scores=" + scores + " | Grade '" + grades + "'" ;
    }
    
}
