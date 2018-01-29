package student.view;
public class CheckAnswer {
    public static void main(String[] args) {
        char[] stdAnswer = new char [] {'A', 'B', 'C'};
        char[] solAnswer = new char[] {'A', 'C', 'C', 'A', 'B'};
        System.out.println("TRUE="+examChecking(stdAnswer,solAnswer));
    }
    
    public static int examChecking(char[]stdAnswer,char[] solAnswer){
        int trueAns=0;
        int countQ=solAnswer.length;
        int countA=stdAnswer.length;
        if(countA==countQ){
            for(int i=0;i<countQ;i++){
                if(stdAnswer[i]==solAnswer[i]){
                    trueAns++;
                }
            }
        }else{
            trueAns=-1;
        }
       
        return trueAns;
    }
}
