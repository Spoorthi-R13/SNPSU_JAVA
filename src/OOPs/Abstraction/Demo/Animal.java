package OOPs.Abstraction.Demo;

abstract class Animal {
    abstract void sound(); // abstract methods dont have body {}

    void run(){ //Partial abstraction
        System.out.println("Running");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("Roars");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Driver{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();

       Cat c=new Cat();
       c.sound();
       c.run();
    }
}