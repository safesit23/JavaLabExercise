import model.CountText;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountTextTest {

    private String sentence = "Java Application";
    private char[] char4count = {'a', 'I', 'c'};
    
    private String sentence2 = "Hello WorLd";
    private char[] char4count2 = {'H', 'e', 'l', 'o', 'W'};
    

    @Test
    public void checkResult() {
        int[] expectResult = {4, 2, 1};
        int[] result = CountText.countCharInText(sentence, char4count);
        assertArrayEquals(expectResult, result);
    }

    @Test
    public void checkLength() {
        int expectResult = 3;
        int result = CountText.countCharInText(sentence, char4count).length;
        assertEquals(expectResult, result);
    }
    
    @Test
    public void checkResult2() {
        int[] expectResult = {1, 1, 3, 2, 1};
        int[] result = CountText.countCharInText(sentence2, char4count2);
        assertArrayEquals(expectResult, result);
    }

    @Test
    public void checkLength2() {
        int expectResult = 5;
        int result = CountText.countCharInText(sentence2, char4count2).length;
        assertEquals(expectResult, result);
    }
}
