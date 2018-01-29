package student.model;
public class Student {
    private long stdId;
    //Student object has a string object
    private String stdName;
    //link to aggregated/container class
    // Student has an address
    private Address stdAddr;
    
    public Student (long stdId, String stdName, Address stdAddr){
        this.stdId=stdId;
        this.stdName=stdName;
        this.stdAddr=stdAddr;   //โยนได้ค่าเดียวคือ Memory Address  
    }

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public Address getStdAddr() {
        return stdAddr;
    }

    public void setStdAddr(Address stdAddr) {
        this.stdAddr = stdAddr;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdName=" + stdName + ", stdAddr=" + stdAddr + '}';
    } 
}
