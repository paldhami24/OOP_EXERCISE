class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println(i);
        }
    }
}

public class p24 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {}

        t2.start();
        try {
            t2.join();
        } catch (Exception e) {}

        t3.start();
    }
}
