package Synchronized;

public class Counter {
    int count = 0 ;

    public void increment(){
        count++;
        System.out.println("Count : "+count);
    }


    // synchronized Method
    public synchronized void decrement(){
        for(int i = 0 ; i < 5 ; i++){
            count--;
            System.out.println("Count : "+ count);
            System.out.println("Thread : "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
