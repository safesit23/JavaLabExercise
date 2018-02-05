package Array;
public class Student {
    private String name;
    private double weight;
    private double height;
    private double bmi;

    public Student(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        if(this.height<0||this.weight<0){
            bmi=-1;
        }else if(height==0){
            bmi=-2;
        }else{
            bmi=this.weight/Math.pow(this.height, 2);
        }
    }


    public double getBmi() {
        return bmi;
    }
    
    
}
