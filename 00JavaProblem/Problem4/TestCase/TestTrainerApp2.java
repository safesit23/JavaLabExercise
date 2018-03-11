import TrainerApp.Exercise;
import TrainerApp.TrainerApp;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTrainerApp2 {
    Exercise exercise = new Exercise();
    private TrainerApp[] trainerApp = new TrainerApp[]{new TrainerApp("Ann",1600,55),new TrainerApp("Boo",1200,49),new TrainerApp("Charlie",2000,60)};

    public TestTrainerApp2() {
    }
    
    //---------------------TEST Trainer App------------------------------
    @Test
    public void testExerciseCourseA() {
        int expectResult = 1450;
        int  result=trainerApp[2].exerciseCourse('A');
        int expectResult2 = 1450;
        int  result2=trainerApp[2].getKcal();
        assertEquals(expectResult, result);
        assertEquals(expectResult2, result2);
    }
    @Test
    public void testExerciseCourseAbutNotAllow() {
        int expectResult1 = -1;
        int  result1=trainerApp[0].exerciseCourse('A');
        int expectResult2 = 1600;
        int  result2=trainerApp[0].getKcal();
        assertEquals(expectResult1, result1);
        assertEquals(expectResult2, result2);
    }
    @Test
    public void testExerciseCourseB() {
        int expectResult = 1460;
        int  result=trainerApp[2].exerciseCourse('B');
        int expectResult2 = 1460;
        int  result2=trainerApp[2].getKcal();
        assertEquals(expectResult, result);
        assertEquals(expectResult2, result2);
    }
    @Test
    public void testExerciseCourseBbutNotAllow() {
        int expectResult1 = -1;
        int  result1=trainerApp[1].exerciseCourse('B');
        int expectResult2 = 1200;
        int  result2=trainerApp[1].getKcal();
        assertEquals(expectResult1, result1);
        assertEquals(expectResult2, result2);
    }
    
    @Test
    public void testExerciseSpecific1() {
        int expectResult1 = 1338;
        int  result1=trainerApp[0].exerciseSpecific("treadmill", 45);
        int expectResult2 = 1338;
        int  result2=trainerApp[0].getKcal();
        int expectResult3 = 262;
        int  result3=exercise.playTreadmill(45);
        assertEquals(expectResult1, result1,1);
        assertEquals(expectResult2, result2,1);
        assertEquals(expectResult3, result3,1);
    }
    @Test
    public void testExerciseSpecific2() {
        int expectResult1 = 1200;
        int  result1=trainerApp[0].exerciseSpecific("elliptical", 60);
        int expectResult2 = 1200;
        int  result2=trainerApp[0].getKcal();
        int expectResult3 = 400;
        int  result3=exercise.playElliptical(60);
        assertEquals(expectResult1, result1);
        assertEquals(expectResult2, result2);
        assertEquals(expectResult3, result3);
    }
    @Test
    public void testExerciseSpecific3() {
        int expectResult1 = 1525;
        int  result1=trainerApp[0].exerciseSpecific("sitUp", 150);
        int expectResult2 = 1525;
        int  result2=trainerApp[0].getKcal();
        int expectResult3 = 75;
        int  result3=exercise.sitUp(150);
        assertEquals(expectResult1, result1);
        assertEquals(expectResult2, result2);
        assertEquals(expectResult3, result3);
    }
    @Test
    public void testExerciseSpecificButNotAllow() {
        int expectResult1 = -1;
        int  result1=trainerApp[1].exerciseSpecific("sitUp", 200);
        int expectResult2 = 1200;
        int  result2=trainerApp[1].getKcal();
        assertEquals(expectResult1, result1);
        assertEquals(expectResult2, result2);
    }
    
    @Test
    public void testEatingNormalFood() {
        int expectResult1 = 1600;
        int  result1=trainerApp[1].eatingFood("NormalFood");
        assertEquals(expectResult1, result1);
    }
    @Test
    public void testEatingShabuBuffet() {
        int expectResult1 = 8200;
        int  result1=trainerApp[1].eatingFood("ShabuBuffet");
        assertEquals(expectResult1, result1);
    }
    @Test
    public void testguessYourWeightWithIncrease() {
        int expectResult1 = 50;
        int expectResult2 = 8200;
        int temp=trainerApp[1].eatingFood("ShabuBuffet");
        int result1=trainerApp[1].guessYourWeight();
        assertEquals(expectResult2, temp);
        assertEquals(expectResult1, result1);
    }
    @Test
    public void testguessYourWeightWithNoIncrease() {
        int expectResult1 = 60;
        trainerApp[2].eatingFood("NormalFood");
        int result1=trainerApp[2].guessYourWeight();
        assertEquals(expectResult1, result1);
    }
    @Test
    public void testDailyActivityOfAnn() {
        int expectResult1 = 1800;
        trainerApp[0].eatingFood("NormalFood");
        trainerApp[0].exerciseCourse('A');
        trainerApp[0].exerciseSpecific("situp", 100);
        trainerApp[0].eatingFood("NormalFood");
        int result1=trainerApp[0].getKcal();
        assertEquals(expectResult1, result1);
    }
    @Test
    public void testDailyActivityOfBoo() {
        int expectResult1 = 1600;
        trainerApp[1].exerciseCourse('B');
        trainerApp[1].eatingFood("NormalFood");
        int result1=trainerApp[1].getKcal();
        assertEquals(expectResult1, result1);
    }
    @Test
    public void testDailyActivityOfCharlie() {
        int expectResult1 = 15895;
        int expectResult2 = 62;
        trainerApp[2].eatingFood("ShabuBuffet");
        trainerApp[2].exerciseSpecific("treadmill", 120);
        trainerApp[2].eatingFood("NormalFood");
        trainerApp[2].exerciseSpecific("situp", 10);
        trainerApp[2].eatingFood("ShabuBuffet");
        trainerApp[2].exerciseSpecific("elliptical", 30);
        trainerApp[2].eatingFood("NormalFood");
        int result1=trainerApp[2].getKcal();
        int result2=trainerApp[2].guessYourWeight();
        assertEquals(expectResult1, result1);
        assertEquals(expectResult2, result2);
    }
}
/*Jatawatsafe*/