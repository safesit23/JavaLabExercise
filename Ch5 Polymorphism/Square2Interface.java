package Shape;
public class Square2Interface extends SquareInterface{

    public Square2Interface(double side) {
        super(side);
    }
    
    
    public double findCircumference(){
        return getSide()*4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

