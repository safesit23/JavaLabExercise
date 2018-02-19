package Shape;
public class TestShape {
    public static void main(String[] args) {
        Shape s1;   //สร้าง Ref ได้
        //Shape s2 = new Shape(); //เป็น Abstract New ไม่ได้
        /*Circle c1;
        Circle2 c2 = new Circle2(2.5,1);
        double area=c2.findArea();
        double circum=c2.findCircumference();
        System.out.println("Area C2="+area);
        System.out.println("Circum C2="+circum);
        System.out.println(c2);
        */
        Square2Interface sq1 = new Square2Interface(5);
        double areasquare = sq1.findArea();
        double circumsquare = sq1.findCircumference();
        System.out.println("Area= "+areasquare+"\nCircum= "+circumsquare);
        System.out.println(sq1);
    }
}

