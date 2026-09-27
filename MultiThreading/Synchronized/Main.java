package Synchronized;


public class Main {
    public static void main(String args[]) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1=  new Thread(() -> {
            // Synchronized block
            synchronized (counter){
                for(int i = 0 ; i < 10; i++){
                    counter.increment();
                    System.out.println("Thread : "+ Thread.currentThread().getName());
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2=  new Thread(() -> {
            synchronized (counter){
                for(int i = 0 ; i < 10 ; i++){
                    counter.increment();
                    System.out.println("Thread : "+ Thread.currentThread().getName());
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();



        t1.join();
        t2.join();


        System.out.println("Execution Completed Successfully");


        System.out.println("Synchronized Mehtod");

        t1 = new Thread (()->{
            counter.decrement();
        });

        t2 = new Thread(() ->{
            counter.decrement();
        });

        t1.start();
        t2.start();

    }
}
