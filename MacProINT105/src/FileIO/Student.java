package FileIO;

import java.io.Serializable;

public class Student implements Serializable{
    private int stdId;
    private String name;

    public Student() {
    }

    
    public Student(int stdId, String name) {
        this.stdId = stdId;
        this.name = name;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", name=" + name + '}';
    }
    
    
}
