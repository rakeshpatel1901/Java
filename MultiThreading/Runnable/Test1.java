package Runnable;

public class Test1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Test 1 executed by : "+Thread.currentThread().getName());
            try{
                Thread.sleep(300);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
