package student.view;
import student.model.Address;
import student.model.Student;
public class TestStudent {
    public static void main(String[] args) {
        Address johnAddr = new Address("123","Prachautid","BKK",12300);
        Student john = new Student(60123,"john",johnAddr);
        System.out.println(john);
        
        Address newJohn = new Address("444","Rachada","BKK",40510);
        
    }
}
