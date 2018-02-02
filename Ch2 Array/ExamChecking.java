package student.view;
public class ExamChecking {
    public static void main(String[] args) {
        char[] stdAnswer = new char [] {'A', 'B', 'C'};
        char[] solAnswer = new char[] {'A', 'C', 'C', 'A', 'B'};
        System.out.println("TRUE="+examChecking(stdAnswer,solAnswer));
    }
    
    public static int examChecking(char[]stdAnswer,char[] solAnswer){
        int trueAns=0;
        int countQ=solAnswer.length;
        int countA=stdAnswer.length;
        if(countA==countQ){                     //ถ้าจำนวนคำตอบเท่ากับคำถาม
            for(int i=0;i<countQ;i++){          //วนLoopแต่ละข้อ
                if(stdAnswer[i]==solAnswer[i]){     //ถ้าคำตอบตรงกับคำถาม
                    trueAns++;                  //นับจำนวนเพิ่ม
                }
            }
        }else{                          //ถ้าจำนวนคำตอบ ไม่เท่ากับ คำถาม
            trueAns=-1;                 //ให้เท่ากับ -1
        }
       
        return trueAns;
    }
}
