class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
        public static void main(String[] args){ 
        MyThread t1 = new Thread();
        t1.start();
    }
}
