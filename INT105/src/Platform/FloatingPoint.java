package Platform;
public class FloatingPoint {
    public static void main(String[] args) {
        //Floating Point
        //เก็บได้ทั้งหมด 8 ตำแหน่ง
        System.out.println("1.Floating Point");
        float myFloat;  
        myFloat=1.23456789f;       
        System.out.println("value of myFloat stored = "+myFloat);   //เลขถูกปัด
        myFloat=12.23456789f;
        System.out.println("New value of myFloat = "+myFloat);  //เลขถูกปัด
        
        //Cancellation Error 
        //ผลลัพธ์ที่ใช้ float กับ double แตกต่างกัน
        System.out.println("\n2.Cancellation Error ");
        float result1=1+1.234e-5f-1;    //e-5 คือ 10 กำลัง-5
        double result2=1+1.234e-5f-1;
        System.out.println("Value of 1 + 1.234e-5f - 1 in float = \t"+(result1));
        System.out.println("Value of 1 + 1.234e-5f - 1 in double = \t"+(result2));
        
        //Float Overflow
        System.out.println("\n3.Float Overflow ");
        float highFloat=Float.MAX_VALUE;
        System.out.println("value of highFloat stored = "+highFloat);
        highFloat=highFloat*2;  //Infinity
        System.out.println("New value of highFloat = "+highFloat);
        
        //Float Underflow
        System.out.println("\n4.Float Underflow ");
        float lowFloat=Float.MIN_VALUE;
        System.out.println("value of lowFloat stored = "+lowFloat);
        lowFloat=lowFloat/2;    //ได้ 0 (Underflow)
        System.out.println("New value of lowFloat = "+lowFloat);
        
        //Infinity/Nan
        System.out.println("\n5.Infinity/Nan");
        float divFloat1=(float)1/0; //Infinity
        float divFloat2=(float)0/0;
        float sqrtFloat=(float) Math.sqrt(-1);
        System.out.println("5.2.Value of divFloat1 = "+divFloat1);
        System.out.println("5.3.Value of divFloat2 = "+divFloat2);
        System.out.println("5.4.Value of sqrtFloat = "+sqrtFloat);
        System.out.println("5.5.Variables\tis NaN");  //ค่าไม่เท่ากับตัวมันเองหรือเป็น Nan
        System.out.println("divFloat1:\t"+(divFloat1 != divFloat1)+"\t"+(Float.isNaN(divFloat1)));
        System.out.println("divFloat2:\t"+(divFloat2 != divFloat2)+"\t"+(Float.isNaN(divFloat2)));
        System.out.println("sqrtFloat:\t"+(sqrtFloat != sqrtFloat)+"\t"+(Float.isNaN(sqrtFloat)));
        
        
    }
    //60130500009 by Safe
}
