package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Object> store, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    
    @Override
    public void run() {
        while(true)
        {
            try 
            {
                consumerSemaphore.acquire();
            } 
            catch (InterruptedException e) 
            {
                throw new RuntimeException(e);
            }
            System.out.println(this.name + " is consuming an item. Size of store " + store.size());
            store.remove();
            producerSemaphore.release();
        }
    }
    
}
