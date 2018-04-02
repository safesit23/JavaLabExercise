package reviewinterface;
public class Dog implements Informationable{
    @Override
    public boolean isLife(){
        return true;
    }
    @Override
    public String move(){
        return "move by 4 leg";
    }
    @Override
    public String giveDetail(){
        return "HONG HONG";
    }
}
