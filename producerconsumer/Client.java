package producerconsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        int maxSize = 6;
    
        Queue<Object> store = new ArrayDeque<>();

        Producer p1 = new Producer(store, maxSize, "P1");
        Producer p2 = new Producer(store, maxSize, "P2");
        Producer p3 = new Producer(store, maxSize, "P3");
        Producer p4 = new Producer(store, maxSize, "P4");

        Consumer c1 = new Consumer(store, maxSize, "C1");
        Consumer c2 = new Consumer(store, maxSize, "C2");
        Consumer c3 = new Consumer(store, maxSize, "C3");

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);

        Thread t5 = new Thread(c1);
        Thread t6 = new Thread(c2);
        Thread t7 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t5.start();
        t6.start();
        t7.start();

    }
}
