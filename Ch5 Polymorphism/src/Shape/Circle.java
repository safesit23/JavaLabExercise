package Shape;
public abstract class Circle extends Shape{
    private double radius;

    public Circle(double radius, int shaped) {
        super(shaped);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    
    @Override
    public double findArea(){
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return super.toString()+"Circle{" + "radius=" + radius + '}';
    }
    
}
