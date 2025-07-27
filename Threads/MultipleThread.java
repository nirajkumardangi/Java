class MyThread1 extends Thread {
    @Override
    public void run() {
        // Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds to simulate work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class MultipleThread {
    public static void main(String[] args) {
        // Create two thread instances
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        // Start both threads
        thread1.start();
        thread2.start();
    }
}
