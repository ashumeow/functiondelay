import java.lang.*;
public class FunctionDelays {
    FunctionDelays() {
        // do nothing
    }
    void functiondelay() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Starts Loading...\n");
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function1 exited in 10 seconds. \n");
    }

    void functiondelay2() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Loading...\n");
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function2 exited in 20 seconds. \n");
    }

    void functiondelay3() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Loading...\n");
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function3 exited in 30 seconds. \n");
    }

    void functiondelay4() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Loading...\n");
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function4 exited in 40 seconds. \n");
    }

    void functiondelay5() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Loading...\n");
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }

        System.out.println("function5 exited in 50 seconds. \n");
    }

    public static void main(String[] args) {
        FunctionDelays f = new FunctionDelays();
        f.functiondelay();
        f.functiondelay2();
        f.functiondelay3();
        f.functiondelay4();
        f.functiondelay5();
    }
}

// Submitted by Aswini.S