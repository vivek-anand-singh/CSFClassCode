package NumberPrinter1to100;

import ExecutorService.NumberPrinter;

public class Client {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i++)
        {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
