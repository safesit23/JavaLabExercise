package Array;
public class Student {
    private int studentId;
    private String name;
    private double scores;
    private char grades;
    private static int countStudent;
    private double weight;
    private double height;

    public Student() {
        countStudent++;
        this.studentId = 600+countStudent;
    }

    public Student(String name, double scores) {
        countStudent++;
        this.studentId = 600+countStudent;
        this.name = name;
        this.scores = scores;
        setGrades();
    }

    public Student(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public int getStudentId() {
        return studentId;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public static int getCountStudent() {
        return countStudent;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name=" + name + " | scores=" + scores + " | Grade '" + grades + "'" ;
    }
    
}
