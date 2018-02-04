import java.util.Scanner;
public class FactorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numX;
        System.out.print("Enter number: ");
        numX=input.nextInt();				
        if(primeNum(numX)&&true){				
            System.out.println(numX+" = "+"1 x "+numX);	
        }else{
            factorNum(numX);
        }

    }
    public static void factorNum(int factor){
        int devide = 2;
        while (factor != 1) {
            if (factor % devide == 0) {
                factor = factor/devide;
                System.out.print(devide + " X ");
            } else {
                devide++;
            }
        }
        System.out.print("\b\b");
    }
    
    public static boolean primeNum(int numX){	
        int limitNum=2;				
        boolean primeNum=true;		
        while(limitNum<numX){		
        if(numX%limitNum==0){				
        primeNum=false;break;				
        }
        limitNum++;
        }
        return primeNum;			
    }
}
