package Shape;
public abstract class Shape {
    protected int shaped;

    public Shape() {
    }

    public Shape(int shaped) {
        this.shaped = shaped;
    }

    public abstract double findArea();  //ไม่ Implement โดยใส่ Abstract
    public abstract double findCircumference(); //ไม่ Implement โดยใส่ Abstract

    @Override
    public String toString() {
        return "Shape{" + "shaped=" + shaped + '}';
    }

    
}


