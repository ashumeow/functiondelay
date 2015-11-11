// Goal-1
// let functiondelay, functiondelay2, functiondelay3, functiondelay4 and functiondelay5 be five functions
// None of the functions have parameters

// Goal-2
// Every function is dependent on one another
// Add time delays where one function must wait till the previous function gets completed
// Time delay logic = functiondelay -> functiondelay2 -> functiondelay3 -> functiondelay4 -> functiondelay5

// deliverables
// no test values should be added in any class
// submit output with screenshots

// Must have prior knowledge in,
// 1. classes
// 2. methods
// 3. objects
// 4. multithreading

import java.lang.*;
// function 1
public class functiondelay {
    functiondelay() {
        // do nothing
    }
    void functiondelay_method() {
        System.out.println("function1 exited. \n");
    }
    public static void main(String[] args) {
        functiondelay f1 = new functiondelay();
        f1.functiondelay_method();

        functiondelay2 f2 = new functiondelay2();
        f2.functiondelay_method2();

        functiondelay3 f3 = new functiondelay3();
        f3.functiondelay_method3();

        functiondelay4 f4 = new functiondelay4();
        f4.functiondelay_method4();

        functiondelay5 f5 = new functiondelay5();
        f5.functiondelay_method5();
    }
}

// function 2
class functiondelay2 {
    functiondelay2() {
        // do nothing
    }
    void functiondelay_method2() {
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
}

// function 3
class functiondelay3 {
    functiondelay3() {
        // do nothing
    }
    void functiondelay_method3() {
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
}

// function 4
class functiondelay4 {
    functiondelay4() {
        // do nothing
    }
    void functiondelay_method4() {
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
}

// function 5
class functiondelay5 {
    functiondelay5() {
        // do nothing
    }
    void functiondelay_method5() {
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
}

// Submitted by Aswini.S