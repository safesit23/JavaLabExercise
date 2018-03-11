import TrainerApp.EatingFood;
import TrainerApp.Elliptical;
import TrainerApp.Exercise;
import TrainerApp.TrainerApp;
import TrainerApp.Treadmill;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTrainerApp {
    private Treadmill treadmill = new Treadmill();
    private Elliptical elliptical = new Elliptical();
    private Exercise exercise = new Exercise();
    private EatingFood eatingFood = new EatingFood();
    private TrainerApp[] trainerApp = new TrainerApp[]{new TrainerApp("Ann",1600,55),new TrainerApp("Boo",1200,49),new TrainerApp("Charlie",2000,60)};

    public TestTrainerApp() {
    }
    //---------------------TestMethod:Exercise----------------------------
    @Test
    public void testHelpMetabolismInTreadmill() {
        int expectResult = 350;
        int  result=treadmill.helpMetabolism();
        assertEquals(expectResult, result);
    }
    
    @Test
    public void testHelpMetabolismInElliptical() {
        int expectResult = 400;
        int  result=elliptical.helpMetabolism();
        assertEquals(expectResult, result);
    }
    
    @Test
    public void testCourseA() {
        int expectResult = 550;
        int  result=exercise.courseA();
        assertEquals(expectResult, result);
    }
    
    @Test
    public void testCourseB() {
        int expectResult = 540;
        int  result=exercise.courseB();
        assertEquals(expectResult, result);
    }
    
    @Test
    public void testPlayTreadmill() {
        int expectResult = 700;
        int  result=exercise.playTreadmill(120);
        assertEquals(expectResult, result);
    }
    @Test
    public void testPlayElliptical() {
        int expectResult = 266;
        int  result=exercise.playElliptical(40);
        assertEquals(expectResult, result,1);
    }
    @Test
    public void testSitup() {
        int expectResult = 25;
        int  result=exercise.sitUp(50);
        assertEquals(expectResult, result);
    }
    //------------------------TestMethod:Food----------------------------
    @Test
    public void testGetEnergy() {
        int expectResult = 400;
        int  result=eatingFood.getEnergy();
        assertEquals(expectResult, result);
    }
    @Test
    public void testGetEnergyMore() {
        int expectResult = 7000;
        int  result=eatingFood.getEnergyMore();
        assertEquals(expectResult, result);
    }
    
    
    //---------------------CourseExercise------------------------------

}
/*Jatawatsafe*/