package ch7exception;

public class ExceptionHandler {
    public static double divideByzero(int dividend, int divider)
            throws ArithmeticException, NegativeDividerException {
        System.out.println("-------divideByzero begin-------");
        double result=0;
        
        if(divider<0)
            throw new NegativeDividerException("Negative Divider");
        
        result=dividend/divider;
        
        
        
        /*try{
            result=dividend/divider;    //throw ArithmetricException()
            System.out.println("Try block");
        }
        catch(Exception ae){
           ae.printStackTrace();
        }
        finally{
            System.out.println("finally #1");
            System.out.println("finally #2");
        }
        */
        System.out.println("-------divideByzero end-------");
        return result;
    }
    
    public static double doSomeThing(){
        System.out.println("-------doSomeThing begin-------");
        double answer=0;
       try{
            answer=divideByzero(5,-2);    //throw ArithmetricException()
        }
        catch(ArithmeticException ae){
           ae.printStackTrace();
        }
       catch(NegativeDividerException ae){
           System.out.println("NEGATIVE Catch Working: "+ae.getMessage());
       }
        finally{
            System.out.println("finally #1");
            System.out.println("finally #2");
        }
        System.out.println("-------doSomeThing end-------");
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println("-------main begin-------");
        double dividedResult=doSomeThing();
        System.out.println("Result="+dividedResult);
        System.out.println("-------main end------");
    }
}
