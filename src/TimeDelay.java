import java.lang.*;
import java.util.*;

public class TimeDelay extends TimerTask {

    TimeDelay() {
        // do nothing
    }
    Timer timer;
    public TimeDelay(int seconds) {
        timer = new Timer();  // new Thread will be created
        timer.schedule(new TimeDelay(), seconds*10000); //delay in milliseconds
    }

    public void run() {
        // do nothing
    }

    public void timedelay1() {
        System.out.println("Function1 exited.");
    }

    public void timedelay2() {
        for (int i = 0; i <= 10; ++i) {
            System.out.printf("Loading... \n", i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }        }
        System.out.println("Function2 exited in 10 seconds.");
        timer.cancel();
    }

    public void timedelay3() {
        for (int i = 0; i <= 10; ++i) {
            System.out.printf("Loading... \n", i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }        }
        System.out.println("Function3 exited in 10 seconds.");
        timer.cancel();
    }

    public void timedelay4() {
        for (int i = 0; i <= 10; ++i) {
            System.out.printf("Loading... \n", i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }        }
        System.out.println("Function4 exited in 10 seconds.");
        timer.cancel();
    }

    public void timedelay5() {
        for (int i = 0; i <= 10; ++i) {
            System.out.printf("Loading... \n", i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }        }
        System.out.println("Function5 exited in 10 seconds.");
        timer.cancel();
    }

    public static void main(String args[]) {
        TimeDelay t = new TimeDelay(10);
        t.timedelay1();
        t.timedelay2();
        t.timedelay3();
        t.timedelay4();
        t.timedelay5();
    }
}