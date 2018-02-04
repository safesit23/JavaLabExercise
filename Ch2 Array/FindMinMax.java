package macproint105;
public class FindMinMax {
    public static void main(String[] args) {
        int[] score={100,30,60,20,80};
        System.out.println(findMinMax(score));
    }
    public static int[] findMinMax(int[] score){
        int[] result= new int{score[0],score[0]};
        for(int i=0;i<score.length;i++){
            if(score[i]<0||score[i]>100){
                return null;
            }
            if(score[i]<result[0]){
                result[0]=score[i];
            }
            if(score[i]>result[1]){
                result[1]=score[i];
            }
        }
        return result;
    }
    
}
