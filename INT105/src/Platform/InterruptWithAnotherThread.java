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

    private static class MessageLoop implements Runnable {
        public void run() {
            try {
                int i=0;
                while(true){
                    threadMessage(""+i);
                    i++;
                    Thread.sleep(1000);
                }
               
            } catch (InterruptedException e) {
                threadMessage("OKAY !");
            }
        }
    }


    public static void main(String args[]) throws InterruptedException {
        threadMessage("-------------START-------------");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());   //Object t
        t.start(); //เริ่มการทำงาน
        Scanner input = new Scanner(System.in);
        input.nextLine(); //รอการพิมพ์เพื่อรันต่อ
        t.interrupt();    //Interrupt t
        t.join();
        threadMessage("BYE BYE!");
    }
}
