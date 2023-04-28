class ThreadA extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("From Thread A with i="+ i);

        }

        System.out.println("Exiting from Thread A...");
    }
}

class ThreadB extends Thread {
    public void run() {
        for(int j=1;j<=5;j++) {
            System.out.println("From Thread B with j=" + j);
        }
        System.out.println("Exiting from Thread B");
    }
}

public class DemoThread {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        b.start();
        
         
    }
}