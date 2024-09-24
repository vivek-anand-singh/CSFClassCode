package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Object> store;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Object> store, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    
    @Override
    public void run() {
        while ( true )
        {
            try 
            {
                producerSemaphore.acquire();
            } 
            catch (InterruptedException e) 
            {
                throw new RuntimeException(e);
            }
            System.out.println(this.name + " is producing an item. Size of store: " + store.size()); 
            store.add(new Object());   
            consumerSemaphore.release();        
        }
    }
    
}
