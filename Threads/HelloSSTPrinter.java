package Threads;
public class HelloSSTPrinter implements Runnable
{
    @Override
    public void run() 
    {
        System.out.println("Hello SST , Pritnted by : " + Thread.currentThread().getName());
    }
    
}
