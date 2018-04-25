import java.util.Scanner;

public class PrintNumberByTwoThread {
    //print name of thread
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class EventNumber implements Runnable {
        public void run() {
            try {
                Thread.sleep(1000);
                for(int i=2;i<=10;i=i+2){
                    threadMessage(Integer.toString(i));
                    Thread.sleep(2000);
                }
               
            } catch (InterruptedException e) {
                threadMessage("OKAY !");
            }
        }
    }
    
    private static class OddNumber implements Runnable {
        public void run() {
            try {
                for(int i=1;i<=9;i=i+2){
                    threadMessage(Integer.toString(i));
                    Thread.sleep(2000);
                }
               
            } catch (InterruptedException e) {
                threadMessage("OKAY !");
            }
        }
    }


    public static void main(String args[]) throws InterruptedException {
        threadMessage("-------------START-------------");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new OddNumber());   //Object t
        Thread t2 = new Thread(new EventNumber());   //Object t
        t.start(); //เริ่มการทำงานเลขคี่
        t2.start(); //เริ่มการทำงานเลขคู่
        t.join();   //รอให้ทำงานเสร็จ
        t2.join();  //รอให้ทำงานเสร็จ
        threadMessage("BYE BYE!");
        
        /*
        เมื่อกำหนดให้เวลา sleep น้อย
        เราไม่สามารถกำหนดได้ว่าให้ Thread ไหนใช้งานก่อน เราไม่รู้ว่าอีกตัวจะได้ทำตอนไหน
        เราไม่รู้ลำดับจริงๆเมื่อทำงานควบคู่กันไป
        */
    }
}
