package TrainerApp;
public class Exercise {
    private Treadmill treadmill;
    private Elliptical elliptical;

    public Exercise() {
        this.treadmill=new Treadmill();
        this.elliptical=new Elliptical();
    }
    
    public int courseA(){
        return treadmill.helpMetabolism()+(elliptical.helpMetabolism()/2);
    }
    
    public int courseB(){
        return (int)(treadmill.helpMetabolism()*1.5+sitUp(30));
    }

    public int playTreadmill(int time) {
        double kcal = (treadmill.helpMetabolism()*time)/60;
        return (int)kcal;
    }

    public int playElliptical(int time) {
        double kcal = (elliptical.helpMetabolism()*time)/60;
        return (int)kcal;
    }
    
    public int sitUp(int amount){
        return (int)(amount/2);
    }
    
    
}
/*Jatawatsafe*/