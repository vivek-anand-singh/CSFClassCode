package ExecutorService;
public class NumberPrinter implements Runnable {

    private int number;

    public NumberPrinter(int number)
    {
        this.number = number;
    }
    @Override
    public void run() 
    {
        System.out.println(this.number+" Printed By "+Thread.currentThread().getName());
    }
    
}
