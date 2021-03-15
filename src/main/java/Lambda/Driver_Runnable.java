package Lambda;

/*
* Lamdas are used to implement functional interfaces(Single abstract methods-SAM)
*
* */
public class Driver_Runnable {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();


        //Java 8 - Lambda Syntax

        // ()->{}
        //assigning a lambda to a variable.

        Runnable runnableLambda = () -> {System.out.println("Inside Runnable 2");};
        //multi statemnets we have to use {....}
        Runnable runnableLambdaMultiStatements = () -> {
            System.out.println("Inside Runnable 3");
            System.out.println("Inside Runnable 3");
        };

        Runnable runnableLambdaSimple = () -> System.out.println("Inside Runnable 3");


        new Thread(runnableLambda).start();
        new Thread(runnableLambdaMultiStatements).start();
        new Thread(runnableLambdaSimple).start();
        //legacy code
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3");
            }
        }).start();
        //new lambda
        new Thread(() -> System.out.println("Inside Runnable 4")).start();

    }
}
