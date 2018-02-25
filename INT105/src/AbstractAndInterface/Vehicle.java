package AbstractAndInterface;
public abstract class Vehicle {
    private int vehicleId;

    public Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    public abstract boolean checkConsumeEnergy(double distance);

    public int getVehicle() {
        return vehicleId;
    }

    public void setVehicle(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicle=" + vehicleId + '}';
    }
    
    
}
