package Shape;
public class TestShape {
    public static void main(String[] args) {
        Shape s1;   //สร้าง Ref ได้
        //Shape s2 = new Shape(); //เป็น Abstract New ไม่ได้
        Circle c1;
        //Circle c2 = new Circle();   //ยังติด Abstract ทำให้ New ไม่ได้
        Circle2 c3 = new Circle2();
    }
}

