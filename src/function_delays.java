// single class with multiple functions

import java.lang.*;
public class function_delays {
    function_delays() {
        // do nothing
    }
    void functiondelay() {
        System.out.println("function1 exited. \n");
    }

    void functiondelay2() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Time delay begins for function2..." +i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function2 exited in 10 seconds. \n");
    }

    void functiondelay3() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Time delay begins for function3..." +i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function3 exited in 10 seconds. \n");
    }

    void functiondelay4() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Time delay begins for function4..." +i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("function4 exited in 10 seconds. \n");
    }

    void functiondelay5() {
        // adding time delays
        for(int i=0; i<10; i++) {
            System.out.println("Time delay begins for function5..." +i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }

        System.out.println("function5 exited in 10 seconds. \n");
    }

    public static void main(String[] args) {
        function_delays f1 = new function_delays();
        f1.functiondelay();

        function_delays f2 = new function_delays();
        f2.functiondelay2();

        function_delays f3 = new function_delays();
        f3.functiondelay3();

        function_delays f4 = new function_delays();
        f4.functiondelay4();

        function_delays f5 = new function_delays();
        f5.functiondelay5();
    }
}

// Submitted by Aswini.S