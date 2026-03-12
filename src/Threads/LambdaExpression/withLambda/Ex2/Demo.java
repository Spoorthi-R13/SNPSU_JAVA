package Threads.LambdaExpression.withLambda.Ex2;

import java.sql.SQLOutput;

interface Calculator{
    int add(int a , int b);
}
public class Demo {
    static void main(String[] args) {
        Calculator c  = (a,b) -> a+b; {
            System.out.println("Result : " + c.add(10,30));
        };
    }
}
