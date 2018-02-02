public class ExamChecking {
    public static void main(String[] args) {
        char[] stdAnswer = new char [] {'A', 'B', 'C'};
        char[] solAnswer = new char[] {'A', 'C', 'C', 'A', 'B'};
        System.out.println("TRUE="+examChecking(stdAnswer,solAnswer));
    }
    
    public static int examChecking(char[]stdAnswer,char[] solAnswer){
        int pointAns=0;
        int countQ=solAnswer.length;
        int countA=stdAnswer.length;
        if(countA==countQ){                    
            for(int i=0;i<countQ;i++){         
                if(stdAnswer[i]==solAnswer[i]){    
                    pointAns=pointAns+2;
                }else{
                    pointAns--;
                }
            }
        }else{                       
            for(int i=0;i<countA;i++){         
                if(stdAnswer[i]==solAnswer[i]){    
                    pointAns=pointAns+2;
                }else{
                    pointAns--;
                }
            }
            for(int j=countA;j<countQ;j++){
                pointAns--;
            }
        }
       
        return pointAns;
    }
}