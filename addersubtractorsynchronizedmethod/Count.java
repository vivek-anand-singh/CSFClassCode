package addersubtractorsynchronizedmethod;

public class Count {
    private int value;

    public synchronized void incrementCount(int value) {
        this.value += value;
    }

    public synchronized void decrementCount(int value) {
        this.value -= value;
    }

    public int getValue() {
        return value;
    }
}