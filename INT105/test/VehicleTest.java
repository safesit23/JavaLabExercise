import AbstractAndInterface.Motorcycle;
import AbstractAndInterface.Plane;
import AbstractAndInterface.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle motorrad = new Motorcycle(1,"Vi-001","Honcool",100);
    private Vehicle plane = new Plane(1,"Bow-001","NokLionAir",1000);

    public VehicleTest() {
    }
    
    @Test
    public void checkMotorrad1() {
        boolean expectResult = false;
        boolean  result=motorrad.checkConsumeEnergy(900);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkMotorrad2() {
        boolean expectResult = false;
        boolean  result=motorrad.checkConsumeEnergy(833.5);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkMotorrad3() {
        boolean expectResult = true;
        boolean  result=motorrad.checkConsumeEnergy(833);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkMotorrad4() {
        boolean expectResult = true;
        boolean  result=motorrad.checkConsumeEnergy(800);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkPlane1() {
        boolean expectResult = false;
        boolean  result=plane.checkConsumeEnergy(20000);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkPlane2() {
        boolean expectResult = true;
        boolean  result=plane.checkConsumeEnergy(10000);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkPlane3() {
        boolean expectResult = true;
        boolean  result=plane.checkConsumeEnergy(9000);
        assertEquals(expectResult, result);
    }
    
}
