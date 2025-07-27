// Creating Threads in Java: By Implementing the Runnable Interface

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface.");
    }
}

public class ThreadByRunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(); // Creating a Runnable object
        Thread t1 = new Thread(myRunnable); // Create a thread with runnable
        t1.start(); // Start the thread
    }
}
