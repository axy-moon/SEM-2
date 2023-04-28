class ThreadA extends Thread {
    public void run() {
        System.out.println("Thread Name: "+ Thread.currentThread().getName());
        System.out.println("Priority: "+ Thread.currentThread().getPriority());
    }
}

public class PriorityEx {

    public static void main(String args[]) {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        ThreadA t3 = new ThreadA();
        Thread t4 = new ThreadA();

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setName("Thread 1");

        t2.setPriority(Thread.NORM_PRIORITY);
        t2.setName("Thread 2");

        t3.setPriority(Thread.MAX_PRIORITY);
        t3.setName("Thread 3");

        t4.setPriority(6);
        t4.setName("Thread 4");


        t2.start();
        t1.start();
        t3.start();
        t4.start();




    }
}