package Threads.Synchronization.withOutSync;

class Counter{
    int count=1000;

   synchronized void increment(){
        count++;
    }
}
public class Demo {
    static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread( () ->{
          for(int i =0; i<1000 ; i++){
              c.increment();
          }
        });

        Thread t2 = new Thread( () ->{
            for(int i =0; i<1000 ; i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println("count : "+c.count);

    }
}
