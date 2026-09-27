What is MultiThreading ? 
MultiThreading is a concept using which we can perform multiple task simultaneoulsy/parallely.

What is Thread ?
A Thread is a small unit which is used to perform a specific Task. 

Thread Life Cycle
->>               
                       New 
                        |
                     Runnable 
                        |
                     Running
          |                           |
blocked/Waiting/Sleep   ,        Terminated




There are two ways to achieve multithreading in Java 
1] Thread Class
2] Runnable Interface


-> In Thread Class We extends the Thread class and override the run method, 
Internally Thread class also implements Runnable interface.
Thread Class provides multiple methods such as Thread.currentThread(), getName(),
getPriority(), setPriority(), isDaemon(), and Many more...

There is limitation of using Thread Class instead of Runnable interface. 
As we all know java does not support multiple Inheritence, 
If we extends Thread class then that class could not able to extend any other class.



-> Runnable Interface solves the multiple Inheritence problem as 
we can implement multiple interface. 
We can achieve Multithreading by passing the class object(implements Runnabale interface) to the Thread class while creating its object 

Ex : Thread t1 = new Thread(Runnable object);

The start() method is used to create a thread and it calls the run method internally.

Now the Problem with multithreading is, it gives inconsistent data, or we can say there is no atomicity.
To solve this, We can Use Synchronized Keywords or Locks 

What is Lock ? 
A Lock is Used to restrict mulitple thread to process on same Resource parallely

Example : Suppose Thread1 locked Resource1, then no other thread can use Resource1 until and unless Thread1 executes its task and release the resource


Sometimes if this locking mechanism is not used properly it can lead to Deadlock situation.




What is Deadlock ? 
Deadlock is a situation where multiple thread share common resources and
are dependent on other resources to completes its task which are already occupied by another Thread
and forms the cycle.

Ex :    Thread1 ->  Resource1 
        Thread2 -> Resource2

Here Thread1 have Resource 1, and Thread2 have Resource 2
but to Complete its task Thread1 requires Resource2 and Thread2 requires Resource1

So it forms a dependency cycle, this situation is known as Deadlock 



What is Solution for Deadlock ?
We can prevent this situation by making sure the order is maintained for locking the shared resources 


For Example : if Thread1 and Thread2 both want Resource1 and Resource2 
Then we both should try to lock specific resource first,
e.g.  Thread1 and Thread2 both should try to lock Resoure1 first or Resource2 first. 
It should not be like Thread1 locked Resource1 and Thread2 locked Resource2 





What is Synchronized ? 
We can use synchronized keyword for variable, block or method. 
When we use synchronized that particular section can only be accessed by one Thread at a Time.




What is Volatile ? 

Volatile is a Keyword we use to update Other Threads about the change happened in the Shared Variable. 

Without volatile keyword, if theres a shared variable and if Thread1 updates that variable Thread2 will be unaware of it.

Why so ? So suppose if pc have 2 core,and Thread1 is created in core1 and Thread2 is created in core2.
Now both will not read the value of shared variable again and again from RAM as it is Time Consuming.
So both will have a cache memory and it will read data from there.
Now if Thread1 update data of shared variable it will reflected in its cache, and Thread2 will be unaware of it. 
So when we use volatile keyword it will update the RAM and Thread2 cache immediately about the change. 

Therefore, if there is shared resource and if we want each thread should know change immediately we can use volatile keyword.





Nowadays, we don't use Thread class to create multiple threads, because it is hard to maintain and create multiple thread objects and also reusability problem.
So we use ExecutorService instead 

ExecutorService creates a Threadpoll of Fixed Size and use the same thread again and again throughout the program as soon as its complete the task.
It has method such as submit() or execute() which takes Runnable object as a Parameter.
The submit method also take Callable object as Parameter 

There Difference between runnable and callable is that runnable returns Null whereas callable returns Future<?> object







 
      
  