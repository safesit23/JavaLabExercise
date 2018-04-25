/*เขียนโปรแกรมโดยให้มี 
Threads 1 - แสดงตัวเลขไปเรื่อยๆ
Threads 2 - รอรับข้อความ 
เมื่อรับแล้วThread 1 จะหยุดการทำงานทันที
*/

import java.util.Scanner;

public class InterruptWithAnotherThread{
    //print name of thread
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class NumberLoop implements Runnable {
        public void run() {
            int i=0;
            try {
                while(true){
                    threadMessage(Integer.toString(i));
                    Thread.sleep(1000);
                    i++;
                }
               
            } catch (InterruptedException e) {
                threadMessage("OKAY !");
            }
        }
    }


    public static void main(String args[]) throws InterruptedException {
        threadMessage("-------------START-------------");
        Thread t = new Thread(new NumberLoop());   //Object t
        t.start(); //เริ่มการทำงาน
        System.in.read();   //รับค่ามา
        input.nextLine(); //รอการพิมพ์เพื่อรันต่อ
        t.interrupt();    //Interrupt t
        t.join();           //รอให้จบการทำงานจริงๆ
        threadMessage("BYE BYE!");
    }
}
