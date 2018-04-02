package reviewinterface;

public class Human implements Informationable{
    @Override
    public boolean isLife(){
        return true;
    }
    @Override
    public String move(){
        return "move by leg";
    }
    @Override
    public String giveDetail(){
        return "Can write JAVA";
    }
}
