package Day11.Test;

public class ThreadTwo extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadTwo --" + i);
        }

    }

    public static void main(String[] args) {
        new Thread(new ThreadTwo()).start();
    }
}
