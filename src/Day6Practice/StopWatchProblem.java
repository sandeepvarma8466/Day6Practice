package Day6Practice;

import javax.xml.stream.events.StartDocument;
import java.util.Random;

public class StopWatchProblem {
    public static void main(String[] args) {
         long first = System.currentTimeMillis();
         System.out.println(first);
         for (int i=0;i<15;i++){
             Thread thread = new Thread(new Runnable() {
                 @Override
                 public void run() {
                     System.out.println("Thread");
                 }
             });
             thread.start();
         }
         long last = System.currentTimeMillis();
        System.out.println((last-first)/60f);
    }
}
