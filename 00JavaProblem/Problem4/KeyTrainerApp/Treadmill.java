package TrainerApp;
public class Treadmill implements ExerciseMachine{
    private String name;
    private int price;

    public Treadmill() {
        this.name = "Treadmill";
        this.price = 25000;
    }
    
    @Override
    public int helpMetabolism(){
        return 350;
    }
}
/*Jatawatsafe*/