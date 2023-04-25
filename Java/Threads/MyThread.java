class TP extends Thread {
        public void run(){
            System.out.println("Thread is running");
            
        }
    
}

public class MyThread {
    public static void main(String[] args){
        TP t = new Thread();
        t.start();
    }

}