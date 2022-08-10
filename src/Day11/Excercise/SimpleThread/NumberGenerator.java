package Day11.Excercise.SimpleThread;

import java.util.Random;

public class NumberGenerator implements Runnable{
    public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10 ; i++) {
                System.out.println("Thread start : " + this.hashCode());
            }
    }
}
