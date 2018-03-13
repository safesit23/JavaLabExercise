package ch7exception;







public class ExceptionHandler {
    public static double divideByzero(int dividend, int divider)throws ArithmeticException {
        System.out.println("-------divideByzero begin-------");
        double result=0;
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
            answer=divideByzero(5,0);    //throw ArithmetricException()
        }
        catch(Exception ae){
           ae.printStackTrace();
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
