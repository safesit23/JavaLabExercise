import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ExamCheckingTest {
    private ExamChecking testEx;
    private char[] stdAnswer;
    private char[] solAnswer;
    public ExamCheckingTest() {
       testEx=new ExamChecking();
    }
    @Test
    public void allStudentAnswerIncorrect(){
        stdAnswer = new char [] {'D', 'B', 'C', 'A', 'A'};
        solAnswer = new char[] {'B', 'C', 'D', 'B', 'B'};
        int expectResult=-5;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }

    @Test
    public void allStudentAnswerCorrect(){
        stdAnswer = new char [] {'C', 'D', 'A','E','D'};
        solAnswer = new char[] {'C', 'D', 'A','E','D'};
        int expectResult=10;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void someStudentAnswerCorrect(){
        stdAnswer = new char [] {'B', 'B', 'C', 'D', 'A'};
        solAnswer = new char[] {'B', 'C', 'D', 'A', 'A'};
        int expectResult=1;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
  
    @Test
    public void notEquallyNumberOfExam1(){
        stdAnswer = new char [] {'A', 'D', 'C'};
        solAnswer = new char[] {'A', 'D', 'C', 'D', 'A'};
        int expectResult=4;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);  
    }
    
    @Test
    public void notEquallyNumberOfExam2(){
        stdAnswer = new char [] {'B', 'D', 'A'};
        solAnswer = new char[] {'B', 'D', 'C', 'D', 'A'};
        int expectResult=1;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);  
    }
}
