package Shape;
public class Square2Interface extends SquareInterface{

    public Square2Interface(double side) {
        super(side);
    }
    
    
    public double findCircumference(){
        return getSide()*4;
    }
}

