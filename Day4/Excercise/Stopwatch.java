package Day4.Excercise;

import java.text.SimpleDateFormat;
import java.util.Date;

class InforWatch {

  private long startTime;
  private long endTime;
  private boolean running = false;

  public InforWatch() {}

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }

  public InforWatch(long startTime) {
    this.startTime = startTime;
  }

  public void start() {
    this.startTime = System.nanoTime();
    this.running = true;
  }

  //elaspsed time in milliseconds
  public long getElapsedTime() {
    long elapsed;
    if (running) {
      elapsed = (System.nanoTime() - startTime);
    } else {
      elapsed = (endTime - startTime);
    }
    return elapsed;
  }


  public void stop() {
    this.endTime = System.nanoTime();
    this.running = false;
  }
}

public class Stopwatch {

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[index]) {
          index = j; //searching for lowest index
        }
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    InforWatch inforwatch = new InforWatch();
    inforwatch.start();
    int number[] = new int[100000];
    for (int i = 0; i < 100000; i++) {
      number[i] = (int) (Math.random() * 100);
    }
    selectionSort(number);
    inforwatch.stop();
    System.out.println("Run time is : " + inforwatch.getElapsedTime()+ " milliseconds");
  }
}
