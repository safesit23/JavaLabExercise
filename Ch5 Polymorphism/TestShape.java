package Shape;
public class TestShape {
    public static void main(String[] args) {
        /*
        //Abstract
        Shape s1;   //สร้าง Ref ได้
        Shape s2 = new Shape(); //เป็น Abstract New ไม่ได้
        Circle c1;
        Circle2 c2 = new Circle2(2.5,1);
        double area=c2.findArea();
        double circum=c2.findCircumference();
        System.out.println("Area C2="+area);
        System.out.println("Circum C2="+circum);
        System.out.println(c2);
        */
        /*
        //Interface
        Square2Interface sq1 = new Square2Interface(5);
        double areasquare = sq1.findArea();
        double circumsquare = sq1.findCircumference();
        System.out.println("Area= "+areasquare+"\nCircum= "+circumsquare);
        System.out.println(sq1);
        */
        
        //Comparable Interface
        Rectangle rec1=new Rectangle(5,10);
        Rectangle rec2=new Rectangle(2,4);
        int result = rec1.compareTo(rec2);
        if(result>0){
            System.out.println("Rec2 comes before rec1");
        }else if(result<0){
            System.out.println("Rec1 comes before rec2");            
        }else{
            System.out.println("Rec1 is equally rec2");                
        }
        
    }
}

