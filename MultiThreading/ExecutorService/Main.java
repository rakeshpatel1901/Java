package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String args[]){

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() ->{
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Task1 : Thread : " + Thread.currentThread().getName());
                try{
                    Thread.sleep(300);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(()-> {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Task2 : Thread : " + Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


        executorService.execute(()-> {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Task3 : Thread : " + Thread.currentThread().getName());
                try{
                    Thread.sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(()-> {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Task4 : Thread : " + Thread.currentThread().getName());
                try{
                    Thread.sleep(300);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


        // You can observe here that the Application does not Stop after completing the Task because the
        // thread are still alive, so we have to close the Executor Service

        executorService.shutdown();

    }
}
