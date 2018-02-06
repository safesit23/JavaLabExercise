package Platform;
public class FloatingPoint {
    public static void main(String[] args) {
        //Floating Point
        System.out.println("Floating Point");
        float myFloat;
        myFloat=1.23456789f;
        System.out.println("value of myFloat stored = "+myFloat);
        myFloat=12.23456789f;
        System.out.println("New value of myFloat = "+myFloat);
        
        //Cancellation Error 
        System.out.println("\nCancellation Error ");
        float highFloat=Float.MAX_VALUE;
        System.out.println("value of highFloat stored = "+highFloat);
        highFloat=highFloat*2;
        System.out.println("New value of highFloat = "+highFloat);
        
        //Float Underflow
        System.out.println("\nFloat Underflow ");
        float lowFloat=Float.MIN_VALUE;
        System.out.println("value of lowFloat stored = "+lowFloat);
        lowFloat=lowFloat/2;
        System.out.println("New value of lowFloat = "+lowFloat);
        
        //Infinity/Nan
        System.out.println("\nInfinity/Nan");
        float divFloat1=(float)1/0;
        float divFloat2=(float)0/0;
        float sqrtFloat=(float) Math.sqrt(-1);
        System.out.println("2.Value of divFloat1 = "+divFloat1);
        System.out.println("3.Value of divFloat2 = "+divFloat2);
        System.out.println("4.Value of sqrtFloat = "+sqrtFloat);
        System.out.println("5.Variables\tis NaN");
        System.out.println("divFloat1:\t"+(divFloat1 != divFloat1)+"\t"+(Float.isNaN(divFloat1)));
        System.out.println("divFloat2:\t"+(divFloat2 != divFloat2)+"\t"+(Float.isNaN(divFloat2)));
        System.out.println("sqrtFloat:\t"+(sqrtFloat != sqrtFloat)+"\t"+(Float.isNaN(sqrtFloat)));
        
        
    }
}
