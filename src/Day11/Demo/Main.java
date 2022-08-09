package Day11.Demo;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        ThreadRandom rand = new ThreadRandom(sharedData);
        Thread2  thread2= new Thread2(sharedData);
        Thread3  thread3= new Thread3(sharedData);
        rand.start();
        thread2.start();
        thread3.start();

    }
}
