package OOPs.Abstraction.Constructor;

abstract class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound(){
        System.out.println("Dog barks");
    }
}
class Driver{
    public static void main(String[] args) {
        Dog d =new Dog();
        d.sound();// first calls Dog constructor but because dog has parent class animal so animal is called first then dog bcz object name and class name is same (dog)
    }
}
/* why does abstract class have constructor?
-> Constructors are used for initializing common data
-> when a child class object is created ,the parent cls constructor runs first
->parent constructor is getting exectued bcz of inheritence not bcz of object creation
 */