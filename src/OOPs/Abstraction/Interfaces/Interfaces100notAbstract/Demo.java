package OOPs.Abstraction.Interfaces.Interfaces100notAbstract;
//why interfaces are not 100% abstract
public interface Demo {
    void show(); //Abstract method

    default void display(){
        System.out.println("Default Method");
    }
    static void message(){
        System.out.println("Static Method");
    }
}
class Test implements Demo{
    public void show(){
        System.out.println("Test");
    }
}
class Driver{
    public static void main(String[] args) {
        Demo.message();
        Test t =new Test();
        t.display();
        t.show();
    }
}