package Threads.LambdaExpression.withLambda;

interface Greeting{
    void sayHello();
}

public class Demo {
    static void main(String[] args) {
         Greeting g = () -> { //lambda func usage (syntax)
                System.out.println("Hello World");
        }; //semicolon mandatory
       g.sayHello();
    }
}
//we can use lambda func with the interface which has only one abstract method
