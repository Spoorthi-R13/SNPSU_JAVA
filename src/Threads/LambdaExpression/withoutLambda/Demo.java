package Threads.LambdaExpression.withoutLambda;

interface Greeting{
    void sayHello();
}

public class Demo {
    static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override //this is annotation , we use this to say JVM that it should override this function only
            public void sayHello() {

                System.out.println("Hello World");
            }
        };
        g.sayHello();
    }
}
