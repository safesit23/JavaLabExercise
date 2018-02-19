package Shape;
public class Rectangle implements ShapeInterface, Comparable<Rectangle>{
    private double width;
    private double length;
    
    @Override
    public int compareTo(Rectangle o){
        return (int)(findArea()-o.findArea());
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public double findArea(){
        return width*length;
    }
    
    public double findCircumference(){
        return 2*(width+length);
    }
    
    public double computeArea(){    //เหมือน findArea
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

    
}
