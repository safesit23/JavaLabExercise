package reviewinterface;

public class Car implements Informationable{
    @Override
    public boolean isLife(){
        return false;
    }
    @Override
    public String move(){
        return "move by wheel!";
    }
    @Override
    public String giveDetail(){
        return "Vehicle";
    }
}
