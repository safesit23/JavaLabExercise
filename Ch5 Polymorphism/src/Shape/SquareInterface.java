package Shape;
public abstract class SquareInterface implements ShapeInterface{
    private double side;

    public SquareInterface(double side) {
        this.side = side;
    }
    
    
    public double getSide() {
        return side;
    }
    
    public double findArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "SquareInterface{" + "side=" + side + '}';
    }
    
}

