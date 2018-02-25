package AbstractAndInterface;
public class Plane extends Vehicle{
    private String model;
    private String airway;
    private double kerosene;

    public Plane(int vehicleId,String model, String airway, double kerosene) {
        super(vehicleId);
        this.model = model;
        this.airway = airway;
        this.kerosene = kerosene;
    }

    @Override
    public boolean checkConsumeEnergy(double distance){
        double actualDistance=kerosene*10;
        if(actualDistance>=distance){
            return true;
        }
        return false;
    }
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAirway() {
        return airway;
    }

    public void setAirway(String airway) {
        this.airway = airway;
    }

    public double getKerosene() {
        return kerosene;
    }

    public void setKerosene(double kerosene) {
        this.kerosene = kerosene;
    }

    @Override
    public String toString() {
        return "Plane{" + super.toString()+"model=" + model + ", airway=" + airway + ", kerosene=" + kerosene + '}';
    }
    
    
    
}
