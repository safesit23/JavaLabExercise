package Aggregation;
public class TestStudent {
    public static void main(String[] args) {
        Address stdAddr = new Address("123", "Sukumvit","Bangkok",11150);
        RegisteredCourse int101 = new RegisteredCourse(101,1,3.5);
        RegisteredCourse int121 = new RegisteredCourse(121,3,3);
        RegisteredCourse int102 = new RegisteredCourse(102,3,4);
        RegisteredCourse[] sit = {int101,int121,int102};
        Student std1 = new Student(601305000l, "Mr.R", sit, stdAddr);
        System.out.println("GPAX = "+std1.gpax());
        
        
        
    }
}
