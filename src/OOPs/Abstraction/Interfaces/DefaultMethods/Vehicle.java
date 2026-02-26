package OOPs.Abstraction.Interfaces.DefaultMethods;

public interface Vehicle {
    void start();

    default void stop(){
        System.out.println("Engine Stopped!....");

    }
}


class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started!");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW has started!");
    }
}
class RolceRoyce implements Vehicle{
    public void start(){
        System.out.println("RolceRoyce has started!");
    }
}
class Driver{
    static void main(String[] args) {
        Audi a =new Audi();
        a.start();
        a.stop(); // defualt method is accessed
    }
}