package Threads.WaysOfCreatingThreads.RunnableInterface.Ex2;

class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread" + i);
        }
    }
}

    public class Demo {
        public static void main(String[] args) {
           MyTask obj = new MyTask();
            Thread t1 = new Thread(obj);
            t1.start();//thread t1 is created and runs run function
            for(int i=0;i<5;i++){
                System.out.println("MainThread" +i);
            }

        }

    }
