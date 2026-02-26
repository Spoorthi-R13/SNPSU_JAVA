package OOPs.Inheritance;

public class Animal {
    void eat(){
        System.out.println("Eating....");
    }
}
class lion extends Animal{
    void roar(){
        System.out.println("Roaring...");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();

        lion l=new lion();
        l.roar();
    }
}