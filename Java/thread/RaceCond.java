class Counter extends Thread {
    static int count = 0;

    static synchronized void increment() {
        count++;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            increment();
        }
    }
}


public class RaceCond {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count = " + Counter.count);
    }
}
