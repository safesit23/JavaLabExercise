package ArrayExercise;
public class TestArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {5,2,1,7,9};   
        for(int score: addArray(num1,num2)){
            System.out.print(" "+score);
        }
    }
    
    public static void printArray(double [] values){
        for(double value:values){
            System.out.print(" "+value);
        }
    }

    public static int[] addArray(int[] num1,int[] num2){
        if (num1==null||num2==null)
            return null;
        
        int[] sum;
        int i, dataSize=0;
        
        if(num1.length>num2.length){
            sum = new int[num1.length];
            dataSize=num2.length;
            for(i=dataSize;i<num1.length;i++){
            sum[i]=num1[i];
            }
            
        }else{
            sum = new int[num2.length];
            dataSize=num1.length;
            for(i=dataSize;i<num2.length;i++){
            sum[i]=num2[i];
            }
        }
        
        for(i=0;i<dataSize;i++){
            sum[i]=num1[i]+num2[i];
        }
        
        return sum;
    }
}
