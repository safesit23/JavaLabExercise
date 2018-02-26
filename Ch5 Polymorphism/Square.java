package Shape;
public class Square extends Shape{
    private double width;
    private double height;
    
    @Override
    public double findArea(){
        double area= width*height;
        return area;
    }
}
