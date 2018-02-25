package AbstractAndInterface;

public class Motorcycle extends Vehicle{
    private String model;
    private String manufacturer;
    private double gasoline;

    public Motorcycle(int vehicleId,String model, String manufacturer, double gasoline) {
        super(vehicleId);
        this.model = model;
        this.manufacturer = manufacturer;
        this.gasoline = gasoline;
    }
    
    @Override
    public boolean checkConsumeEnergy(double distance){
        double actualDistance=gasoline/0.12;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public String toString() {
        return super.toString()+"Motorcycle{" + "model=" + model + ", manufacturer=" + manufacturer + ", gasoline=" + gasoline + '}';
    }
    
    
}
