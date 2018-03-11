package TrainerApp;
public class Elliptical implements ExerciseMachine{
    private String name;
    private int price;

    public Elliptical() {
        this.name="elliptical";
        this.price=17500;
    }
    
    
    @Override
    public int helpMetabolism(){
        return 400;
    }
}
/*Jatawatsafe*/