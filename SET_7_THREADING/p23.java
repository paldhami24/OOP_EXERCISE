class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class p23 {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        t1.start();
        t2.start();
    }
}
