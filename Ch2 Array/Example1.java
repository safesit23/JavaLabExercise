package JavaTutor;
public class Example1 {
    public static void main(String[] args) {
        System.out.println("QUESTION1");
        int[] num1=new int[4];
        for(int i=0;i<num1.length;i++){
            num1[i]=i+1;
        }
        for(int show:num1){
            System.out.print(show);
        }
        System.out.println("\n");
        
        //Question2
        System.out.println("QUESTION2");
        int[] num2=num1;
        int[] sum=new int[num2.length];
        for(int i=0;i<sum.length;i++){
            sum[i]=num1[i]+num2[i];
        }
        for(int show:sum){
            System.out.print(show);
        }
        System.out.println("\n");
        
        //Question3
        System.out.println("QUESTION3");
        int[] num3={10,20,30,40};
        int[] num4={2,4};
        int[] sumation;
        if(num3.length>num4.length){
            sumation=new int[num3.length];
            for(int i=0;i<num4.length;i++){
                sumation[i]=num3[i]+num4[i];
            }
            for(int i=num4.length;i<num3.length;i++){
                sumation[i]=num3[i];
            }
            
        }else{
            sumation=new int[num4.length];
            for(int i=0;i<num3.length;i++){
                sumation[i]=num3[i]+num4[i];
            }
            for(int i=num3.length;i<num4.length;i++){
                sumation[i]=num4[i];
            }
        }
        for(int show:sumation){
            System.out.print(show+" ");
        }
        System.out.println("\n");
    }
}
