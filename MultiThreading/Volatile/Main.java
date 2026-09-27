package Volatile;

public class Main {
    public static volatile boolean flag = true;
    public static void main(String args[]){

        Thread t1 = new Thread(()-> {
            while(flag){
                System.out.println("T1 is Running");
            }
        });


        Thread t2 = new Thread(() -> {

            flag = false;
        });

        t1.start();
        t2.start();

    }
}
