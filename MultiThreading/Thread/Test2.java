package Thread;

public class Test2 extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Test 2 executed by : "+Thread.currentThread().getName());
            try{
                Thread.sleep(300);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
