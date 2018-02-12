import macproint105.ZodiacYear;
import org.junit.Test;
import static org.junit.Assert.*;
public class ZodiacTestYear {

    private int[] year = {1998, 2003, 2004, 2016, 2018};
    private int[] year2 = {2501, 2531, 2547, 2554, 2563, 2570};
    private int[] year3 = {1990, 2531, 2006, 2557};

    @Test
    public void checkName1() {
        String[] expectResult = {"tiger","sheep","monkey","monkey","dog"};
        String[] result = ZodiacYear.zodiacYear(year);
        assertArrayEquals(expectResult, result);
    }
    
    @Test
    public void checkLength() {
        int expectResult = 5;
        int result = ZodiacYear.zodiacYear(year).length;
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkName2() {
        String[] expectResult = {"dog","dragon","monkey","rabbit","rat","sheep"};
        String[] result = ZodiacYear.zodiacYear(year2);
        assertArrayEquals(expectResult, result);
    }
    
    @Test
    public void checkLength2() {
        int expectResult = 6;
        int result = ZodiacYear.zodiacYear(year2).length;
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkName3() {
        String[] expectResult = {"horse","dragon","dog","horse"};
        String[] result = ZodiacYear.zodiacYear(year3);
        assertArrayEquals(expectResult, result);
    }
    
    @Test
    public void checkLength3() {
        int expectResult = 4;
        int result = ZodiacYear.zodiacYear(year3).length;
        assertEquals(expectResult, result);
    }
    
}
