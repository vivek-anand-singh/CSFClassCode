package Threads;
public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello SST , Pritnted by : " + Thread.currentThread().getName());

        // Create the task
        HelloSSTPrinter task = new HelloSSTPrinter();

        // Create the thread
        // Assign the task to the thread
        Thread thread = new Thread(task);

        // Start the thread
        thread.start(); 

        System.out.println("Hello SST , Pritnted by : " + Thread.currentThread().getName());
    }
}