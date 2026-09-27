package Runnable;

public class Main {
    public static void main(String args[]){

        // This is How we can create an Object of Class which implements runnable interface and
        // pass that object to Thread class
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);

        t1.start();
        t2.start();

        // Another way of doing  same thing without creating any additional class is by using
        // Lambda Expression

        Thread t3 = new Thread(() -> {
            System.out.println("Test 3 is executed by : "+Thread.currentThread().getName());
        });

        t3.start();
    }
}
