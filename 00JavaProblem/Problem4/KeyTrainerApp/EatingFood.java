package TrainerApp;
public class EatingFood extends Food{
    private String foodTime;

    public EatingFood() {
        this.foodTime = "Dinner";
    }
    
    public int getEnergy(){
        return 400;
    }
    public int getEnergyMore(){
        return 7000;
    }
}
/*Jatawatsafe*/