package Medicable;
public class CommonHollyhock extends Herb{

    public CommonHollyhock(String type, int medicineId, String name, String[] ingredient) {
        super(type, medicineId, name, ingredient);
    }
    
    public String medicProperties1(){
        return "Believed to be an emollient and laxative. It is used to control inflammation, to stop bedwetting and as a mouthwash in cases of bleeding gums";
    }
    public String[] medicIngredient(){
        return super.getIngredient();
    }
    public String medicWarning(){
        return "USE USE USE";
    }

    @Override
    public String toString() {
        return super.toString()+"CommonHollyhock{" + '}'+medicProperties1()+"\n"+medicWarning();
    }
    
}
