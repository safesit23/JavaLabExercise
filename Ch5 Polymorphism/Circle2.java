package Shape;
public class Circle2 extends Circle{

    public Circle2(double radius, int shaped) {
        super(radius, shaped);
    }
    
    public double findCircumference(){
        return 2*Math.PI*getRadius();    //ใช้ Super. ไม่ได้เพราะไม่ได้ Shadow กัน *ห้ามแก้ private ที่พ่อ
    }

    @Override
    public String toString() {
        return super.toString();    //ดึง toString จากตัวพ่อมาทั้งหมดจนครบ
    }
    
}
