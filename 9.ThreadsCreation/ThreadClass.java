// Creating Threads in Java: By Extending the Thread Class

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create a new thread
        t1.start(); // Start the new thread
    }
}
