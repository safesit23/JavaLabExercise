package Array;
public class StudentBMI {
    public static void main(String[] args) {
        
    }
    public static String[] bmiStudents(Student std[]){
        String[] bmi = new String[std.length];
        for(int i=0;i<bmi.length;i++){
            bmi[i]=bmiCategory(std[i]);
        }
        return bmi;
    }
    public static String bmiCategory(Student std){
        String bmiCategory;
        if(std.getBmi()<0){
            bmiCategory="none";
        }else if(std.getBmi()<18.5){
            bmiCategory="under weight";
        }else if(std.getBmi()<25){
            bmiCategory="normal weight";
        }else if(std.getBmi()<30){
            bmiCategory="over weight";
        }else{
            bmiCategory="obesity";
        }
        return bmiCategory;
    }
}
