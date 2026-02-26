package OOPs.Abstraction.StaticMethod;
// A abstarct class can have static methods
abstract class Animal {
    static void info(){ //static method
        System.out.println("Animals are living beings");
    }
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal.info();
        Dog d=new Dog();
        d.sound();

    }
}