package student.model;
public class Address {
    private String houseNo;
    private String addr;
    private String province;
    private int zipCode;

    public Address(String houseNo, String addr, String province, int zipCode) {
        this.houseNo = houseNo;
        this.addr = addr;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", addr=" + addr + ", province=" + province + ", zipCode=" + zipCode + '}';
    }
    
    
}
