package Threads.LambdaExpression.withRunnableInterface.NewWay;

public class Demo {
    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> System.out.println("My TAsk 1"));
        Thread t2 = new Thread(() -> {
            for(int i=0 ; i<10 ; i++){
                System.out.println("My Task 2 is running: "+i);
            }
        });
        t1.start();
        t2.start();
    }
}
